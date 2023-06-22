package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

/* Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
 * N funcionários.Não deve haver repetição de id.
 * Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso,
 * o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar
 * a operação. Ao final, mostrar a listagem atualizada dos funcionários, conforme exemplos.
 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado
 * livremente. Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.
 */

public class AppliEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);
        List<Integer> id = new ArrayList<>();
        List<String> name = new ArrayList<>();
        List<Double> salary = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int numero  = ent.nextInt();

        Employee[] vet = new Employee[numero];
        Employee emp = new Employee();

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Emplyoee #" + (i + 1) + ":");
            System.out.print("Id: ");
            emp.setId(ent.nextInt());
            System.out.print("Name: ");
            emp.setName(ent.next());
            System.out.print("Salary: ");
            emp.setSalary(ent.nextDouble());
            id.add(emp.getId());
            name.add(emp.getName());
            salary.add(emp.getSalary());

        }



        ent.close();
    }
    
}
