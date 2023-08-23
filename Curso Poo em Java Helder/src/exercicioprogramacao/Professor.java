package exercicioprogramacao;

public class Professor extends Atributos {

    private String titularizacao;

    public Professor(String nome, String endereco, String titularizacao) {
        super(nome, endereco);
        this.titularizacao = titularizacao; 
    }

    public String getTitularizacao() {
        return titularizacao;
    }

    public void setTitularizacao(String titularizacao) {
        this.titularizacao = titularizacao;
    }

    @Override
    public String toString() {
        return super.toString() + " Título: " + titularizacao + "";
    }

    

    
}