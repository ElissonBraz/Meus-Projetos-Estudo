package entities;

public class AbaixoMedia {
    private int numero;
    private double numeroReal;
    
    public AbaixoMedia(int numero) {
        this.numero = numero;
    }

    public AbaixoMedia(double numeroReal) {
        this.numeroReal = numeroReal;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getNumeroReal() {
        return numeroReal;
    }

    public void setNumeroReal(double numeroReal) {
        this.numeroReal = numeroReal;
    }

    @Override
    public String toString() {
        return String.format("%.1f", numeroReal);
    }

    
}
