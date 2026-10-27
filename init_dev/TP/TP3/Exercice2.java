import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args){
        System.out.println("Saisissez n");
        try(Scanner scanner = new Scanner(System.in)){
            int n = scanner.nextInt();
            for(int i=n; i>=1; i--){
                System.out.println(i);
            }
        }
    }
}
