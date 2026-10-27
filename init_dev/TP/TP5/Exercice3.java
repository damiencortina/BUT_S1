import java.util.Scanner;

public class Exercice3 {
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
                int value = Exercice2.convertYear(years);
                if (timestamp - value >= 0) {
                    timestamp -= value;
                    years++;
                } else {
                    yearsOk = true;
                }
            }
            boolean monthOk = false;
            while (!monthOk) {
                int value = Exercice2.convertMonth(years, month);
                if (timestamp - value >= 0) {
                    timestamp -= value;
                    month++;
                } else {
                    monthOk = true;
                }
            }
            System.out.println(timestamp);
            days = timestamp / (24 * 3600) + 1;
            timestamp %= (24 * 3600);
            hours = timestamp / 3600;
            timestamp %= 3600;
            minutes = timestamp / 60;
            timestamp %= 60;
            seconds = timestamp;
            System.out.println(years + "-" + Exercice3.format(month) + "-" + Exercice3.format(days) + " "
                    + Exercice3.format(hours) + ":" + Exercice3.format(minutes) + ":" + Exercice3.format(seconds));
        }
    }

    private static String format(int value) {
        String stringValue = String.valueOf(value);
        if (stringValue.length() < 2) {
            stringValue = "0" + stringValue;
        }
        return stringValue;
    }
}
