import java.util.Scanner;

public class Exercice1{
    public static void main(String[] args){
        System.out.println("Saisissez une IPv4");
        try(Scanner scanner = new Scanner(System.in)){
            String IPv4 = scanner.next();
            if(isIPv4WithCIDR(IPv4)){
                System.out.println("C'est OK");
            }else{
                System.out.println("C'est non");
            }
        }
    }

    public static boolean isIPv4WithCIDR(String IPv4){
        Boolean CIDRValid = false;
        Boolean IPv4Valid = false;
        String[] parts = IPv4.split("/");
            if(parts.length == 2){
                IPv4Valid = isIPv4(parts[0]);
                try{
                    int CIDR = Integer.parseInt(parts[1]);
                    if (CIDR >= 0 && CIDR <= 32) {
                        CIDRValid = true;
                    }
                } catch (NumberFormatException e){
                    return false;
                }
            }
            return IPv4Valid && CIDRValid;
    }

    public static boolean isIPv4(String IPv4){
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
            return isIPv4;
    }
}