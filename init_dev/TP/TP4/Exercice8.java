import java.util.Scanner;

public class Exercice8 {
    public static void main(String[] args) {
        System.out.println("Saisissez une IPv6");
        try (Scanner scanner = new Scanner(System.in)) {
            String IPv6 = scanner.next();
            int totalPeriod = 0;
            int i = 0;
            boolean isIPv6 = true;
            boolean hasGroupedZeros = false;
            String currentDigitGroup = "";
            if (IPv6.charAt(0) == ':' || IPv6.charAt(IPv6.length() - 1) == ':')
                isIPv6 = false;
            while (i < IPv6.length() && isIPv6) {
                if (IPv6.charAt(i) == ':') {
                    totalPeriod++;
                    if (currentDigitGroup.length() == 0) {
                        if (!hasGroupedZeros) {
                            hasGroupedZeros = true;
                        } else {
                            isIPv6 = false;
                        }
                    }
                    if (currentDigitGroup.length() > 4) {
                        isIPv6 = false;
                    }
                    currentDigitGroup = "";
                    if (totalPeriod > 7) {
                        isIPv6 = false;
                    }
                } else if (Exercice8.isValidCaracter(IPv6.charAt(i))) {
                    currentDigitGroup += IPv6.charAt(i);
                } else {
                    isIPv6 = false;
                }
                i++;
            }
            if (totalPeriod < 7 && !(totalPeriod == 6 && hasGroupedZeros)) {
                isIPv6 = false;
            }
            if (isIPv6 == true) {
                System.out.println("C'est une IPv6 valide");
            } else {
                System.out.println("Ce n'est pas une IPv6");
            }
        }
    }

    private static boolean isValidCaracter(Character character) {
        return (Character.isDigit(character)
                || character == 'a'
                || character == 'b'
                || character == 'c'
                || character == 'd'
                || character == 'e'
                || character == 'f');
    }
}