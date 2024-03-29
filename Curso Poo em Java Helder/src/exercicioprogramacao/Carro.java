package exercicioprogramacao;

public class Carro {
    
    private String marca;
    private String modelo;
    private String anoFabricacao;

    public Carro(String marca, String modelo, String anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return marca + " " + modelo 
        + " , Ano: " + anoFabricacao + "";
    }

    
    
}
