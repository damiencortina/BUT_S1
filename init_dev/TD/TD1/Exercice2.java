/*
Écrire un programme qui permet d’afficher une grille de 10 par 10 en ASCII (les
barres verticales sont des |, les barres horizontales sont des - et les intersections sont
des +.
Ajoutez ensuite une interaction avec l’utilisateur pour lui demander un nombre entre
1 et 10. Vous afficherez un x dans chaque case de la grille multiple de la valeur saisie
(on compte les cases à partir de zéro en haut à gauche).
*/

import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInt;
        do {
            System.out.println("Un nombre entre 1 et 10 ?");
            userInt = scanner.nextInt();
        } while (userInt < 1 || userInt > 10);
        Exercice2.drawMap(userInt, 20);   
    }

    private static void drawMap(int userInt, int size) {
        for (int i = 0; i < size; ++i) {
            System.out.print("+");
            for (int j = 0; j < size; ++j) {
                System.out.print("---+");
            }
            System.out.print("\n");
            System.out.print("|");
            for (int j = 0; j < size; ++j) {
                if ((i*size+j+1) % userInt == 0) {
                    System.out.print(" X |");
                } else {
                    System.out.print("   |");
                }
            }
            System.out.print("\n");
        }
        System.out.print("+");
        for (int j = 0; j < size; ++j) {
            System.out.print("---+");
        }
        System.out.print("\n");
    }
}