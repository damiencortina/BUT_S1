import java.util.Scanner;

public class Exercice8{
    public static void main(String [] args) throws Exception{
        Scanner monScanner = new Scanner(System.in);
        System.out.println("Vitesse du train (en km/h) :");
        float vitesseDuTrain = Float.valueOf(monScanner.next());
        if(vitesseDuTrain <= 0){
            throw new Exception("La vitesse doit être positive");
        }
        System.out.println("Distance restante (en km):");
        float distanceRestante = Float.valueOf(monScanner.next());
        System.out.println("Temps de trajet restant (en h):" + (distanceRestante/vitesseDuTrain));
    }
}