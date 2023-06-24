package entities;
/* Aula do Curso em Java POO da Gustavo Guanabara Aula 06*/
import visual.Controlador;

public class ControleRemoto implements Controlador{

/* Atributos */
    private int volume;
    private boolean ligado;
    private boolean tocando;

/* Metodos Especiais */

    public ControleRemoto(int volume, boolean ligado, boolean tocando) {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

/*Metodos Abstratos */
    @Override
    public void ligar() {
     this.setLigado(true);
    }

    @Override
    public void desligar() {
       this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("------");
        System.out.println("Estpa Ligado? " + this.isLigado());
        System.out.println("Está Tocando? " + this.getVolume());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.println("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && ! (this.isTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        }
    }

    

    
}
