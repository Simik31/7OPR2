package cz.osu.student.R19584;

import java.util.ArrayList;

public class Person {
    private String name;
    private String surname;
    private ArrayList<Integer> phone_numbers;
    private ArrayList<String> emails;
    private ArrayList<Penalty> penalties;

    public Person(String name, String surname) {
        setName(name);
        setSurname(surname);
        this.phone_numbers = new ArrayList<>();
        this.emails = new ArrayList<>();
        this.penalties = new ArrayList<>();
    }

    public Person(String name, String surname, int phone_number) {
        this(name, surname);
        addPhoneNumber(phone_number);
    }

    public Person(String name, String surname, String email) {
        this(name, surname);
        addEmail(email);
    }

    public Person(String name, String surname, int phone_number, String email) {
        this(name, surname);
        addPhoneNumber(phone_number);
        addEmail(email);
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getFullName() {
        return getName() + " " + getSurname();
    }

    public ArrayList<Integer> getPhoneNumbers() {
        return new ArrayList<>(this.phone_numbers);
    }

    public ArrayList<String> getEmails() {
        return new ArrayList<>(this.emails);
    }

    public ArrayList<Penalty> getPenalties() {
        return new ArrayList<>(this.penalties);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void addPhoneNumber(int phone_number) {
        this.phone_numbers.add(phone_number);
    }

    public void addPhoneNumbers(ArrayList<Integer> phone_numbers) {
        for (int phone_number : phone_numbers) {
            addPhoneNumber(phone_number);
        }
    }

    public void addEmail(String email) {
        this.emails.add(email);
    }

    public void addEmails(ArrayList<String> emails) {
        for (String email : emails) {
            addEmail(email);
        }
    }

    public void addPenalty(Penalty penalty) {
        this.penalties.add(penalty);
    }

    public String toString() {
        StringBuilder ret = new StringBuilder("Full name: " + getFullName() + "\nPhone Numbers:\n");

        for (int n : getPhoneNumbers())
            ret.append(n).append("\n");

        ret.append("Emails:\n");

        for (String e : getEmails())
            ret.append(e).append("\n");

        ret.append("Penalties:\n");

        for (Penalty p : getPenalties())
            ret.append(p).append("\n");

        return ret.toString();
    }
}






















