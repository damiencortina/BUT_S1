import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {
        System.out.println("Saisissez un nombre :");
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int f2 = 0;
            System.out.println(f2);
            int f1 = 1;
            System.out.println(f1);
            for (int i = 2; i <= n; i++) {
                int f0 = f2 + f1;
                System.out.println(f0);
                f2 = f1;
                f1 = f0;
            }
        }
    }
}
