import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        System.out.println("Entrez une annee");
        try (Scanner myScanner = new Scanner(System.in)) {
            int year = Integer.valueOf(myScanner.next());
            if (Exercice3.solve(year)) {
                System.out.println("Cette annee est bisextile");
            } else {
                System.out.println("Cette annee n'est pas bisextile");
            }
        }
    }

    public static boolean solve(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}