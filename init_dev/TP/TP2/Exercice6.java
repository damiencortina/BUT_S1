import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Saisir votre mois");
            String mois = scanner.next();
            switch (mois) {
                case "janvier":
                    System.out.println(1);
                    break;
                case "fevrier":
                    System.out.println(2);
                    break;
                case "mars":
                    System.out.println(3);
                    break;
                case "avril":
                    System.out.println(4);
                    break;
                case "mai":
                    System.out.println(5);
                    break;
                case "juin":
                    System.out.println(6);
                    break;
                case "juillet":
                    System.out.println(7);
                    break;
                case "aout":
                    System.out.println(8);
                    break;
                case "septembre":
                    System.out.println(9);
                    break;
                case "octobre":
                    System.out.println(10);
                    break;
                case "novembre":
                    System.out.println(11);
                    break;
                case "decembre":
                    System.out.println(12);
                    break;
                default:
                    System.out.println("Mois non reconnu");
                    break;
            }
        }
    }
}
