package main;

import components.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Student> listOfStudents = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        int condicao = 1;
        while (condicao != 0) {
            System.out.println("Para sair digite 0, para continuar digite 1, 2 para remover, 3 para procurar");

            condicao = scanner.nextInt();
            if(condicao == 1){
                System.out.println("Qual o nome do aluno ? : ");
                String name = scanner.next();
                Student student = new Student(name);
                student.setRegistration(listOfStudents.size());
                listOfStudents.add(student);
                System.out.println(listOfStudents);
            } else if(condicao == 2){
                System.out.println("Qual aluno você quer remover ? ");
                int remove = scanner.nextInt();
                if(listOfStudents.size() >= 0 && remove >= listOfStudents.size()-1) {
                    System.out.println("Você removeu " + listOfStudents.get(remove).getName() + " com sucesso !");
                    listOfStudents.remove(remove);
                    int i = 0;
                    ArrayList<Student> listOfStudents2 = new ArrayList<>();
                    for (Student s : listOfStudents) {
                        {
                            if (s.getName() != null) {
                                s.setRegistration(listOfStudents2.size());
                                listOfStudents2.add(s);
                            }
                        }
                    }
                    listOfStudents.removeAll(listOfStudents);
                    listOfStudents.addAll(listOfStudents2);
                } else{
                    throw new IndexOutOfBoundsException("Posição invalida !");
                }
            } else if(condicao == 3){
                    System.out.println("Qual o nome do aluno ? ");
                    String name = scanner.next();
                    Student procurar = new Student(name);
                    for (Student e : listOfStudents
                    ) {
                        System.out.println("Resposta :");
                        if (procurar.getName().toUpperCase().equals(e.getName().toUpperCase())) {

                            System.out.println(e.toString());

                        }
                }
                }
            }
        }

}
