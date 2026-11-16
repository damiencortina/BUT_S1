import java.util.Arrays;
import java.util.Random;

public class Exercice3 {
    public static void main(String[] args){
        int[] intArray = {1,2,3,4,5};
        int[] shuffledArray = Exercice3.shuffleFisherYates(intArray);
        System.out.println(Arrays.toString(shuffledArray));
    }

    public static int[] shuffleFisherYates(int[] intArray){
        int currentIndex = intArray.length-1;
        Random random = new Random();
        while(currentIndex>0){
            int shuffledIndex = random.nextInt(currentIndex);
            int temp = intArray[currentIndex];
            intArray[currentIndex] = intArray[shuffledIndex];
            intArray[shuffledIndex] = temp;
            currentIndex--;
        }
        return intArray;
    }
}