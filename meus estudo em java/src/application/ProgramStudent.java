package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramStudent {
    
    public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner (System.in);
		
		Student student = new Student();
		
		student.name = read.nextLine();
		student.grade1 = read.nextDouble();
		student.grade2 = read.nextDouble();
		student.grade3 = read.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
		
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("PASS");

		}
		read.close();

	}

}
