import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Saisissez l");
            int l = scanner.nextInt();
            System.out.println("Saisissez h");
            int h = scanner.nextInt();
            String line = "";
            String subLine = "";
            for (int columnIndex = 1; columnIndex <= l; columnIndex++) {
                line += "+--";
                subLine += "|  ";
            }
            line += "+";
            subLine += "|";
            for (int lineIndex = 1; lineIndex <= h; lineIndex++) {
                System.out.println(line);
                System.out.println(subLine);
            }
            System.out.println(line);
        }
    }
}