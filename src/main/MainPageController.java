package main;

import java.util.ArrayList;

public class MainPageController {
    public void insertMetadataMenuOnClick(){
        MainPage.getInstance().getInsertMetadataForm().show();
    }

    public void submitButtonOnClick(){
        MainPage.getInstance().getInsertMetadataForm().hide();

        String[] forms = MainPage.getInstance().getInsertMetadataForm().retrieveForm();


        ProgressBar progressBar = new ProgressBar();
        progressBar.start();

        Article article = new Article(forms[0], forms[1], forms[2], forms[3], forms[4]);

        try {
            DBHandler.getInstance().insertArticle(article);
        } catch (Exception e) {
            MainPage.getInstance().getDialogBox().show();
            return;
        }

        progressBar.stop();

        Message successMessage = new Message("Insertion Article Success");
        successMessage.show();
    }

    public void cancelButtonOnClick() {
        MainPage.getInstance().getDialogBox().hide();
    }

    public void searchButtonOnClick() {
        String keyword = MainPage.getInstance().getSearchField().getText();

        ProgressBar progressBar = new ProgressBar();
        progressBar.start();

        ArrayList<Article> articles = DBHandler.getInstance().searchArticle(keyword);

        progressBar.stop();

        MainPage.getInstance().getListOfArticle().updateArticles(articles);
    }

    public void addButtonOnClick(Article article) {
        Message displayMessage = new Message(article.toString());
        displayMessage.show();
    }

    public void nextButtonOnClick(Article lastArticle) {
        ArrayList<Article> articles = DBHandler.getInstance().nextArticles(lastArticle);
        MainPage.getInstance().getListOfArticle().updateArticles(articles);
    }
}
