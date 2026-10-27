import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Saisissez un caractère");
            char c = scanner.next().charAt(0);
            System.out.println("Saisissez un nombre de répétition");
            int n = scanner.nextInt();
            String result = "";
            for(int i=1; i<=n; i++){
                result += c;
            } 
            System.out.println(result);
        }
    }
}
