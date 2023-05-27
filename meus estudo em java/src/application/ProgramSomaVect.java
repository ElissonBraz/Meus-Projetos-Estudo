package application;

import java.util.Locale;
import java.util.Scanner;

import entities.SomaVect;

public class ProgramSomaVect {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = read.nextInt();

        SomaVect[] vect = new SomaVect[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            double valor = read.nextDouble();
            vect[i] = new SomaVect(valor);
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i]);
        }

        System.out.println();
        double soma = 0.0;

        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getValor();
        }

        double media = soma / n;

        System.out.println(String.format("SOMA = %.2f", soma));
        System.out.println(String.format("MEDIA = %.2f", media));

        read.close();
    }
}
