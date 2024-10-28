import java.util.Scanner;

public class Lab4Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full year (e.g., 2012): ");
        int year = scanner.nextInt();
        System.out.print("Enter month as number between 1 and 12: ");
        int month = scanner.nextInt();
        printMonth(year, month);
    }

    public static void printMonth(int year, int month) {
        String monthName = getMonthName(month);
        System.out.println(monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int startDay = getStartDay(year, month);
        int numDays = getNumOfDaysInMonth(year, month);
        int dayCount = 1;
        for (int i = 0; i < 7; i++) {
            if (i < startDay) {
                System.out.print("    ");
            } else {
                System.out.printf("%-4d", dayCount);
                dayCount++;
            }
            if (i == 6) {
                System.out.println();
            }
        }
        while (dayCount <= numDays) {
            for (int i = 0; i < 7 && dayCount <= numDays; i++) {
                System.out.printf("%-4d", dayCount);
                dayCount++;
            }
            System.out.println();
        }
    }

    public static String getMonthName(int month) {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "";
        }
    }

    public static int getStartDay(int year, int month) {
        int totalDays = 0;
        for (int i = 1900; i < year; i++) {
            totalDays += isLeapYear(i)? 366 : 365;
        }
        for (int j = 1; j < month; j++) {
            totalDays += getNumOfDaysInMonth(year, j);
        }
        return (totalDays + 1) % 7;
    }

    public static int getNumOfDaysInMonth(int year, int month) {
        if (month == 2) {
            return isLeapYear(year)? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100!= 0) || year % 400 == 0;
    }
}