import java.util.Scanner;

public class Exercice2 {
    public static void main(String [] args) {
        Scanner mon_scanner = new Scanner(System.in);
        System.out.println("Entrez votre nom :");
        String name = mon_scanner.next(); // contiendra la saisie au clavier
        System.out.println("Bonjour " + name + " !");
    }
}