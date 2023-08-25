package aulapratica5;

public class AlunoApp {
    
    public static void main(String[] args) {
        
        // Aluno aluno1 = new Aluno(10, 5);
        Aluno aluno2 = new Aluno(10, -5);

        try {
            aluno2.validaNota();
            System.out.println("Aluno com Nota Valida!");
        } catch (NotaNegativaException nne) {
            System.out.println(nne.getMessage());
        }
    }
}
