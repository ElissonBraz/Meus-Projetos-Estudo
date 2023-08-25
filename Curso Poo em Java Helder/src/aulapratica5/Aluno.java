package aulapratica5;

public class Aluno {
    
    private double nota1, nota2;

    public Aluno(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String validaNota() throws NotaNegativaException {

        if ((nota1 < 0) || (nota2 < 0)) {
            throw new NotaNegativaException();
        } else {
            
            return "Nota Valida";
            
        }

    }
    
}
