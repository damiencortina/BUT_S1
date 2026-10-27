import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input = "";
            do {
                System.out.println("Votre saisie :");
                input = scanner.next();
            } while (!isReal(input));
        }
    }

    private static boolean isReal(String input) {
        String[] inputParts = input.split("E");
        if(inputParts.length > 2){
            return false;
        }
        boolean hasDot = false;
        for (int i = 0; i < inputParts[0].length(); i++) {
            Character character = inputParts[0].charAt(i);
            if(!Exercice4.isCharacterAllowed(i, character, hasDot)){
                return false;
            }
            if(character.equals('.')){
                hasDot=true;
            }
        }
        return true;
    }

    private static boolean isCharacterAllowed(int index, Character character, boolean hasDot) {
        if (character.equals('-')) {
            return index == 0;
        }
        if (character.equals('.')) {
            return !hasDot;
        }
        return Character.isDigit(character);
    }
}