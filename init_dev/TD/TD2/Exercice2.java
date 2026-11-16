import java.util.Arrays;
import java.util.Random;

public class Exercice2 {
    public static void main(String[] args){
        int[] intArray = {1,2,3,4,5};
        int[] shuffledArray = Exercice2.shuffle(intArray);
        System.out.println(Arrays.toString(shuffledArray));
    }

    public static int[] shuffle(int[] intArray){
        int remainingElements = intArray.length;
        int[] shuffledArray = new int[remainingElements];
        Random random = new Random();
        while(remainingElements>0){
            int x = random.nextInt(remainingElements);
            shuffledArray[intArray.length-remainingElements] = intArray[x];
            intArray = Exercice1.supprElement(intArray, x);
            remainingElements--;
        }
        return shuffledArray;
    }
}