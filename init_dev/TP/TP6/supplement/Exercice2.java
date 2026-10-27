import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] array = Utils.scanIntArray(scanner);
            Boolean isSorted = true;
            int arrayIndex = 0;
            while (isSorted && arrayIndex < array.length - 1) {
                if (array[arrayIndex] > array[arrayIndex + 1]) {
                    isSorted = false;
                }
                arrayIndex++;
            }
            if (isSorted) {
                System.out.println("Le tableau est trié par ordre croissant");
            } else {
                System.out.println("Le tableau n'est pas trié par ordre croissant");
            }
        }
    }
}