package aula03;
public class Caneta {
    public String cor;
    public String modelo;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status() {
        System.out.print("Uma Caneta "+ this.cor + " ");
        System.out.print("com uma ponta "+ this.ponta + " ");
        System.out.print("de carga "+ this.carga + " ");
        System.out.print("com um modelo "+ this.modelo + " ");
        System.out.println("está tampada? "+ this.tampada + ".");
    }

    public void escrever() {
        System.out.println("Estou escrevendo!");
    }

    private void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar.");
        } else {
            System.out.println("Estou Rabiscando");
        }
    }

    protected void tampar() {
        this.tampada = true;
    }

    protected void destampar () {
        this.tampada = false;
    }
}
