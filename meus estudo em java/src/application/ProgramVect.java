package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVect {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        int n = read.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            vect[i] = read.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }
        double avg = sum / n;

        System.out.println(String.format("AVERAGE HEIGHT =  %.2f", avg));

        read.close();
    }
}
