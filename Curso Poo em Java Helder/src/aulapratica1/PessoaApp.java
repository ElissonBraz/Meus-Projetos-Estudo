package aulapratica1;

public class PessoaApp {
    
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa(1, "Helder");

        Pessoa pessoa2 = new Pessoa(2, "Ana");

        System.out.println("O nome do objeto pessoa é? ");
        System.out.println(pessoa1.getPessoa());
        System.out.println(pessoa2.getPessoa());
    }
}
