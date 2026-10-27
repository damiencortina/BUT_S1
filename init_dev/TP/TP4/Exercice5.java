import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Saisissez une anéée :");
            int year = scanner.nextInt();
            int printedYears = 0;
            while (printedYears < 5) {
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                    System.out.println(year);
                    printedYears++;
                }
                year++;
            }
        }
    }
}
