package aulapratica3;

public class ContaCorrente {
    
    private int numero, agencia; 
    private float limite;
    
    public ContaCorrente(int numero, int agencia) {
        this.numero = numero;
        this.agencia = agencia;
    }

    public ContaCorrente(int numero, int agencia, float limite) {
        this.numero = numero;
        this.agencia = agencia;
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "ContaCorrente [numero=" + numero + ", agencia=" + agencia + ", limite=" + limite + "]";
    }

    
}
