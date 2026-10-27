public class Exercice1 {

    public static String digits7Segs[][] = {
            { " _ ", "  ", " _ ", " _ ", "   ", " _ ", " _ ", " _ ", " _ ", " _ ", "   " }, // Top line
            { "| |", " |", " _|", " _|", "|_|", "|_ ", "|_ ", "  |", "|_|", "|_|", " ° " }, // Middle line
            { "|_|", " |", "|_ ", " _|", "  |", " _|", "|_|", "  |", "|_|", " _|", " ° " }, // Bottom line
    };

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Veuillez passer 3 nombres en paramètre.");
            return;
        }
        String[] time = { args[0], args[1], args[2] };
        for (int level = 0; level < 3; level++) {
            for (int i = 0; i < 3; i++) {
                Exercice1.displayInteger(time[i], level);
                if (i < 2) {
                    Exercice1.displaySeparator(level);
                }
            }
            System.out.print("\n");
        }
    }

    public static void displayInteger(String numberToString, int level) {
        for (int i = 0; i < numberToString.length(); i++) {
            int asciiCode = Integer.valueOf(numberToString.charAt(i));
            if (asciiCode >= 48 && asciiCode <= 57) {
                System.out.print(Exercice1.digits7Segs[level][asciiCode-'0']);
            }
        }
    }

    public static void displaySeparator(int level) {
        System.out.print(Exercice1.digits7Segs[level][10]);
    }
}