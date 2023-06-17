package application;

import java.util.Scanner;

import entities.ContaBanco;

public class ProgramBanco {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);

        p1.estadoAtual();
        p2.estadoAtual();
        ent.close();
    }
}
