import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Saisissez une somme initiale :");
            double initialMoney = Double.valueOf(scanner.next());
            System.out.println("Saisissez votre objectif :");
            double objective = Double.valueOf(scanner.next());
            System.out.println("Saisissez un intérêt :");
            double yearlyInterest = 0.0;
            do {
                yearlyInterest = Double.valueOf(scanner.next());
            } while (yearlyInterest < 0);
            int yearsToObjective = 0;
            while (initialMoney < objective) {
                initialMoney += yearlyInterest*initialMoney;
                yearsToObjective++;
            }
            System.out.println("Il vous faudra " + yearsToObjective + " ans avant d'atteindre votre objectif");
        }
    }
}