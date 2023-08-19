package aulapratica4;

public class AlunoApp {
    
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Aomine Daike Nª Braz", "Caixa D'Água", 10.0, 7.0);

        aluno1.calcularMedia();

        System.out.println("O "+ aluno1.toString() + " sendo: " + aluno1.verificacaoAprovacao());
    }
}
