package entities;

public class PrimeiraNota {
    private double primeiraNota;

    public PrimeiraNota(double primeiraNota) {
        this.primeiraNota = primeiraNota;
    }

    public double getPrimeiraNota() {
        return primeiraNota;
    }

    public void setPrimeiraNota(double primeiraNota) {
        this.primeiraNota = primeiraNota;
    }

    @Override
    public String toString() {
        return "" + primeiraNota + "";
    }

    
    
}
