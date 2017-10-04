package cs411.testGenerator.inputClasses;

import java.util.Arrays;
import java.util.List;

public class ComputeNextDate
{
    private static final int MIN_DAY = 1;
    private static final int MAX_DAY = 31;
    private static final int NORMAL_MONTH = 30;
    private static final int FEB_DAYS = 28;
    private static final int LEAP_DAY = 29;
    private static final int MAX_MONTH = 12;
    private static final int MIN_MONTH = 1;
    private static final int MAX_YEAR = 2021;
    private static final int MIN_YEAR = 1801;
    private static final int LEAP_DECADES = 400;
    private static final List<Integer> LONG_MONTHS = Arrays.asList(1, 3, 4, 7, 8, 12);
    private static final List<Integer> NORMAL_MONTHS = Arrays.asList(4, 6, 9, 11);
    private static final String INVALID_DATE = "Invalid input date";

    public void findNextDate(
            final int month,
            final int day,
            final int year)
    {
        System.out.print("Month: " + month + '\t');
        System.out.print("Day: " + day + '\t');
        System.out.print("Year: " + year + '\t');

        final boolean isValidMonth = month >= MIN_MONTH && month <= MAX_MONTH;
        final boolean isValidDay = day >= MIN_DAY && day <= MAX_DAY;
        final boolean isValidYear = year >= MIN_YEAR && year <= MAX_YEAR;

        if (isValidDay && isValidMonth && isValidYear) {
            final int tomorrowMonth = findTomorrowMonth(day, month, year);
            final int tomorrowDay = findTomorrowDay(day, month, year);
            final int tomorrowYear = findTomorrowYear(day, month, year);

            if (tomorrowDay == -1 || tomorrowMonth == -1 || tomorrowYear == -1) {
                System.out.println(INVALID_DATE);
            } else {
                System.out.println("Tomorrow’s date is: " + tomorrowMonth + ' ' + tomorrowDay + ", " + tomorrowYear);
            }
        } else {
            System.out.println(INVALID_DATE);
        }
    }

    private static int findTomorrowMonth(
            final int day,
            final int month,
            final int year)
    {
        int tomorrowMonth = month;

        if (LONG_MONTHS.contains(month)) {
            if (MAX_DAY == day) {
                tomorrowMonth = MAX_MONTH == month
                        ? 1
                        : month + 1;
            }
        } else if (NORMAL_MONTHS.contains(month)) {
            if (day == NORMAL_MONTH) {
                tomorrowMonth = month + 1;
            }
        } else if (2 == month) {
            if (day >= FEB_DAYS) {
                final boolean isValidLeapDay = day == LEAP_DAY && isLeapYear(year);
                final boolean isValidLastDay = day == FEB_DAYS && !isLeapYear(year);

                tomorrowMonth = (isValidLastDay || isValidLeapDay)
                        ? 3
                        : -1;
            }
        }

        return tomorrowMonth;
    }

    private static int findTomorrowDay(
            final int day,
            final int month,
            final int year)
    {
        int tomorrowDay = day;

        if (LONG_MONTHS.contains(month)) {
            tomorrowDay = day < MAX_DAY
                    ? day + 1
                    : 1;
        } else if (NORMAL_MONTHS.contains(month)) {
            if (day < NORMAL_MONTH) {
                tomorrowDay = day + 1;
            } else if (day == NORMAL_MONTH) {
                tomorrowDay = 1;
            } else {
                tomorrowDay = -1;
            }
        } else if (2 == month) {
            if (day < FEB_DAYS) {
                tomorrowDay = day + 1;
            } else {
                if (day == FEB_DAYS) {
                    tomorrowDay = isLeapYear(year)
                            ? LEAP_DAY
                            : 1;
                } else if (day == LEAP_DAY && isLeapYear(year)) {
                    tomorrowDay = 1;
                } else {
                    tomorrowDay = -1;
                }
            }
        }

        return tomorrowDay;
    }

    private static int findTomorrowYear(
            final int day,
            final int month,
            final int year)
    {
        int tomorrowYear = year;

        if (MAX_MONTH == month && day == MAX_DAY) {
            tomorrowYear = (year < MAX_YEAR && year >= MIN_YEAR)
                    ? year + 1
                    : -1;
        }

        return tomorrowYear;
    }

    private static boolean isLeapYear(final int year)
    {
        return year % 4 == 0 && year % 100 != 0 || year % LEAP_DECADES == 0;
    }
}