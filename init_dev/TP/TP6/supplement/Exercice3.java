import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Utilisation de tableaux (on demande à l'utilisateur de saisir la taille du tableau avant d'enregistrer les valeurs)
            System.out.println("Saisie du premier tableau");
            int[] firstArray = Utils.scanIntArray(scanner);
            System.out.println("Saisie du second tableau");
            int[] secondArray = Utils.scanIntArray(scanner);
            // Utilisation d'un liste car on ne connaît pas à l'avance le nombre de valeurs communes
            List<Integer> intersectionList = new ArrayList<>();
            for (int i = 0; i < firstArray.length; i++) {
                for (int j = 0; j < secondArray.length; j++) {
                    if (firstArray[i] == secondArray[j]) {
                        // On vérifie si la valeur n'est pas déjà présente dans le tableau d'intersection
                        boolean alreadyListed = false;
                        int k = 0;
                        while (!alreadyListed && k < intersectionList.size()) {
                            if (intersectionList.get(k) == firstArray[i]) {
                                alreadyListed = true;
                            }
                            k++;
                        }
                        // Si la valeur n'est pas déjà présente, on l'ajoute
                        if (!alreadyListed) {
                            intersectionList.add(firstArray[i]);
                        }
                    }
                }
            }
            System.out.println(intersectionList);
        }
    }
}
