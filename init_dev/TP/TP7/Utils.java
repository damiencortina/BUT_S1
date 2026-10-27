import java.util.Random;

public class Utils {

    public static double[][] makeArray(int lines, int columns) {
        Random r = new Random();
        double[][] doubleArray = new double[lines][columns];
        for (int i = 0; i < lines; ++i)
            for (int j = 0; j < columns; ++j)
                doubleArray[i][j] = r.nextDouble() * 100.0 - 50.0;
        return doubleArray;
    }

    public static void main(String[] args) {

    }

}
