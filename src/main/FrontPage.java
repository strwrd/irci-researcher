package main;

public class FrontPage {

    private static FrontPage INSTANCE = null;

    private InputField searchField;
    private Button searchButton;
    private ListOfResearcher listOfResearcher;
    private Menu sortByRelevancy;
    private Menu sortByScore;

    private FrontPage() {
        this.searchField = new InputField();
        this.searchButton = new Button("Search");
        this.listOfResearcher = new ListOfResearcher();
        this.sortByRelevancy = new Menu("Sort By Relevancy");
        this.sortByScore = new Menu("Sort By Score");
    }

    public static FrontPage getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new FrontPage();
        }
        return INSTANCE;
    }

    public InputField getSearchField(){
        return this.searchField;
    }

    public ListOfResearcher getListOfResearcher(){
        return this.listOfResearcher;
    }


}
