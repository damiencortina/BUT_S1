import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Entrez une année :");
            int year = scanner.nextInt();
            System.out.println("Entrez un mois :");
            int month = scanner.nextInt();
            int days = 0;
            int[] monthsOnNonBisextileYear = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            int[] monthsOnBisextileYear = new int[] { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                days = monthsOnBisextileYear[month - 1];
            } else {
                days = monthsOnNonBisextileYear[month - 1];
            }
            System.out.println("Mois de : "+days+" jours");
        }
    }
}
