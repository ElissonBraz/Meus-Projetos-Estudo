package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class ProgramRent {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
         Scanner ent = new Scanner(System.in);

         Rent[] vect = new Rent[10];

         System.out.print("How many rooms will be rented? ");
         int n = ent.nextInt();

         for (int i = 1; i <= n; i++) {
            System.out.println("");
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            String name = ent.next();
            System.out.print("E-mail: ");
            String email = ent.next();
            System.out.print("Room: ");
            int roomNumber = ent.nextInt();
            vect[roomNumber] = new Rent(name, email);
         }
         
         System.out.println("");
         System.out.println("Busy rooms: ");
         for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
         }
         ent.close();
    }

    
}