package entities;

public class SomaVect {
    private double valor;

    public SomaVect(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return valor + " ";
    }
    
    

    
}
