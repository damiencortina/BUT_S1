import java.util.Scanner;

public class Exercice3Part2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String numberString = "";
            do{
                System.out.println("Saisissez un nombre entier:");
                numberString = scanner.next();
            }
            while (!isReal(numberString));
        }
    }

    private static boolean isReal(String numberString){
        boolean isReal = true;
        boolean hasADot = false;
        if(!(numberString.charAt(0) == '-' || Character.isDigit(numberString.charAt(0)))){
            isReal = false;
        }
        for(int i=1; i<(numberString.length()-1); i++){
            if( numberString.charAt(i) == '.' ){
                if(hasADot){
                    isReal = false;
                }else{
                    hasADot = true;
                }
            }else if(!Character.isDigit(numberString.charAt(i))){
                isReal = false;
            }
        }
        return isReal;
    }
}