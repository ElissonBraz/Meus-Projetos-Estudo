package entities;

public class NumeroPares {
    private int numeros;

    public NumeroPares(int numeros) {
        this.numeros = numeros;
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "" + numeros + " ";
    }

    
}
