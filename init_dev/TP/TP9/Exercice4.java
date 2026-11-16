import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        System.out.println("Saisissez une IPv4");
        try (Scanner scanner = new Scanner(System.in)) {
            String IPv41 = "192.168.1.130/26";
            String IPv42 = "192.168.1.180/26";
            Exercice4.compare(IPv41, IPv42);
        }
    }

    public static void compare(String IPv41, String IPv42) {
        String[] IPv41Parts = IPv41.split("/");
        String host1 = Exercice2.getHostAddress2(IPv41Parts[0], Integer.valueOf(IPv41Parts[1]));
        String[] IPv42Parts = IPv42.split("/");
        String host2 = Exercice2.getHostAddress2(IPv42Parts[0], Integer.valueOf(IPv42Parts[1]));
        boolean same = true;
        int i = 0;
        if (host1.length() != host2.length()) {
            System.out.println("Pas les même");
            same = false;
        } else {
            System.out.println(host1.length());
            System.out.println(host1);
            System.out.println(host2);
            while (i < host1.length() && same) {
                System.out.print(host1.charAt(i));
                System.out.println(host2.charAt(i));
                if (host1.charAt(i) != host2.charAt(i)) {
                    same = false;
                }
                i++;
            }
        }
        if (same) {
            System.out.println("C'est les même");
        } else {
            System.out.println("C'est pas les même");
        }
    }
}