package application;

/* Aula do Curso em Java POO da Gustavo Guanabara Aula 06*/
import entities.ControleRemoto;

public class Aula {

    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();
        controle.abrirMenu();
        controle.maisVolume();
        controle.play();
        
    }


}
