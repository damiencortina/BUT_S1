import java.util.Scanner;

public class Exercice11 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Saisissez une année :");
            int annee = scanner.nextInt();
            System.out.println("Saisissez un mois :");
            int mois = scanner.nextInt();
            System.out.println("Saisissez un jour :");
            int jour = scanner.nextInt();
            int result = 0;
            for(int i = 1970; i<annee; i++){
                if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
                    result += 366*24*3600;
                }else{
                    result += 365*24*3600;
                }
            }
            for(int y = 1; y<mois; y++){
                if(y == 2){
                    if((annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0){
                        result += 29*24*3600; 
                    }else{
                        result += 28*24*3600;
                    }
                }else if(y == 4 || y == 6 || y == 9 || y == 11){
                    result += 30*24*3600;
                }else{
                    result += 31*24*3600;
                }
            }
            result += (jour-1)*24*3600;
            System.out.println(result+" s");
        }
    }
}
