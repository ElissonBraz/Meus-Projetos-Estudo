package application;

import java.util.Scanner;

import entities.NumeroPares;

public class ProgramPares {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n  = read.nextInt();

        NumeroPares[] vect = new NumeroPares[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            int numeros = read.nextInt();
            vect[i] = new NumeroPares(numeros);
        }

        System.out.print("NUMEROS PARES: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getNumeros() % 2 == 0) {
                System.out.print(vect[i]);
            }
        }

        System.out.println("");
        System.out.print("NUMEROS PARES: ");
        int contPar = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getNumeros() % 2 == 0) {
                contPar++;
            }
        }

        System.out.print(contPar);

        read.close();
    }
}
