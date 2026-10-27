public class Exercice2 {
    public static void main(String[] args) {
        System.out.println("Entrez une année");
        int year = 2026;
        int month = 9;
        int day = 30;
        int hour = 15;
        int minutes = 30;
        int seconds = 22;
        int timestamp = 0;
        for (int i = 1970; i < year; i++) {
            timestamp += Exercice2.convertYear(i);
        }
        for (int y = 1; y < month; y++) {
            timestamp += Exercice2.convertMonth(year, y);
        }
        timestamp += day * 24 * 3600;
        timestamp += hour * 3600;
        timestamp += minutes * 60;
        timestamp += seconds;
        System.out.println(timestamp);
    }

    public static int convertYear(int year) {
        if (Exercice2.isBisextile(year)) {
            return 366 * 24 * 3600;
        } else {
            return 365 * 24 * 3600;
        }
    }

    public static int convertMonth(int year, int month) {
        if (month == 2) {
            if (Exercice2.isBisextile(year)) {
                return 29 * 24 * 3600;
            } else {
                return 28 * 24 * 3600;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30 * 24 * 3600;
        } else {
            return 31 * 24 * 3600;
        }
    }

    private static boolean isBisextile(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
