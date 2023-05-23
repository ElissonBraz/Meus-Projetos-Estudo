package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        int numero, horas;
        double salario, horasTrabalhadas;

        numero = leia.nextInt();
        horas = leia.nextInt();
        horasTrabalhadas = leia.nextDouble();

        salario = horas * horasTrabalhadas;

        System.out.println("NUMBER = " + numero);
        System.out.println(String.format("SALARY = U$ %.2f", salario));

        leia.close();
    }
}