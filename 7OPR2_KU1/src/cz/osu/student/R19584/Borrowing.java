package cz.osu.student.R19584;

public class Borrowing {
    private int id;
    private Book book;
    private Person person;
    private DateTime borrowed_since;
    private DateTime borrowed_until;

    public Borrowing(int id, Book book, Person person, DateTime borrowed_since, DateTime borrowed_until) {
        this.id = id;
        this.book = book;
        this.person = person;
        this.borrowed_since = borrowed_since;
        this.borrowed_until = borrowed_until;
    }

    public int getId() {
        return this.id;
    }

    public Book getBook() {
        return this.book;
    }

    public Person getPerson() {
        return this.person;
    }

    public DateTime getBorrowed_since() {
        return this.borrowed_since;
    }

    public DateTime getBorrowed_until() {
        return this.borrowed_until.copy();
    }

    public void setBorrowed_until(DateTime borrowed_until) {
        this.borrowed_until = borrowed_until;
    }

    public java.lang.String toString() {
        return String.format("Borrowing #%d:\nBook: %s (ISBN %s)\nPerson: %s\nBorrowed since: %s\nBorrowed until: %s\n",
                getId(), getBook().getTitle(), getBook().getISBN(), getPerson().getFullName(), getBorrowed_since(), getBorrowed_until());
    }
}
