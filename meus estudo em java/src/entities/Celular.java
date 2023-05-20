package entities;

public class Celular {
    // caracteristicas -> atributos
    private String nome;
    private String sistemaOperacional;
    private int armazenamento;
    private float tamanhoTela;
    
    public Celular(String nome, String sistemaOperacional, int armazenamento, float tamanhoTela) {
        this.nome = nome;
        this.sistemaOperacional = sistemaOperacional;
        this.armazenamento = armazenamento;
        this.tamanhoTela = tamanhoTela;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public float getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(float tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    @Override
    public String toString() {
        return "Aparelho " + nome + ", com tela de "+ String.format("%.2f", tamanhoTela) 
        + "''" + ", com " + armazenamento + "gb e SO " + sistemaOperacional;
    }



}
