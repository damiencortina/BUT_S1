import java.util.ArrayList;
import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Utilisation de tableaux (on demande à l'utilisateur de saisir la taille du
            // tableau avant d'enregistrer les valeurs)
            System.out.println("Saisie du premier tableau");
            int[] firstArray = Utils.scanIntArray(scanner);
            System.out.println("Saisie du second tableau");
            int[] secondArray = Utils.scanIntArray(scanner);
            // On place les deux tableaux à vérifier dans un tableau, pour les traiter à la
            // suite l'un de l'autre
            int[][] arraysToUnite = new int[][] { firstArray, secondArray };
            // Utilisation d'un liste car on ne connaît pas à l'avance le nombre de valeurs
            // communes
            ArrayList<Integer> unionList = new ArrayList<Integer>();
            for (int i = 0; i < arraysToUnite.length; i++) {
                for (int j = 0; j < arraysToUnite[i].length; j++) {
                    // On vérifie si la valeur n'est pas déjà présente dans le tableau d'union
                    boolean alreadyListed = false;
                    int k = 0;
                    while (!alreadyListed && k < unionList.size()) {
                        if (unionList.get(k) == arraysToUnite[i][j]) {
                            alreadyListed = true;
                        }
                        k++;
                    }
                    // Si la valeur n'est pas déjà présente, on l'ajoute
                    if (!alreadyListed) {
                        unionList.add(arraysToUnite[i][j]);
                    }
                }
            }
            System.out.println(unionList);
        }
    }
}
