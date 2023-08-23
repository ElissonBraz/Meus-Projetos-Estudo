package exercicioprogramacao;

public class Aluno extends Atributos {

    private double media,nota1,nota2;

    public Aluno(String nome, String endereco, double nota1, double nota2) {
        super(nome, endereco);
        this.nota1 = nota1;
        this.nota2 = nota2; 
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
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

    public double mediaAluno() {
        this.media = (this.nota1 + this.nota2) / 2;
        return this.media;

    }

    @Override
    public String toString() {
        return super.toString() + ", tirou a média de : " + this.mediaAluno() + "";
    }

    

}