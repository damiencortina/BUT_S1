import java.util.Scanner;

public class Exercice3{
    public static void main(String [] args){
        Scanner mon_scanner = new Scanner(System.in);
        System.out.println("Entrer la première valeur");
        Float value1 = Float.valueOf(mon_scanner.next());
        System.out.println("Entrer la seconde valeur");
        Float value2 = Float.valueOf(mon_scanner.next());
        System.out.println("Résultat : " + (value1+value2));
    }
}