package main;

public class Article {

    private String title;
    private String abstractText;
    private String year;
    private String keyword;
    private String references;

    public Article(String title, String abstractText, String year, String keyword, String references) {
        this.title = title;
        this.abstractText = abstractText;
        this.year = year;
        this.keyword = keyword;
        this.references = references;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", abstractText='" + abstractText + '\'' +
                ", year='" + year + '\'' +
                ", keyword='" + keyword + '\'' +
                ", references='" + references + '\'' +
                '}';
    }
}
