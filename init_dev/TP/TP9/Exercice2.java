import java.util.Arrays;
import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        System.out.println("Saisissez une IPv4");
        try (Scanner scanner = new Scanner(System.in)) {
            // String IPv4 = scanner.next();
            String IPv4 = "10.255.255.255/8";
            if (Exercice1.isIPv4WithCIDR(IPv4)) {
                String[] IPv4Parts = IPv4.split("/");
                Exercice2.studyIPv4(IPv4Parts[0], Integer.parseInt(IPv4Parts[1]));
            } else {
                System.out.println("C'est non");
            }
        }
    }

    public static String getHostAddress(String IPv4, int mask) {
        String binaryIPv4 = Exercice2.convertIPV4ToBinary(IPv4);
        return binaryIPv4.substring(mask, binaryIPv4.length()-1);
    }

    public static String getHostAddress2(String IPv4, int mask) {
        String binaryIPv4 = Exercice2.convertIPV4ToBinary(IPv4);
        return binaryIPv4.substring(binaryIPv4.length()-1-mask);
    }

    public static void studyIPv4(String IPv4, int mask) {
        String hostAddress = Exercice2.getHostAddress(IPv4, mask);
        System.out.println(hostAddress);
        Character firstBit = hostAddress.charAt(0);
        boolean bitsAreIdentical = true;
        for (int i = 1; i < hostAddress.length(); i++) {
            if (hostAddress.charAt(i) != firstBit) {
                bitsAreIdentical = false;
            }
        }
        if (bitsAreIdentical) {
            if (firstBit == '0') {
                System.out.println("Adresse réseau");
            } else {
                System.out.println("Adresse de diffusion");
            }
        } else {
            System.out.println("Adresse d'hôte");
        }
    }

    public static String convertIPV4ToBinary(String IPv4) {
        System.out.println(IPv4);
        System.out.println("-----");
        String[] IPv4Values = IPv4.split("\\.");
        String IPv4Bits = "";
        System.out.println(Arrays.toString(IPv4Values));
        for (int i = 0; i <= 3; i++) {
            String IPv4Value = IPv4Values[i];
            while (IPv4Value.length() < 3) {
                IPv4Value = '0' + IPv4Value;
            }
            IPv4Bits += Exercice2.convertNumToBinary(Integer.parseInt(IPv4Value));
        }
        System.out.println(IPv4Bits);
        return IPv4Bits;
    }

    public static String convertNumToBinary(int num){
        String bin = "";
        while (num > 0){
            int bit = num%2;
            num/=2;
            bin = bit + bin;
        }
        while(bin.length() < 8){
            bin = 0 + bin;
        }
        return bin;
    }

}