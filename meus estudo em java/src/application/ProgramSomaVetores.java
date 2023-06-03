package application;

import java.util.Scanner;

import entities.Vetores;

public class ProgramSomaVetores {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Vetores n = new Vetores(0);

        System.out.print("Quantos valores vai ter cada vetor? ");
        n.setNumero(read.nextInt());

        System.out.println("Digite os valores do vetor A:");
        Vetores[] vectA = new Vetores[n.getNumero()];
        for (int i = 0; i < vectA.length; i++) {
            int numeroA = read.nextInt();
            vectA[i] = new Vetores(numeroA);
        }

        System.out.println("Digite os valores do vetor B:");
        Vetores[] vectB = new Vetores[n.getNumero()];
        for (int i = 0; i < vectA.length; i++) {
            int numeroB = read.nextInt();
            vectB[i] = new Vetores(numeroB);
        }

        System.out.println("VETOR RESULTANTE:");
        Vetores[] vectR = new Vetores[n.getNumero()];
        for (int i = 0; i < vectA.length; i++) {
            vectR[i] = new Vetores(vectA[i].getNumero() + vectB[i].getNumero());
            System.out.println(vectR[i].getNumero());
        }

        read.close();
    }
}
