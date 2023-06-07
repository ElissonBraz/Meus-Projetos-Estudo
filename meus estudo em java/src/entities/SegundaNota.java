package entities;

public class SegundaNota {
    private double segundaNota;

    public SegundaNota(double segundaNota) {
        this.segundaNota = segundaNota;
    }

    public double getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(double segundaNota) {
        this.segundaNota = segundaNota;
    }

    @Override
    public String toString() {
        return "" + segundaNota + "";
    };

    
    
}
