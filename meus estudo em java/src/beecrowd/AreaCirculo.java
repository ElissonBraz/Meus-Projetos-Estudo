package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner leia = new Scanner(System.in);
        double raio, n, area;

        n = 3.14159;
        raio = leia.nextDouble();

        area = n * Math.pow(raio, 2);

        System.out.printf("A=%.4f", area);

        leia.close();
    }
}
