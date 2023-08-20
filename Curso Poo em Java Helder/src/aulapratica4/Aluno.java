package aulapratica4;

public class Aluno extends Pessoa implements SituacaoAcademica {
    
    private double nota1,nota2,media;

    public Aluno(String nome, String bairro, double nota1, double nota2) {
        super(nome, bairro);
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

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String verificacaoAprovacao() {
        if (this.media >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    @Override
    public double calcularMedia() {
        this.media = (this.nota1 + this.nota2) / 2;
        return this.media;
    }

    @Override
    public String toString() {
        return super.toString() + "Média:" + media + "";
    }

    
    
}
