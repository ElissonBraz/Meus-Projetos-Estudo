package aulapratica4;

public class AlunoApp {
    
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Aomine Daike Nª Braz", "Jaguarana - Olinda - PE",  10.0, 7.0);

        aluno1.calcularMedia();

        System.out.println(aluno1.toString());
    }
}
