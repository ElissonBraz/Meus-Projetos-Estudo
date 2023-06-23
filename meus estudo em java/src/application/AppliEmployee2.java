package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class AppliEmployee2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int numero  = ent.nextInt();

        Employee[] vet = new Employee[numero];

        for (int i = 0; i < vet.length; i++) {
            Employee emp = new Employee(0, null, 0.0);
             System.out.println();
            System.out.println("Emplyoee #" + (i + 1) + ":");
            System.out.print("Id: ");
            emp.setId(ent.nextInt());
            while (emp.hasId(list, emp.getId())) {
                System.out.println("Id already taken! Try  again: ");
                emp.setId(ent.nextInt());
            }
            System.out.print("Name: ");
            ent.nextLine();
            emp.setName(ent.nextLine());
            System.out.print("Salary: ");
            emp.setSalary(ent.nextDouble());
            list.add(emp);
        }

        System.out.println();
        System.out.print("Salary Increase: ");
        int idSalary = ent.nextInt();
        
        Employee pos = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
        
        if (pos == null ) {
            System.out.println("This id does not exist!");
            
        } else {
            System.out.print("Enter the percentege: ");
            double percent  = ent.nextDouble();
            pos.increaseSalary(percent);
        }
        
        System.out.println();
        System.out.println("List of employees:");
        for (Employee emp : list) {
            System.out.println(emp);
        }

        ent.close();
    }
    
}
