public class Exercice1 {
    public static void main(String[] args) {
        double[][] doubleArray = Utils.makeArray(10, 10);
        double average = 0.0;
        int elementNumber = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            for (int y = 0; y < doubleArray[i].length; y++) {
                average += doubleArray[i][y];
                elementNumber++;
                System.out.print(doubleArray[i][y]+ " ");
            }
            System.out.print("\n");
        }
        average /= elementNumber;
        System.out.println(average);
    }
}