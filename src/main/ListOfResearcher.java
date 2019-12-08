package main;

import java.util.ArrayList;

public class ListOfResearcher {

    private ArrayList<ResearcherProfile> researcherProfiles;

    public ListOfResearcher() {
        this.researcherProfiles = new ArrayList<ResearcherProfile>();
    }

    public void addElement(ResearcherProfile researcherProfile) {
        this.researcherProfiles.add(researcherProfile);
    }

    public void resetElement() {
        this.researcherProfiles = new ArrayList<ResearcherProfile>();
    }

    public void removeArticleFromResearcherProfile(ResearcherProfile researcherProfile, Article article){
        this.researcherProfiles
                .get(researcherProfiles.indexOf(researcherProfile))
                .removeArticle(article);
    }

    public ResearcherProfile getResearcherProfile(ResearcherProfile researcherProfile) {
        return this.researcherProfiles.get((researcherProfiles.indexOf(researcherProfile)));
    }

    public void refresh() {
        // Refresh researcherProfiles content then display it
    }
}
