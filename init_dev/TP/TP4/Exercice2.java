import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = 0;
            do{
                System.out.println("Saisissez un nombre pair:");
                number = scanner.nextInt();
            }
            while (number % 2 != 0);
        }
    }
}