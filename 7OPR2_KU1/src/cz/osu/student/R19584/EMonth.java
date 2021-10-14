package cz.osu.student.R19584;

public enum EMonth {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    static public int getIntFromEMonth(EMonth month) {
        for (int i = 0; i < 12; i++)
            if (month == EMonth.values()[i])
                return i + 1;

        throw new IllegalArgumentException(month + " is not legal EMonth value");
    }

    static public EMonth getEMonthFromInt(int month) {
        return EMonth.values()[month - 1];
    }
}
