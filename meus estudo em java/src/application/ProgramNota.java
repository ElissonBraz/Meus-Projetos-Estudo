package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PessoaMaisVelho;
import entities.PrimeiraNota;
import entities.SegundaNota;
import entities.Vetores;

public class ProgramNota {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Quantos alunos serao digitados? ");
        Vetores n = new Vetores(0);
        n.setNumero(ent.nextInt());
        int numero = n.getNumero();

        Vetores[] vetor = new Vetores[numero];

        PrimeiraNota[] primeiraNota = new PrimeiraNota[numero];
        SegundaNota[] segundaNota = new SegundaNota[numero];
        PessoaMaisVelho[] aluno = new PessoaMaisVelho[numero];


        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " +  (i + 1) + "o" +  " aluno:");
            String nome = ent.next();
            double nota1 = ent.nextDouble();
            double nota2 = ent.nextDouble();
            aluno[i] = new PessoaMaisVelho(nome);
            primeiraNota[i] = new PrimeiraNota(nota1);
            segundaNota[i] = new SegundaNota(nota2);
        }

        System.out.println("Alunos aprovados:");
        double media = 0.0;

	    for (int i = 0; i< vetor.length; i++) {
	     media = (primeiraNota[i].getPrimeiraNota() + segundaNota[i].getSegundaNota()) / 2;

	        if(media >= 6.0) {
	            System.out.printf("%s\n", aluno[i]);
	        }
	    }
        
        ent.close();
    }


















}