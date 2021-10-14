package cz.osu.student.R19584;

public class Book {
    private Person author;
    private String title;
    private String publisher;
    private String isbn;

    public Book(Person author, String title, String publisher, String isbn) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public Person getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public String getISBN() {
        return this.isbn;
    }

    public String toString() {
        return String.format("Title: %s\nAuthor: %s\nPublisher: %s\nISBN: %s", getTitle(), getAuthor().getFullName(), getPublisher(), getISBN());
    }
}
