import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Entrez une taille entre 5 et 50 :");
            size = scanner.nextInt();
        } while (size > 50 && size < 5);
        double coeff = 1.0/size;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                StdDraw.square(i*coeff, j*coeff, coeff);
            }
        }
    }
}
