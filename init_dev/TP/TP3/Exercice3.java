import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args){
        System.out.println("Saisissez n");
        try(Scanner scanner = new Scanner(System.in)){
            int n = scanner.nextInt();
            for(int i = 1; i<=n; i+=3){
                System.out.println(i);
            }
        }
    }
}
