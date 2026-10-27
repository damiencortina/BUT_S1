import java.util.Arrays;

public class Exercice2 {
    public static void main(String[] args) {
        double[][] doubleArray = Utils.makeArray(2, 2);
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(Arrays.toString(doubleArray[i]));
        }
        System.out.println("devient :");
        doubleArray = horizontalSwitch(doubleArray);
        doubleArray = verticalSwitch(doubleArray);
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(Arrays.toString(doubleArray[i]));
        }
    }

    private static double[][] horizontalSwitch(double[][] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            double temp = doubleArray[i][0];
            doubleArray[i][0] = doubleArray[i][1];
            doubleArray[i][1] = temp;
        }
        return doubleArray;
    }

    private static double[][] verticalSwitch(double[][] doubleArray) {
        double[] temp = doubleArray[0];
        doubleArray[0] = doubleArray[1];
        doubleArray[1] = temp;
        return doubleArray;
    }
}