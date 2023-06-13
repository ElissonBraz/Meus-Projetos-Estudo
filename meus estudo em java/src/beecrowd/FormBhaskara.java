package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class FormBhaskara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);

        double valorA, valorB, valorC;
        double delta, valorRaizA;
        double raiz1, raiz2;

        valorA = ent.nextDouble();
        valorB = ent.nextDouble();
        valorC = ent.nextDouble();

        delta = Math.pow(valorB, 2.0) - (4.0 * valorA * valorC);
        valorRaizA = 2.0 * valorA;
        raiz1 = (-valorB + Math.sqrt(delta)) / valorRaizA;
        raiz2 = (-valorB - Math.sqrt(delta)) / valorRaizA;

        if (delta < 0 || valorRaizA == 0) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.println(String.format("R1 = %.5f", raiz1));
            System.out.println(String.format("R2 = %.5f", raiz2));
        }
        ent.close();
    }
}
