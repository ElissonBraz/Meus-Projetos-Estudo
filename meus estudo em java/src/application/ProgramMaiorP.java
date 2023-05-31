package application;

import java.util.Locale;
import java.util.Scanner;

import entities.MaiorPosicao;

public class ProgramMaiorP {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n  = read.nextInt();

        MaiorPosicao[] vect = new MaiorPosicao[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            double numero = read.nextDouble();
            vect[i] = new MaiorPosicao(numero);
        }
        double maxValor = 0.0;
        int posicao = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getNumero() > maxValor) {
                maxValor = vect[i].getNumero();
                posicao = i;
            }
        }
        System.out.print("MAIOR VALOR = " + maxValor);
        System.out.println("");
        System.out.print("POSICAO DO MAIOR VALOR = " + posicao);
        
        read.close();
    }
}
