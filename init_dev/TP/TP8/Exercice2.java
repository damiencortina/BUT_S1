import java.time.LocalTime;

public class Exercice2 {

    public static String digits7Segs[][] = {
            { " _ ", "  ", " _ ", " _ ", "   ", " _ ", " _ ", " _ ", " _ ", " _ ", "   " }, // Top line
            { "| |", " |", " _|", " _|", "|_|", "|_ ", "|_ ", "  |", "|_|", "|_|", " ° " }, // Middle line
            { "|_|", " |", "|_ ", " _|", "  |", " _|", "|_|", "  |", "|_|", " _|", " ° " }, // Bottom line
    };

    public static void main(String[] args) {
        try {
            while (true) {
                LocalTime time = LocalTime.now();
                String[] timeElements = {
                        String.valueOf(time.getHour()),
                        String.valueOf(time.getMinute()),
                        String.valueOf(time.getSecond())
                };
                for (int level = 0; level < 3; level++) {
                    for (int i = 0; i < 3; i++) {
                        Exercice1.displayInteger(timeElements[i], level);
                        if (i < 2) {
                            Exercice1.displaySeparator(level);
                        }
                    }
                    System.out.print("\n");
                }
                Thread.sleep(1000); // Attente de 1000 ms = 1 sec
                System.out.print("\033[H\033[J");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}