package aulapratica2abstrata;

public abstract class Cliente {
    
    private String nome;
    private String endereco;
    
    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    @Override
    public String toString() {
        return "Nome: "+ this.getNome()
        + ", Endereço: "+ this.getEndereco();
    }

    public abstract int ganhaDesconto ();
    
}
