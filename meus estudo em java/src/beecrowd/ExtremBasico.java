package beecrowd;

import java.util.Scanner;

public class ExtremBasico {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int a, b, x;
        a = leia.nextInt();
        b = leia.nextInt();

        x = a + b;

        System.out.println("X = " + x);

        leia.close();
    }

}
