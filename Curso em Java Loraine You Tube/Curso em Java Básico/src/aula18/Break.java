package aula18;

import java.util.Scanner;

public class Break {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Entre com um número");
        int num = ent.nextInt();
        
        System.out.println("Entre com um limite");
        int max = ent.nextInt();

        for (int i = num; i <= max; i++) {

            if (i % 7 == 0) {
                System.out.println("O valor de i é: " + i);
                break;
            }
        }

        ent.close();
    }

}
