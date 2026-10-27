import java.util.Scanner;

public class Exercice9 {
    public static void main(String[] args) {
        System.out.println("Saisissez un nombre en base 10 :");
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            String binaryValue = "";
            while (n > 0) {
                int bit = n % 2;
                binaryValue = String.valueOf(bit) + binaryValue;
                n /= 2;
            }
            System.out.println(binaryValue);
        }
    }
}
