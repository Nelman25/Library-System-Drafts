public class Books {
    private String title;
    private String author;
    private String publisher;
    private int numberOfPages;
    private int yearPublished;
    private String language;


    Books(String title, String author, int numberOfPages,String publisher, int yearPublished, String language) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
        this.language = language;
    }
    public String getTitle() {

        return title;
    }
    public String getAuthor() {

        return author;
    }
    public int getNumberOfPages() {

        return numberOfPages;
    }
    public String getPublisher() {
        return publisher;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    public String getLanguage() {
        return language;
    }
}
