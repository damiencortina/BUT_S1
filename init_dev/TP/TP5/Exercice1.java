import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        System.out.println("Entrez la taille du triangle");
        try (Scanner scanner = new Scanner(System.in)) {
            Exercice1.drawTriangle(scanner.nextInt());
        }
    }

    private static void drawTriangle(int triangleSize) {
        for (int i = 1; i <= triangleSize; i++) {
            Exercice1.drawLine(triangleSize, i + 1);
        }
    }

    private static void drawLine(int triangleSize, int lineLevel) {
        String line = "";
        for (int i = 0; i < triangleSize; i++) {
            if (i > triangleSize - lineLevel) {
                line += "*";
            } else {
                line += " ";
            }
        }
        System.out.println(line);
    }
}