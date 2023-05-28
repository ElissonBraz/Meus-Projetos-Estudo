package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class ProgramAlturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = read.nextInt();

        Pessoas[] vect = new Pessoas[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a" + " pessoa: ");
            System.out.print("Nome: ");
            String nome = read.next();
            System.out.print("Idade: ");
            int idade = read.nextInt();
            System.out.print("Altura: ");
            double altura = read.nextDouble();
            vect[i] = new Pessoas(nome, idade, altura);
        }

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getAltura();
        }

        double media = soma / n;
        System.out.println(String.format("Altura média: %.2f", media));

        int menorIdade = 0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                menorIdade++;
            }

        }

        double percentualMenor = ((double) menorIdade / n) * 100.0;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n",  percentualMenor);

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                String pessoa = vect[i].getNome();
                System.out.printf("%s\n", pessoa);
            }

        }

        read.close();
    }
}
