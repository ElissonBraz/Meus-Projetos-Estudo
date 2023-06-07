package application;

import java.util.Scanner;

import entities.IdadeMaisVelho;
import entities.MaisVelho;
import entities.PessoaMaisVelho;

public class ProgramMaisVelho {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        MaisVelho numero = new MaisVelho(0);
        System.out.print("Quantas pessoas serao digitadas? ");
        numero.setNumero(ent.nextInt());

        MaisVelho[] vetor = new MaisVelho[numero.getNumero()];

        int numeros = numero.getNumero();
        PessoaMaisVelho[] nome = new PessoaMaisVelho[numeros];
        IdadeMaisVelho[] idade = new IdadeMaisVelho[numeros];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a" + " pessoa: ");
            System.out.println("Nome: ");
            String nomes = ent.next();
            System.out.println("Idade: ");
            int idades = ent.nextInt();
            nome[i] = new PessoaMaisVelho(nomes);
            idade[i] = new IdadeMaisVelho(idades);
        }

        int maioridade = idade[0].getIdade();
        int posicaomaior = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (idade[i].getIdade() > maioridade) {
                maioridade = idade[i].getIdade();
                posicaomaior = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s\n", nome[posicaomaior]);

        ent.close();
    }

}