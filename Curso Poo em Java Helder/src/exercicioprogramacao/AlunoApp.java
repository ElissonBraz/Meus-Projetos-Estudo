package exercicioprogramacao;

public class AlunoApp {
    
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("André Luiz da Silva Athos", "Rua Sosi - nº 345 - Recife - PE", 8,7);
        Professor professor1 = new Professor("Susana Sá de Lima e Silva", "Rua Mene - nª 24 - Norton - PE", "Lógica de Programação");

        System.out.println(aluno1.toString());
        System.out.println(professor1.toString());
    }
}
