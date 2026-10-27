import java.util.Scanner;

public class Exercice3Part1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String numberString = "";
            do{
                System.out.println("Saisissez un nombre entier:");
                numberString = scanner.next();
            }
            while (!isAnInteger(numberString));
        }
    }

    private static boolean isAnInteger(String numberString){
        boolean isAnInteger = true;
        if(!(numberString.charAt(0) == '-' || Character.isDigit(numberString.charAt(0)))){
            isAnInteger = false;
        }
        for(int i=1; i<(numberString.length()-1); i++){
            if(!Character.isDigit(numberString.charAt(i))){
                isAnInteger = false;
            }
        }
        return isAnInteger;
    }
}