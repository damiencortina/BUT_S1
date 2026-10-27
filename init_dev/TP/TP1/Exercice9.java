import java.util.Scanner;

public class Exercice9{
    public static void main(String [] args) throws Exception{
        Scanner monScanner = new Scanner(System.in);
        System.out.println("Nombre d'heure :");
        int heures = Integer.valueOf(monScanner.next());
        System.out.println("Nombre de minute :");
        int minutes = Integer.valueOf(monScanner.next());
        if(minutes>=60){
            throw new Exception("Le nombre de miunute doit être inférieur à 60, merci de convertir.");
        }
        System.out.println("Nombre de seconde :");
        int secondes = Integer.valueOf(monScanner.next());
        System.out.println("Temps en seconde :" + (heures*3600 + minutes*60 + secondes) + "s");
    }
}