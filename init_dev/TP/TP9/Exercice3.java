import java.util.Arrays;
import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        System.out.println("Saisissez une IPv4");
        try (Scanner scanner = new Scanner(System.in)) {
            // String IPv4 = scanner.next();
            String IPv4 = "192.168.10.31/27";
            if (Exercice1.isIPv4WithCIDR(IPv4)) {
                String[] IPv4Parts = IPv4.split("/");
                System.out.println(Exercice3.getNetworkSize(Integer.valueOf(IPv4Parts[1])));
                System.out.println(Exercice3.getMaskSize(Exercice3.getNetworkSize(Integer.valueOf(IPv4Parts[1]))));
            } else {
                System.out.println("C'est non");
            }
        }
    }

    public static int getNetworkSize(int maskSize){
        return ((int) Math.pow(2,32-maskSize))-2;
    }

    public static int getMaskSize(int hostNumber){
        int power = 0;
        hostNumber += 2;
        while(hostNumber>1){
            hostNumber/=2;
            power++;
        }
        return -(power-32);
    }
}