import java.util.Scanner;

// (A.GIERSH) En java, utiliser sytematiquement des double, en interne java calcule en double donc utiliser des float oblige a faire des conversions.
// Float est un peu plus leger mais ca n'a pas d'importance pour nos exercices
public class Exercice5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Saisir a");
            double a = Double.valueOf(scanner.next());
            System.out.println("Saisir b");
            double b = Double.valueOf(scanner.next());
            System.out.println("Saisir c");
            double c = Double.valueOf(scanner.next());
            /*
             * OU :
             * System.out.println("Saisir a, b et c");
             * double a = Double.valueOf(scanner.next());
             * double b = Double.valueOf(scanner.next());
             * double c = Double.valueOf(scanner.next());
             */

            if (a == 0) {
                Exercice4.solve(a, b);
            } else {
                double discriminant = Math.pow(b, 2) - 4 * a * c;
                if (discriminant == 0.0) {
                    System.out.println(-b / 2 * a);
                } else if (discriminant > 0.0) {
                    System.out.println("2 solutions :" + ((-b - Math.sqrt(discriminant)) / (2 * a)) + " et "
                            + ((-b + Math.sqrt(discriminant)) / (2 * a)));
                } else {
                    double x1_re = -b / (2 * a);
                    double x1_im = -Math.sqrt(-discriminant) / (2 * a);
                    double x2_re = x1_re;
                    double x2_im = -x1_im;
                    System.out.println(x1_re + " + i*" + x1_im);
                    System.out.println(x2_re + " + i*" + x2_im);
                }
            }
        }
    }
}
