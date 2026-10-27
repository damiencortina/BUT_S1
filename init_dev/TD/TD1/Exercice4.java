/*
Écrire un programme qui demande une taille n comprise en 3 et 15 à l’utilisateur
et qui produit à partir de cette taille deux tableaux de n lignes et n colonnes, remplis
par des valeurs aléatoires entre -20 et 20.
Le programme crée ensuite un troisième tableau de même dimensions et le remplit avec
des valeurs calculées comme suit : l’élément de la ligne i et la colonne j est égal à la
somme des produits de la ligne i du premier tableau par les éléments de la colonne j
du deuxième. Par exemple, pour une taille de 3, les tableaux ci dessous :
| 1 2 3 | | 9 8 7 |
| 4 5 6 | | 6 5 4 |
| 7 8 9 | | 3 2 1 |
Donneront le tableau suivant :
| 30 24 18 |
| 84 69 54 |
| 138 114 90 |
*/

import java.util.Scanner;

public class Exercice4 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int userInt;
        do {
            System.out.println("Un nombre de lignes ?");
            userInt = scanner.nextInt();
        } while (userInt < 3 || userInt > 15);
        int[][] t1 = new int[userInt][userInt];
        int[][] t2 = new int[userInt][userInt];
        for (int i = 0; i < userInt; i++) {
            for (int j = 0; j < userInt; i++) {
                t1[i][j] = 0;
                t2[i][j] = 0;
            }
        }
    }
}
