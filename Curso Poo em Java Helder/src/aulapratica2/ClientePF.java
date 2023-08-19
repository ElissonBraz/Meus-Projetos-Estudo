package aulapratica2;

public class ClientePF extends Cliente {

    private String cpf;

    public ClientePF(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString() 
        + ", CPF: " + this.getCpf() + "";
    }

    
}