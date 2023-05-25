package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductVect;


public class ProgramVectPrice {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        int n = read.nextInt();
        ProductVect[] vect = new ProductVect[n];

        for (int i = 0; i < vect.length; i++) {
            read.nextLine();
            String name = read.nextLine();
            double price = read.nextDouble();
            vect[i] = new ProductVect(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;

        System.out.println(String.format("AVERAGE HEIGHT = %.2f", avg));

        read.close();
    }
}
