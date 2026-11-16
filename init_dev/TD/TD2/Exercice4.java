import java.util.Arrays;
import java.util.Random;

public class Exercice4 {

    enum Sizes {
        LIGHT, STANDARD
    }

    static String values[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi", "As" };
   
    static String colors[] = { "Coeur", "Carreau", "Pique", "Trèfle" };

    public static void main(String[] args) {
        int[][] deck = buildDeck(Sizes.STANDARD);
        int[][] shuffledDeck = shuffle(deck);
        display(shuffledDeck);
    }

    public static int[][] buildDeck(Sizes taille) {
        int startingValuesIndex;
        int size;
        switch (taille) {
            case LIGHT:
                startingValuesIndex = 5;
                size = 32;
            case STANDARD:
                startingValuesIndex = 0;
                size = 54;
            default:
                startingValuesIndex = 0;
                size = 54;
        }
        ;
        int[][] deck = new int[size][2];
        int currentCardIndex = 0;
        for (int i = 0; i < colors.length; i++) {
            for (int j = startingValuesIndex; j < values.length; j++) {
                deck[currentCardIndex][0] = j;
                deck[currentCardIndex][1] = i;
                currentCardIndex++;
            }
        }
        return deck;
    }

    public static int[][] shuffle(int[][] deck){
        int currentIndex = deck.length-1;
        Random random = new Random();
        while(currentIndex>0){
            int shuffledIndex = random.nextInt(currentIndex);
            int[] temp = deck[currentIndex];
            deck[currentIndex] = deck[shuffledIndex];
            deck[shuffledIndex] = temp;
            currentIndex--;
        }
        return deck;
    }

    public static void display(int[][] deck){
        for(int i = 0; i<deck.length; i++){
            System.out.println(values[deck[i][0]] + " de " + colors[deck[i][1]]);
        }
    }
}