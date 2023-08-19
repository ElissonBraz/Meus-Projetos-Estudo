package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class CoodPonto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);

        float pontoX;
        float pontoY;

        pontoX = ent.nextFloat();
        pontoY = ent.nextFloat();

        if (pontoX == 0.0f && pontoY == 0.0f) {
            System.out.println("Origem");
        } 
        if (pontoY == 0 && pontoX != 0) {
            System.out.println("Eixo X");
        } 
        if (pontoX == 0 && pontoY != 0) {
            System.out.println("Eixo Y");
        } 
        if (pontoX > 0 && pontoY > 0) {
            System.out.println("Q1");
        } 
        if (pontoX > 0 && pontoY < 0) {
            System.out.println("Q4");
        }
        if (pontoX < 0 && pontoY < 0) {
            System.out.println("Q3");
        }
        if (pontoX < 0 && pontoY > 0) {
            System.out.println("Q2");
        }

        ent.close();
    }
}