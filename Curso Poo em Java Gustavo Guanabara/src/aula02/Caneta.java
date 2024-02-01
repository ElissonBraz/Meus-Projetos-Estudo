package aula02;
public class Caneta {
    String cor;
    String modelo;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.print("Uma Caneta "+ this.cor + " ");
        System.out.print("com uma ponta "+ this.ponta + " ");
        System.out.print("de carga "+ this.carga + " ");
        System.out.print("com um modelo "+ this.modelo + " ");
        System.out.println("está tampada? "+ this.tampada + ".");
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar.");
        } else {
            System.out.println("Estou Rabiscando");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar () {
        this.tampada = false;
    }
}
