import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Saisissez un nombre hexadécimal :");
            String hex = scanner.next();
            Character[] characterArray = new Character[] {
                    '1',
                    '2',
                    '3',
                    '4',
                    '5',
                    '6',
                    '7',
                    '8',
                    '9',
                    'A',
                    'B',
                    'C',
                    'D',
                    'E',
                    'F'
            };
            String[] binaryArray = new String[] {
                    "0001",
                    "0010",
                    "0011",
                    "0100",
                    "0101",
                    "0110",
                    "0111",
                    "1000",
                    "1001",
                    "1010",
                    "1011",
                    "1100",
                    "1101",
                    "1110",
                    "1111"
            };
            String binary = "";
            for(int i = 0; i<hex.length(); i++){
                for(int j = 0; j<characterArray.length; j++){
                    if(characterArray[j] == hex.charAt(i)){
                        binary = binary + binaryArray[j]; 
                    }
                }
            }
            System.out.println("Binaire : " + binary);
        }
    }
}
