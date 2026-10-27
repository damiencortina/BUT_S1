import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String name = "";
            int nameNumber = 0;
            while (!name.equals("QUIT")) {
                System.out.println("Saisissez un nom :");
                name = scanner.next();
                if (!name.equals("QUIT")) {
                    nameNumber++;
                }
            }
            System.out.println(nameNumber);
        }
    }
}