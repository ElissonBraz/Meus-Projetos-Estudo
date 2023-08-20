package aulapratica1;

public class Pessoa {

    private int codigo;
    private String pessoa;

    public Pessoa(int codigo, String pessoa) {
        this.codigo = codigo;
        this.pessoa = pessoa;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    
}