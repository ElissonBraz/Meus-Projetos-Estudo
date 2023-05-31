package entities;

public class MaiorPosicao {
    private double numero;

    public MaiorPosicao(double numero) {
        this.numero = numero;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.format("%.1f", numero, " ");
    }

    
}
