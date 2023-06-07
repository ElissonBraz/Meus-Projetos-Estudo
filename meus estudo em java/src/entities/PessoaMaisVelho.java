package entities;

public class PessoaMaisVelho {
    private String nome;

    public PessoaMaisVelho(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "" + nome + "";
    }

    
}
