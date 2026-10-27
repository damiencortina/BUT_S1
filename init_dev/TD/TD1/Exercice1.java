/*
Comme l’usage des structures en Java consiste en réalité à faire des classes, nous
allons voir une méthode différente pour stocker des valeurs liées. Vous implémenterez
dans ce programme un tableau de personnes qui sera décomposé en trois tableaux
simples (deux de chaînes de caractères, et un d’entiers). L’un des tableaux contiendra
des noms, le second contiendra les prénoms correspondants, et le troisième contiendra
les âges. Un individu a ses trois champs stockés aux mêmes indices dans chaque tableau.
Ajoutez une interaction avec l’utilisateur pour lui demander combien il veut saisir de
personnes, puis une boucle qui demandera les 3 champs pour chaque personne.
*/

import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Combien de personnes voulez-vous saisir ?");
        int numberOfPersons = scanner.nextInt();
        String[] noms = new String[numberOfPersons];
        String[] prenoms = new String[numberOfPersons];
        int[] ages = new int[numberOfPersons];
        for (int i = 0; i < numberOfPersons; ++i) {
            System.out.println("Nom :");
            noms[i] = scanner.next();
            System.out.println("Prénom :");
            prenoms[i] = scanner.next();
            System.out.println("Age :");
            ages[i] = scanner.nextInt();
            System.out.println("Utilisateur saisi : " + noms[i] +' '+ prenoms[i] +' '+ ages[i]);
        }
    }
}