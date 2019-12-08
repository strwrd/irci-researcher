package main;

import java.util.ArrayList;

public class MainPage {
    private static MainPage INSTANCE = null;

    private DialogBox DialogBox;
    private InsertMetadataForm insertMetadataForm;
    private ListOfArticle listOfArticle;
    private ProgressBar progressBar;
    private InputField searchField;
    private Button searchButton;
    private Button insertMetadataMenu;

    private MainPage() {
        Message dialogBoxMessage = new Message("Error Message");
        Button dialogBoxCancelButton = new Button("Cancel");
        ArrayList<Article> listOfArticle = new ArrayList<Article>();

        this.DialogBox = new DialogBox(dialogBoxMessage, dialogBoxCancelButton);
        this.insertMetadataForm = new InsertMetadataForm();
        this.listOfArticle = new ListOfArticle(listOfArticle);
        this.progressBar = new ProgressBar();
        this.searchField = new InputField();
        this.searchButton = new Button("Search");
        this.insertMetadataMenu = new Button("Insert Metadata Menu");
    }

    public static MainPage getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new MainPage();
        }
        return INSTANCE;
    }

    public InsertMetadataForm getInsertMetadataForm(){
        return this.insertMetadataForm;
    }

    public DialogBox getDialogBox(){
        return this.DialogBox;
    }

    public InputField getSearchField(){
        return this.searchField;
    }

    public ListOfArticle getListOfArticle(){
        return this.listOfArticle;
    }

}
