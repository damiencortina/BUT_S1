import java.util.Scanner;

public class Exercice6{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Saisissez l");
            int l = scanner.nextInt();
            System.out.println("Saisissez h");
            int h = scanner.nextInt();
            for(int lineIndex = 1; lineIndex<=h; lineIndex++){
                String line = "";
                for(int columnIndex = 1; columnIndex<=l; columnIndex++){
                    line += "*";
                }
                System.out.println(line);
            }
        }
    }
}
