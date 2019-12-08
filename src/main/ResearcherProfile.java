package main;

public class ResearcherProfile {

    private ProfileForm profileForm;
    private Researcher researcher;
    private ListOfArticle listOfArticle;
    private Button editButton;

    public ResearcherProfile(Researcher researcher, ListOfArticle listOfArticle) {
        this.profileForm = new ProfileForm();
        this.researcher = researcher;
        this.listOfArticle = listOfArticle;
        this.editButton = new Button("Edit");
    }

    public ListOfArticle getListOfArticle() {
        return this.listOfArticle;
    }

    public void removeArticle(Article article) {
        this.getListOfArticle().removeItem(article);
    }

    public void show() {
        // Display ResearcherProfile as modal
    }

    public ProfileForm getProfileForm(){
        return this.profileForm;
    }

    public Researcher getResearcher() {
        return researcher;
    }

    public void setResearcher(Researcher researcher) {
        this.researcher = researcher;
    }
}
