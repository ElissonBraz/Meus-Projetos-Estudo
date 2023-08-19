package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        int codigo1, codigo2 , quantidade1, quantidade2;
        double peca1, peca2, valor1, valor2, total;

        codigo1 = leia.nextInt();
        quantidade1 = leia.nextInt();
        peca1 = leia.nextDouble();
        codigo2 = leia.nextInt();
        quantidade2 = leia.nextInt();
        peca2 = leia.nextDouble();


        valor1 = quantidade1 * peca1;
        valor2 = quantidade2 * peca2;

        total = valor1 + valor2;

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));

        int ds = codigo1 + codigo2;
        System.out.println(ds);

        leia.close();
    }
}
