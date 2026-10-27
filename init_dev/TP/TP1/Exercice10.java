import java.util.Scanner;

public class Exercice10{
    public static void main(String [] args){
        Scanner monScanner = new Scanner(System.in);
        System.out.println("Entrez une nombre de seconde à formater :");
        int nombreSecondeEnEntree = Integer.valueOf(monScanner.next());
        int nombreHeures = nombreSecondeEnEntree/3600;
        nombreSecondeEnEntree = nombreSecondeEnEntree%3600;
        int nombreMinutes = nombreSecondeEnEntree/60;
        nombreSecondeEnEntree = nombreSecondeEnEntree%60;
        System.out.println("Version formaté :" + nombreHeures + "h " + nombreMinutes + "m " + nombreSecondeEnEntree + "s");
    }
}