package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AbaixoMedia;


public class ProgramAbaixoMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        AbaixoMedia n = new AbaixoMedia(0);
        n.setNumero(read.nextInt());

        AbaixoMedia[] vect = new AbaixoMedia[n.getNumero()];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            double numeroReal = read.nextDouble();
            vect[i] = new AbaixoMedia(numeroReal);
        }

        double media = 0.0;
        for (int i = 0; i < vect.length; i++) {
            media += vect[i].getNumeroReal();
        }
        System.out.println(String.format("MEDIA DO VETOR = %.3f", media));

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getNumeroReal() < media) {
                System.out.println(vect[i].getNumeroReal());
            }
        }

        read.close();
    }
}
