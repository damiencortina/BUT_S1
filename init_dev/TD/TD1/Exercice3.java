/*
    Ecrire un programme qui calcule le triangle de Pascal de la manière suivante : vous
    demanderez à l’utilisateur combien de lignes calculer (au moins 5). Le nombre de lignes
    sera appelé n. Puis vous générerez un tableau de n lignes et n + 2 colonnes dont vous
    mettrez tous les éléments à zéro. Ensuite, vous mettrez la seconde valeur de la première
    ligne à 1. Pour calculer le reste des valeurs, vous parcourerez les lignes à partir de la
    deuxième, et vous calculerez les valeurs à partir du deuxième élément de chaque ligne
    de la façon suivante : un élément est égal à la somme des éléments de la ligne précédente
    1
    qui sont au dessus de lui, et en diagonale à gauche. Voici un exemple après calcul pour
    n = 5 :
    0 1 0 0 0 0
    0 1 1 0 0 0
    0 1 2 1 0 0
    0 1 3 3 1 0
    0 1 4 6 4 1
    Améliorez l’affichage pour ne pas afficher les zéros.
*/

import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInt;
        do {
            System.out.println("Un nombre de lignes ?");
            userInt = scanner.nextInt();
        } while (userInt < 5 || userInt > 10);
        int[][] pascal = new int[userInt][userInt + 2];
        pascal[0][1] = 1;
        for (int i = 0; i < userInt; i++) {
            for (int j = 0; j < userInt + 2; j++) {
                if (i > 0) {
                    if (j > 0) {
                        pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                    }
                }
                if (pascal[i][j] != 0) {
                    System.out.print(pascal[i][j]);
                }
            }
            System.out.print("\n");
        }
    }
}