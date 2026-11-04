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

    public static void studyIPv4(String IPv4, int mask) {
        String binaryIPv4 = Exercice2.convertIPV4ToBinary(IPv4);
        String hostAddress = binaryIPv4.substring(mask, 12 * 4 - mask);
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
        return bin;
    }

    public static String convertHexToBinary(String hex) {
        System.out.println(hex);
        Character[] characterArray = new Character[] {
                '0',
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
                "0000",
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
        for (int i = 0; i < hex.length(); i++) {
            for (int j = 0; j < characterArray.length; j++) {
                if (characterArray[j] == hex.charAt(i)) {
                    binary = binary + binaryArray[j];
                }
            }
            System.out.println(binary);
        }
        return binary;

    }

}