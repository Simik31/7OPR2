package cz.osu.student.R19584;

import java.util.Arrays;

public class DateTime {
    private final int[] daysInMonths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private int day;
    private EMonth month;
    private int year;
    private int hours;
    private int minutes;
    private int seconds;

    public DateTime(int day, EMonth month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
        setHours(0);
        setMinutes(0);
        setSeconds(0);
    }

    public DateTime(int day, int month, int year) {
        this(day, EMonth.getEMonthFromInt(month), year);
    }

    public DateTime(int day, EMonth month, int year, int hours, int minutes, int seconds) {
        setDay(day);
        setMonth(month);
        setYear(year);
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public DateTime(int day, int month, int year, int hours, int minutes, int seconds) {
        this(day, EMonth.getEMonthFromInt(month), year, hours, minutes, seconds);
    }

    public int getDay() {
        return this.day;
    }

    public EMonth getMonth() {
        return this.month;
    }

    public int getMonthNumber() {
        return EMonth.getIntFromEMonth(this.month);
    }

    public int getYear() {
        return this.year;
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(EMonth month) {
        this.month = month;
    }

    public void setMonth(int month) {
        this.month = EMonth.getEMonthFromInt(month);
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void addDays(int days) {
        days += getDay();
        int daysInCurrentMonth = daysInMonths[getMonthNumber() - 1];
        if(days > daysInCurrentMonth) {
            int month = getMonthNumber() + 1;
            if(month > 12) {
                setYear(getYear() + 1);
                month -= 12;
            }
            setMonth(month);
            days -= daysInCurrentMonth;
        }
        setDay(days);
    }

    public double getDateTimeInSecondsSince1970() {
        double years = getYear() - 1970;
        double months = getMonthNumber() - 1;
        double days = getDay() - 1;
        double hours = getHours();
        double minutes = getMinutes();

        return getSeconds() + minutes * 60 + hours * 3600 + days * 86400 + months * 2629743 + years * 31556926;
    }

    public DateTime copy() {
        return new DateTime(getDay(), getMonth(), getYear(), getHours(), getMinutes(), getSeconds());
    }

    public String toString() {
        return String.format("%02d.%s.%s %02d:%02d:%02d", getDay(), getMonth(), getYear(), getHours(), getMinutes(), getSeconds());
    }
}







































