import java.util.ArrayList;
import java.util.Scanner;

class Project{
    public static void main(String[] args){
    
    class Aluno{
        private String nome;
        private int idade;
    }
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    String nome;
    Scanner input = new Scanner(System.in);
    Aluno aluno = new Aluno();
        System.out.println("Qual o nome deste aluno ? : ");
        aluno.nome = input.nextLine();
        System.out.println("Qual é a idade deste aluno ? : ");
        aluno.idade = input.nextInt();
        // System.out.println("O nome deste aluno é "+aluno1.nome+ " e a sua idade é  "+aluno1.idade);
        alunos.add(aluno);
        System.out.println(alunos.get(0).nome + alunos.get(0).idade);
    }
}