import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        System.out.println("Saisissez un nombre entier :");
        try (Scanner monScanner = new Scanner(System.in)) {
            int number = Integer.valueOf(monScanner.next());
            if (number % 2 == 0)
                System.out.println("Ce nombre est pair");
            else
                System.out.println("Ce nombre est impair");
        }
    }
}