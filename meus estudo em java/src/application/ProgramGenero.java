package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PessoaMaisVelho;
import entities.PrimeiraNota;
import entities.Vetores;

public class ProgramGenero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int numero = ent.nextInt();

        Vetores[] vetor = new Vetores[numero];

        PrimeiraNota[] altura = new PrimeiraNota[numero];
        PessoaMaisVelho[] genero = new PessoaMaisVelho[numero];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Altura da " + (i + 1) + "a" + " pessoa: ");
            double estatura = ent.nextDouble();
            System.out.print("Genero da " + (i + 1) + "a" + " pessoa: ");
            String gen = ent.next();
            genero[i] = new PessoaMaisVelho(gen);
            altura[i] = new PrimeiraNota(estatura);
        }

        double maior = 0.0, menor = 0.0, media = 0.0, feminina = 0.0;
        int homens = 0, mulheres = 0;

        maior = altura[0].getPrimeiraNota();
        menor = altura[0].getPrimeiraNota();

        for (int i = 0; i < vetor.length; i++) {
            if (altura[i].getPrimeiraNota() > maior) {
                maior = altura[i].getPrimeiraNota();
            }
            if (altura[i].getPrimeiraNota() < menor) {
                menor = altura[i].getPrimeiraNota();
            }
        }

        System.out.println(String.format("Menor altura = %.2f", menor));
        System.out.println(String.format("Maior altura = %.2f", maior));

        for (int i = 0; i < vetor.length; i++) {
            if (genero[i].getNome().equals("M")) {
                homens++;
            } else {
                mulheres++;
                feminina += altura[i].getPrimeiraNota();
            }
        }

        media = feminina / mulheres;

        System.out.println(String.format("Media das alturas das mulheres = %.2f", media));
        System.out.println(String.format("Numero de homens = %d", homens));

        ent.close();
    }
}
