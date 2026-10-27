import java.util.Scanner;

public class Exercice7{
    public static void main(String [] args) throws Exception{
        Scanner monScanner = new Scanner(System.in);
        System.out.println("Entrez une distance (en km) :");
        int distanceEnKm = Integer.valueOf(monScanner.next());
        System.out.println("Entrez une durée (en h) :");
        int dureeEnH = Integer.valueOf(monScanner.next());
        if(dureeEnH == 0){
            throw new Exception("La durée doit être supérieur à 0");
        }
        System.out.println("La vitesse est de : " + (distanceEnKm / dureeEnH) + "km/h");
    }
}