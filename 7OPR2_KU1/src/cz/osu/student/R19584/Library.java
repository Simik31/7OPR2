package cz.osu.student.R19584;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Person> persons;
    private ArrayList<Borrowing> borrowings;
    private int standardBorrowingPeriod;

    public Library() {
        this.books = new ArrayList<>();
        this.persons = new ArrayList<>();
        this.borrowings = new ArrayList<>();
        this.standardBorrowingPeriod = 31;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void addPerson(Person person) {
        this.persons.add(person);
    }

    public void addBorrowing(Borrowing borrowing) {
        this.borrowings.add(borrowing);
    }

    public void addBook(ArrayList<Book> books) {
        this.books.addAll(books);
    }

    public void addPerson(ArrayList<Person> persons) {
        this.persons.addAll(persons);
    }

    public void addBorrowing(ArrayList<Borrowing> borrowings) {
        this.borrowings.addAll(borrowings);
    }

    public ArrayList<Book> getBooks() {
        return new ArrayList<>(this.books);
    }

    public ArrayList<Borrowing> getBookBorrowings(Book book) {
        ArrayList<Borrowing> ret = new ArrayList<>();

        for (Borrowing borrowing : this.borrowings)
            if (borrowing.getBook() == book)
                ret.add(borrowing);

        return ret;
    }

    public ArrayList<Person> getPersons() {
        return new ArrayList<>(this.persons);
    }

    public ArrayList<Borrowing> getPersonBorrowings(Person person) {
        ArrayList<Borrowing> ret = new ArrayList<>();

        for (Borrowing borrowing : this.borrowings)
            if (borrowing.getPerson() == person)
                ret.add(borrowing);

        return ret;
    }

    public ArrayList<Penalty> getPersonPenalties(Person person) {
        return new ArrayList<>(person.getPenalties());
    }

    public void penalisePerson(Person person, Penalty penalty) {
        person.addPenalty(penalty);
    }

    public ArrayList<Borrowing> getBorrowings() {
        return new ArrayList<>(this.borrowings);
    }

    public ArrayList<Borrowing> getAllBorrowingsThatAreOverdue() {
        ArrayList<Borrowing> ret = new ArrayList<>();

        for (Borrowing borrowing : this.borrowings)
            if (isBorrowingOverdue(borrowing))
                ret.add(borrowing);

        return ret;
    }

    public boolean isBorrowingOverdue(Borrowing borrowing) {
        LocalDateTime ldt = LocalDateTime.now();
        double current = new DateTime(ldt.getDayOfYear(), ldt.getMonthValue(), ldt.getYear()).getDateTimeInSecondsSince1970();
        DateTime borrowingPeriod = new DateTime(1, 1, 1970, 0, 0, 0);
        borrowingPeriod.addDays(this.standardBorrowingPeriod);
        double maxDiff = borrowingPeriod.getDateTimeInSecondsSince1970();

        double borrowed_until = borrowing.getBorrowed_until().getDateTimeInSecondsSince1970();
        double diff = borrowed_until - current;

        return diff > maxDiff;
    }

    public void extendBorrowing(Borrowing borrowing) {
        DateTime borrowed_until = borrowing.getBorrowed_until();
        borrowed_until.addDays(this.standardBorrowingPeriod);

        borrowing.setBorrowed_until(borrowed_until);
    }

    public void returnBookAndEndBorrowing(Borrowing borrowing) {
        if (isBorrowingOverdue(borrowing))
            borrowing.getPerson().addPenalty(new Penalty("Pozdni vraceni knihy"));

        this.borrowings.remove(borrowing);
    }

    public void borrowBookToPerson(Person person, Book book) {
        IDSingleton idSingleton = IDSingleton.getInstance();

        LocalDateTime ldt = LocalDateTime.now();

        DateTime currentDate = new DateTime(ldt.getDayOfMonth(), ldt.getMonthValue(), ldt.getYear());
        DateTime borrowed_until = currentDate.copy();

        borrowed_until.addDays(this.standardBorrowingPeriod);

        addBorrowing(new Borrowing(idSingleton.getId(), book, person, currentDate, borrowed_until));
    }

    public String toString() {
        StringBuilder ret = new StringBuilder("KNIHOVNA\nPersons:\n");

        for (Person p : getPersons())
            ret.append(p.toString()).append("\n");

        ret.append("\nBooks:\n");

        for (Book b : getBooks())
            ret.append(b.toString()).append("\n");

        ret.append("\n\nBorrowings:\n");

        for (Borrowing b : getBorrowings())
            ret.append(b.toString()).append("\n");

        return ret.toString();
    }
}
