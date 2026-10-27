import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Saisir votre année :");
            int year = scanner.nextInt();
            System.out.println("Saisir votre mois (un chiffre entre 1 et 12) :");
            int mois = scanner.nextInt();
            switch (mois) {
                // On peut grouper les cases
                case 1, 3, 5, 7, 8, 10, 12:
                    System.out.println(31);
                    break;
                case 4, 6, 9, 11:
                    System.out.println(30);
                    break;
                case 2:
                    if (Exercice3.solve(year)) {
                        System.out.println("29 (Année bissextile)");
                    } else {
                        System.out.println("28 (Année non-bissextile)");
                    }
                    break;
                default:
                    System.out.println("Mois non-reconnu");
                    break;
            }
        }
    }
}
