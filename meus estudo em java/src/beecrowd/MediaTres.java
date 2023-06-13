package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class MediaTres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);

        float nota1, nota2, nota3, nota4;
        float mediaNota;

        nota1 = ent.nextFloat();
        nota2 = ent.nextFloat();
        nota3 = ent.nextFloat();
        nota4 = ent.nextFloat();

        mediaNota = ((nota1 * 2.0f) + (nota2 * 3.0f) + (nota3 * 4.0f) + (nota4 * 1.0f)) / 10.0f;
        System.out.println(String.format("Media: %.1f", mediaNota));

        if (mediaNota >= 7.0f) {
            System.out.println("Aluno aprovado.");  
        } 
        if (mediaNota < 5.0f) {
            System.out.println("Aluno reprovado.");
        }
        else if (mediaNota >= 5.0f && mediaNota <= 6.9f) {
            System.out.println("Aluno em exame.");
            double notaExame = ent.nextDouble();
            System.out.println(String.format("Nota do exame: %.1f", notaExame));
            double mediaFinal = (notaExame + mediaNota) / 2.0f;
            if (mediaFinal >= 5.0f) {
                System.out.println("Aluno aprovado.");
                System.out.println(String.format("Media final: %.1f", mediaFinal));
            } else {
                System.out.println("Aluno reprovado.");
                System.out.println(String.format("Media final: %.1f", mediaFinal));
            }
        }

        ent.close();
    }
}
