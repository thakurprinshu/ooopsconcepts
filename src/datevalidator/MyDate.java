package datevalidator;

public class MyDate {
    private int day;
    private int month;
    private int year;

    // Constructor
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Validate the date
    public boolean isValidDate() {
        if (month < 1 || month > 12) return false;
        if (day < 1 || day > getDaysInMonth()) return false;
        return true;
    }

    // Helper: Check for leap year
    private boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Helper: Get days in a month
    private int getDaysInMonth() {
        int[] daysInMonth = {31, (isLeapYear() ? 29 : 28), 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};
        return daysInMonth[month - 1];
    }

    // Increment date by one day
    public void incrementDate() {
        day++;
        if (day > getDaysInMonth()) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    // Format date as dd-mm-yyyy
    public String formatDate() {
        return String.format("%02d-%02d-%04d", day, month, year);
    }
}
