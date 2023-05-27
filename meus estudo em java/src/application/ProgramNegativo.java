package application;

import java.util.Scanner;

import entities.NegativVect;

public class ProgramNegativo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.printf("Quantos numeros voce vai digitar? ");
        int n = read.nextInt();

        NegativVect[] vect = new NegativVect[n];

        for (int i = 0; i < vect.length; i++) {
            read.nextLine();
            System.out.println("Digite um numero: ");
            int numero = read.nextInt();
            vect[i] = new NegativVect(numero);
        }

        System.out.println("NUMEROS NEGATIVOS:");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getNumero() < 0) {
                System.out.println(String.format("%d\n", vect[i].getNumero()));
            }
        }

        read.close();
    }
}
