package cz.osu.student.R19584;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Martin", "Simara");
        Book b1 = new Book(new Person("Haruto", "Ryo"), "Ibitsu", "Yen Press", "978-1-975353-31-5");

        p1.addPhoneNumber(731845732);
        p1.addEmail("R19584@student.osu.cz");

        Library l1 = new Library();

        l1.addPerson(p1);
        l1.addBook(b1);

        l1.borrowBookToPerson(p1, b1);
        l1.borrowBookToPerson(p1, b1);

        System.out.println(l1.toString());

        for (Person p : l1.getPersons()) {
            ArrayList<Borrowing> borrowings = l1.getPersonBorrowings(p);
            if (borrowings.size() > 0) {
                System.out.println("-----------------------\nAll borrowings of " + p.getFullName() + ":\n");
                for (Borrowing b : borrowings)
                    System.out.println(b);
            }
        }

        for (Book b : l1.getBooks()) {
            ArrayList<Borrowing> borrowings = l1.getBookBorrowings(b);
            if (borrowings.size() > 0) {
                System.out.println("-----------------------\nAll borrowings of " + b.getTitle() + ":\n");
                for (Borrowing bo : borrowings)
                    System.out.println(bo);
            }
        }

        for (Person p : l1.getPersons()) {
            ArrayList<Penalty> penalties = p.getPenalties();
            if (penalties.size() > 0) {
                System.out.println("-----------------------\nAll penalties of " + p.getFullName() + ":\n");
                for (Penalty pe : penalties)
                    System.out.println(pe);
            }
        }

        ArrayList<Borrowing> all_borrowings = l1.getBorrowings();
        if (all_borrowings.size() > 0) {
            System.out.println("-----------------------\nAll borrowings:\n");
            for (Borrowing b : all_borrowings)
                System.out.println(b);
        }

        ArrayList<Borrowing> borrowings_od = l1.getAllBorrowingsThatAreOverdue();
        if (borrowings_od.size() > 0) {
            System.out.println("-----------------------\nAll borrowings that are overdue:\n");
            for (Borrowing b : borrowings_od)
                System.out.println(b);
        }
    }
}
