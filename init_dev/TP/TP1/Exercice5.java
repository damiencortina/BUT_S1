import java.util.Scanner;

public class Exercice5{
    public static void main(String [] args){
        Scanner monScanner = new Scanner(System.in);
        System.out.println("Saisissez une longuer (en m) :");
        float longueurEnMetre = Float.valueOf(monScanner.next());
        System.out.println("Cette longeur correspond à :" + (longueurEnMetre/1000) + "km");
        System.out.println("Cette longeur correspond à :" + (longueurEnMetre*1000) + "mm");
    }
}