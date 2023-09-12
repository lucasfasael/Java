package components;

import java.util.LinkedList;
import java.util.Scanner;

public class SistemaAlunos {
    LinkedList<Aluno> alunos = new LinkedList<>();
    public void start (){

        int i = 1;
        Scanner scanner = new Scanner(System.in);
        while(i != 0){

            System.out.println("Digite o nome do aluno: ");
            String nome = scanner.next();
            System.out.println("Digite a matricula do fulero: ");
            int matricula = scanner.nextInt();
            alunos.add(new Aluno(nome, matricula));
            filtro(scanner, alunos);
            System.out.println("Quer sair ? digite 0");
            int texto = scanner.nextInt();
            if(texto == 0){
                i = 0;
            }

        }
        System.out.println("Quer remover quem porra ? : ");
        int indice = scanner.nextInt();
        alunos.remove(1);
        System.out.println("Adicione mais um: ");
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.next();
        System.out.println("Digite a matricula do fulero: ");
        int matricula = scanner.nextInt();
        alunos.add(new Aluno(nome, matricula));
        System.out.println(alunos);
        for (Aluno e:alunos
        ) {
            System.out.println(alunos.indexOf(e));
        }
    }

    private void filtro(Scanner scanner, LinkedList<Aluno> alunos) {
        System.out.println("Como você quer listar os alunos ? : ");
        String text = scanner.next();
        alunos.forEach(item -> {
            if( item.getNome().toUpperCase().contains(text.toUpperCase())) {
                System.out.println(item);
            }

        });
    }
}
