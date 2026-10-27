import java.util.Scanner;

public class Exercice6{
    public static void main(String [] args){
        Scanner monScanner = new Scanner(System.in);
        System.out.println("Entrez un prix TTC :");
        float prixTTC = Float.valueOf(monScanner.next());
        System.out.println("Prix avec TVA :" + (prixTTC += prixTTC * 0.2));
    }
}