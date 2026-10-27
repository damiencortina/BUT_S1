import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
        System.out.println("Entrez votre timestamp :");
        try (Scanner scanner = new Scanner(System.in)) {
            int timestamp = scanner.nextInt();
            int years = 1970;
            int month = 1;
            int days = 0;
            int hours = 0;
            int minutes = 0;
            int seconds = 0;
            boolean yearsOk = false;
            while (!yearsOk) {
                int value = 0;
                if (Exercice6.isBisextile(years)) {
                    value = 366 * 24 * 3600;
                } else {
                    value = 365 * 24 * 3600;
                }
                if (timestamp - value >= 0) {
                    timestamp -= value;
                    years++;
                } else {
                    yearsOk = true;
                }
            }
            boolean monthOk = false;
            while (!monthOk) {
                int value = 0;
                if (month == 2) {
                    if (Exercice6.isBisextile(years)) {
                        value = 29 * 24 * 3600;
                    } else {
                        value = 28 * 24 * 3600;
                    }
                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    value = 30 * 24 * 3600;
                } else {
                    value = 31 * 24 * 3600;
                }
                if (timestamp - value >= 0) {
                    timestamp -= value;
                    month++;
                } else {
                    monthOk = true;
                }
            }
            System.out.println(timestamp);
            days = timestamp / (24 * 3600);
            timestamp %= (24 * 3600);
            hours = timestamp / 3600;
            timestamp %= 3600;
            minutes = timestamp / 60;
            timestamp %= 60;
            seconds = timestamp;
            System.out.println(years + "-" + Exercice6.format(month) + "-" + Exercice6.format(days) + " "
                    + Exercice6.format(hours) + ":" + Exercice6.format(minutes) + ":" + Exercice6.format(seconds));
        }
    }

    private static boolean isBisextile(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    private static String format(int value) {
        String stringValue = String.valueOf(value);
        if (stringValue.length() < 2) {
            stringValue = "0" + stringValue;
        }
        return stringValue;
    }
}
