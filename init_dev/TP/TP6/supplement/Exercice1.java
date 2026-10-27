import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] doubleArray = Utils.scanDoubleArray(scanner);
            for (int i = 0; i < doubleArray.length; i++) {
                String arrayElement = String.valueOf(doubleArray[i]);
                if (i == 0) {
                    System.out.print(arrayElement);
                } else {
                    System.out.print(" " + arrayElement);
                }
            }
            System.out.println();
        }
    }
}