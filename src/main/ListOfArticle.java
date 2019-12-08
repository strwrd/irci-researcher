package main;

import java.util.ArrayList;

public class ListOfArticle {

    private ArrayList<Article> articles;
    private Button addButton;
    private Button nextButton;
    private Button removeButton;

    public ListOfArticle(ArrayList<Article> articles) {
        this.articles = articles;
        this.addButton = new Button("Add");
        this.nextButton = new Button("Next");
        this.removeButton = new Button("Remove");
    }

    public void updateArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }

    public void removeItem(Article article) {
        this.articles.remove(article);
    }
}
