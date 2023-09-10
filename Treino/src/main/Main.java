package main;

import aluno.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        int i = 1;
        int cont = 0;
        Scanner scanner = new Scanner(System.in);
        while(i != 0){
            System.out.println("Digite 0 para sair ou 1 para continuar: ");
            i = scanner.nextInt();
            if(i != 0) {
                Aluno aluno = new Aluno();
                System.out.println("Digite  nome do aluno : ");
                String nome = scanner.next();
                aluno.setNome(nome);
                if (cont == 0) {
                    aluno.setAnterior(null);
                } else if (cont > 0){
                    System.out.println("ENTREI");
                    Aluno anterior = new Aluno();
                    Aluno posterior = new Aluno();
                    anterior = alunos.get(cont-1);
                    aluno.setAnterior(anterior);
                    alunos.setProximo(aluno);


                }
                alunos.add(aluno);
                cont++;
                System.out.println(alunos);
            }
        }
    }
}
