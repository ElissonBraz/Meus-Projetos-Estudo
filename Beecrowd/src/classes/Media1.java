package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        double a, b, mediaPonderada;

        a = leia.nextDouble();
        b = leia.nextDouble();

        mediaPonderada = ((a * 3.5) + (b * 7.5)) / 11;

        System.out.println(String.format("MEDIA = %.5f", mediaPonderada));

        leia.close();
    }
}
