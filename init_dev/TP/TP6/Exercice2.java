import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            int[] intArray = Utils.scanIntArray(scanner);
            Double arraySum = 0.0;
            Double arrayLength = Double.valueOf(intArray.length);
            for(int i=0; i<arrayLength; i++){
                arraySum+=intArray[i];
            }
            System.out.println("La moyenne est de "+arraySum/arrayLength);
        }
    }
}
