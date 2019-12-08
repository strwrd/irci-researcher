package main;

import java.util.ArrayList;

public class FrontPageController {
    public void searchButtonOnClick() {
        String keyword = FrontPage.getInstance().getSearchField().getText();

        ProgressBar progressBar = new ProgressBar();
        progressBar.start();

        ArrayList<Researcher> researchers = null;

        try {
            researchers = DBHandler.getInstance().searchResearcher(keyword);
        } catch (Exception e) {
            Message errorMessage =  new Message("No researcher found");
            errorMessage.show();
            return;
        }

        for (Researcher researcher : researchers) {
            ArrayList<Article> articles = DBHandler.getInstance().getResearcherArticle(researcher);
            ListOfArticle listOfArticle = new ListOfArticle(articles);

            ResearcherProfile researcherProfile = new ResearcherProfile(researcher, listOfArticle);
            FrontPage.getInstance().getListOfResearcher().addElement(researcherProfile);
        }

        progressBar.stop();

        FrontPage.getInstance().getListOfResearcher().refresh();
    }

    public void relevantMenuOnClick() {
        String keyword = FrontPage.getInstance().getSearchField().getText();

        FrontPage.getInstance().getListOfResearcher().resetElement();

        ArrayList<Researcher> researchers = DBHandler.getInstance().searchResearcherByRelevancy(keyword);

        for (Researcher researcher : researchers) {
            ArrayList<Article> articles = DBHandler.getInstance().getResearcherArticle(researcher);
            ListOfArticle listOfArticle = new ListOfArticle(articles);

            ResearcherProfile researcherProfile = new ResearcherProfile(researcher, listOfArticle);
            FrontPage.getInstance().getListOfResearcher().addElement(researcherProfile);
        }

        FrontPage.getInstance().getListOfResearcher().refresh();
    }

    public void scoreMenuOnClick() {
        String keyword = FrontPage.getInstance().getSearchField().getText();

        FrontPage.getInstance().getListOfResearcher().resetElement();

        ArrayList<Researcher> researchers = DBHandler.getInstance().searchResearcherByScore(keyword);

        for (Researcher researcher : researchers) {
            ArrayList<Article> articles = DBHandler.getInstance().getResearcherArticle(researcher);
            ListOfArticle listOfArticle = new ListOfArticle(articles);

            ResearcherProfile researcherProfile = new ResearcherProfile(researcher, listOfArticle);
            FrontPage.getInstance().getListOfResearcher().addElement(researcherProfile);
        }

        FrontPage.getInstance().getListOfResearcher().refresh();
    }

    public void removeButtonOnClick(ResearcherProfile researcherProfile, Article article) {
        DBHandler.getInstance().removeArticle(article);
        FrontPage.getInstance().getListOfResearcher().removeArticleFromResearcherProfile(researcherProfile, article);
        FrontPage.getInstance().getListOfResearcher().refresh();
    }

    public void nameOfResearcherMenuOnClick(Researcher researcher) {
        Researcher selectedResearcher =  DBHandler.getInstance().getResearcher(researcher);
        ArrayList<Article> articles = DBHandler.getInstance().getResearcherArticle(researcher);
        ListOfArticle listOfArticle = new ListOfArticle(articles);

        ResearcherProfile researcherProfile = new ResearcherProfile(researcher, listOfArticle);
        researcherProfile.show();
    }

    public void editButtonOnClick(ResearcherProfile researcherProfile) {
        ProfileForm profileForm = FrontPage.getInstance()
                .getListOfResearcher()
                .getResearcherProfile(researcherProfile)
                .getProfileForm();

        profileForm.show();
    }

    public void saveButtonOnClick(ResearcherProfile researcherProfile) {
        String newName = FrontPage.getInstance()
                .getListOfResearcher()
                .getResearcherProfile(researcherProfile)
                .getProfileForm()
                .getNameField()
                .getText();

        ProgressBar progressBar = new ProgressBar();
        progressBar.start();

        Researcher updatedResearcher = DBHandler.getInstance().updateResearcherName(researcherProfile.getResearcher(), newName);
        researcherProfile.setResearcher(updatedResearcher);
        researcherProfile.show();
    }
}
