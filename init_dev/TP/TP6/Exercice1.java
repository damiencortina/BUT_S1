import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            int[] intArray = Utils.scanIntArray(scanner);
            int arraySum = 0;
            for(int i=0; i<intArray.length; i++){
                arraySum+=intArray[i];
            }
            System.out.println("La somme est de "+arraySum);
        }
    }
}
