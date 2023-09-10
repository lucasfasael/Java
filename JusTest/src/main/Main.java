package main;

import components.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean condicao = true;
        ArrayList<Student> students = new ArrayList<>();
        while(condicao){
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is the name of the student ? ");
            String name = scanner.nextLine();
            System.out.println("What is the first grade of the student ? ");
            double n1 = scanner.nextDouble();
            System.out.println("What is the second grade of the student ? ");
            double n2 = scanner.nextDouble();
            Student student = new Student(name, n1, n2);
            students.add(student);
            System.out.println(students);

        }
        Student student = new Student("Lucas", 2, 9);
        student.calculator();
    }
}
