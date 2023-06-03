package application;

import java.util.Scanner;

import entities.NumeroPares;

public class ProgramMediaPares {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        NumeroPares n = new NumeroPares(read.nextInt());

        NumeroPares[] vect = new NumeroPares[n.getNumeros()];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            int numero =  read.nextInt();
            vect[i] = new NumeroPares(numero);
        }

        double media = 0.0;
        double cont = 0.0; 
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getNumeros() % 2 == 0) {
                 media += vect[i].getNumeros();
                 cont++;
            }
        }

        if (cont == 0) {
            System.out.print("NENHUM NUMERO PAR ");   
       } else {
        media = media / cont;
        System.out.print("MEDIA DOS PARES = " + media); 
       }
       
        read.close();
    }
}
