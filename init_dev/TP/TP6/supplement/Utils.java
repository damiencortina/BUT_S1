import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Utils {

    static Scanner scanner;

    public static void main(String[] args) {
        Utils.scanner = new Scanner(System.in);
    }

    public static int[] scanIntArray(Scanner scanner) {
        System.out.println("Quelle sera la taille du tableau ?");
        int arraySize = scanner.nextInt();
        int inputNumber = 0;
        int[] intArray = new int[arraySize];
        System.out.println("Vous allez saisir " + arraySize + " int(s) :");
        while (inputNumber < arraySize) {
            System.out.println("Entrez l'int n°" + (inputNumber + 1));
            intArray[inputNumber] = Integer.valueOf(scanner.next());
            inputNumber++;
        }
        System.out.println(Arrays.toString(intArray));
        return intArray;
    }

    public static double[] scanDoubleArray(Scanner scanner) {
        System.out.println("Quelle sera la taille du tableau ?");
        int arraySize = scanner.nextInt();
        int inputNumber = 0;
        double[] doubleArray = new double[arraySize];
        System.out.println("Vous allez saisir " + arraySize + " double(s) :");
        while (inputNumber < arraySize) {
            System.out.println("Entrez le double n°" + (inputNumber + 1));
            doubleArray[inputNumber] = Double.valueOf(scanner.next());
            inputNumber++;
        }
        return doubleArray;
    }

    // Version manuelle de System.out.println(arrayList);
    public static void displayIntegerList(ArrayList<Integer> array) {
        System.out.print('[');
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i));
            if (i < array.size() - 1) {
                System.out.print(',');
            }
        }
        System.out.print("]\n");
    }
}
