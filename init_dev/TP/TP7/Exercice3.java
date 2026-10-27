import java.util.Arrays;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Exercice3 {

    enum Cards {
        PIQUE_7,
        PIQUE_8,
        PIQUE_9,
        PIQUE_10,
        PIQUE_VALET,
        PIQUE_DAME,
        PIQUE_ROI,
        PIQUE_AS,
        TREFLE_7,
        TREFLE_8,
        TREFLE_9,
        TREFLE_10,
        TREFLE_VALET,
        TREFLE_DAME,
        TREFLE_ROI,
        TREFLE_AS,
        CARREAU_7,
        CARREAU_8,
        CARREAU_9,
        CARREAU_10,
        CARREAU_VALET,
        CARREAU_DAME,
        CARREAU_ROI,
        CARREAU_AS,
        COEUR_7,
        COEUR_8,
        COEUR_9,
        COEUR_10,
        COEUR_VALET,
        COEUR_DAME,
        COEUR_ROI,
        COEUR_AS,
    }

    record Hands(Cards[] handPlayer1, Cards[] handPlayer2) {
    }

    public static void main(String[] args) {
        Cards[] deck = new Cards[32];
        int i = 0;
        for (Cards card : Cards.values()) {
            deck[i] = card;
            i++;
        }
        System.out.println("Deck mélangé :");
        Cards[] shuffledDeck = Exercice3.shuffle(deck);
        System.out.println(Arrays.toString(shuffledDeck));

        System.out.println("Mains :");
        Hands hands = Exercice3.deal(shuffledDeck);
        System.out.println(Arrays.toString(hands.handPlayer1));
        System.out.println(Arrays.toString(hands.handPlayer2));
    }

    private static Cards[] shuffle(Cards[] deck) {
        List<Cards> deckAsList = new ArrayList<>(Arrays.asList(deck));
        Cards[] shuffledDeck = new Cards[32];
        Random r = new Random();
        for (int i = 31; i >= 0; i--) {
            int index = r.nextInt(i + 1);
            shuffledDeck[31 - i] = deckAsList.get(index);
            deckAsList.remove(index);
        }
        return shuffledDeck;
    }

    private static Hands deal(Cards[] hand) {
        Cards[] handPlayer1 = new Cards[16];
        Cards[] handPlayer2 = new Cards[16];
        for (int i = 0; i < hand.length; i++) {
            if (i % 2 == 0) {
                handPlayer1[Math.floorDiv(i, 2)] = hand[i];
            } else {
                handPlayer2[Math.floorDiv(i, 2)] = hand[i];
            }
        }
        return new Hands(handPlayer1, handPlayer2);
    }
}
