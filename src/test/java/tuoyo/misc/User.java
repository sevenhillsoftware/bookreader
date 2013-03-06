package tuoyo.misc;

import java.util.List;

public class User {
    private List<String> authors;
    private String publisher;
    private String title;
    private Number year;

    public User() {
        super();
    }

    public List<String> getAuthors() {
        return authors;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public String getTitle() {
        return this.title;
    }

    public Number getYear() {
        return this.year;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(Number year) {
        this.year = year;
    }
}
