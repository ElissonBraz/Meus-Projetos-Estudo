package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class SalarioBonus {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner leia = new Scanner(System.in);
        String vendedor;
        double salarioFixo, totalVendas, total, bonus;

        vendedor = leia.nextLine();
        salarioFixo = leia.nextDouble();
        totalVendas = leia.nextDouble();
        bonus = (15.0 / 100.0) * totalVendas;
        total = bonus + salarioFixo;


        System.out.println(vendedor);
        System.out.println(String.format("TOTAL = R$ %.2f", total));

        leia.close();
    }
}