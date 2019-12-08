package main;

import java.util.ArrayList;

public class DBHandler {

    private static DBHandler INSTANCE = null;

    private DBHandler(){
        // Do initialization connection
    }

    public void insertArticle(Article article) throws Exception {
        // Do Query
    }

    public ArrayList<Article> searchArticle(String keyword) {
        // Do Query
        return new ArrayList<Article>();
    }

    public ArrayList<Article> nextArticles(Article lastArticle) {
        // Do Query
        // This function must implemented using cursor pagination
        // based on lastArticle to retrieve next article
        return new ArrayList<Article>();
    }

    public ArrayList<Researcher> searchResearcher(String keyword) throws Exception {
        // Do Query
        return new ArrayList<Researcher>();
    }

    public ArrayList<Researcher> searchResearcherByRelevancy(String keyword) {
        // Do Query
        return new ArrayList<Researcher>();
    }

    public ArrayList<Researcher> searchResearcherByScore(String keyword) {
        // Do Query
        return new ArrayList<Researcher>();
    }

    public ArrayList<Article> getResearcherArticle(Researcher researcher) {
        // Do Query
        return new ArrayList<Article>();
    }

    public void removeArticle(Article article) {
        //Do Query
    }

    public Researcher getResearcher(Researcher researcher) {
        // Do Query
        return new Researcher("dummy");
    }

    public Researcher updateResearcherName(Researcher researcher, String newName) {
        // Do Query
        return new Researcher("dummy");
    }

    public static DBHandler getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DBHandler();
        }
        return INSTANCE;
    }
}
