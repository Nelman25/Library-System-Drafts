public class Books {
    private String title;
    private String author;
    private String publisher;
    private String numberOfPages;
    private String yearPublished;
    private String language;

    Books(String title, String author, String numberOfPages,String publisher, String yearPublished, String language) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
        this.language = language;
    }
    public String getTitle() {

        return "Title: "+title;
    }
    public String getAuthor() {

        return "Author: "+author;
    }
    public String getNumberOfPages() {

        return "Number of pages: " + numberOfPages;
    }
    public String getPublisher() {
        return "Publisher: "+publisher;
    }
    public String getYearPublished() {
        return "Year published: " + yearPublished;
    }
    public String getLanguage() {
        return "Language: "+ language;
    }
}
