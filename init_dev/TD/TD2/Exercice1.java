public class Exercice1 {
    public static void main(String[] args){
        int[] intArray = {1,2,3,4,5};
        Exercice1.supprElement(intArray, 2);
    }

    public static int[] supprElement(int[] intArray, int indice){
        for(int i = indice; i < intArray.length-1; i++){
            intArray[i] = intArray[i+1];
        }
        return intArray;
    }
}