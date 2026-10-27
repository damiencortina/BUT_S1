import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Saisir a");
            double a = Double.valueOf(scanner.next());
            System.out.println("Saisir b");
            double b = Double.valueOf(scanner.next());
            Exercice4.solve(a, b);
        }
    }

    public static void solve(Double a, Double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("L'équation admet tout x comme solution");
            } else {
                System.out.println("L'équation n'a pas de solution");
            }
        } else {
            System.out.println("La solution est x = " + (-b / a));
        }
    }
}
