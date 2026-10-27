import java.util.Scanner;

public class Exercice7{
    public static void main(String[] args){
        System.out.println("Saisissez une IPv4");
        try(Scanner scanner = new Scanner(System.in)){
            String IPv4 = scanner.next();
            int totalPeriod = 0;
            int i = 0;
            boolean isIPv4 = true;
            String currentDigitGroup = "";
            if(IPv4.charAt(0) == '.' || IPv4.charAt(IPv4.length()-1) == '.')
                isIPv4 = false;
            while(i< IPv4.length() && isIPv4){
                if(IPv4.charAt(i) == '.'){
                    totalPeriod++;
                    int currentDigitGroupIntValue = Integer.valueOf(currentDigitGroup);
                    if(!(currentDigitGroupIntValue <= 255 && currentDigitGroupIntValue >= 0))
                        isIPv4 = false;
                    currentDigitGroup = "";
                    if(totalPeriod>3){
                        isIPv4 = false;
                    }
                }else if (Character.isDigit(IPv4.charAt(i))){
                    currentDigitGroup +=IPv4.charAt(i);
                }else{
                    isIPv4 = false;
                }
                i++;
            }
            if (totalPeriod < 3) {
                isIPv4=false;
            }
            if(isIPv4 == true){
                System.out.println("C'est une IPv4 valide");
            }else{
                System.out.println("Ce n'est pas une IPv4");
            }
        }
    }
}