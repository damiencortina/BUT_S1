import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Combien de nombres premiers voulez-vous :");
            int nbEntiers = scanner.nextInt();
            ArrayList<Integer> primeNumbers = new ArrayList<Integer>(Arrays.asList(2));
            int currentInt = 3;
            while(primeNumbers.size() < nbEntiers){
                int testedIndex = 0;
                boolean isPrime = true;
                while(primeNumbers.get(testedIndex)<=Math.sqrt(currentInt) && isPrime){
                    if(currentInt%primeNumbers.get(testedIndex) == 0){
                        isPrime = false;
                    }
                    testedIndex++;
                }
                if(isPrime){
                    primeNumbers.add(currentInt);
                }
                currentInt++;
            }
            Utils.displayIntegerList(primeNumbers);
        }
    }
}
