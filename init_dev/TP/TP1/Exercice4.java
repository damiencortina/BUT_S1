import java.util.Scanner;

public class Exercice4{
    public static void main(String [] args){
        Scanner monScanner = new Scanner(System.in);
        System.out.println("Premier nombre :");
        int premierNombre = Integer.valueOf(monScanner.next());
        System.out.println("Second nombre :");
        int secondNombre = Integer.valueOf(monScanner.next());
        System.out.println("Résulat : " + (premierNombre / secondNombre));

    }
}