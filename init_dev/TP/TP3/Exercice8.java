import java.util.Scanner;

public class Exercice8 {
    public static void main(String[] args){
        System.out.println("Saisissez le nombre dont vous voulez connaitre la table :");
        try(Scanner scanner = new Scanner(System.in)){
            int n = scanner.nextInt();
            for(int i =1; i<=16; i++){
                System.out.println(i + " x "+ n +" = " + (i*n));
            }
        }
    }
}
