import java.util.ArrayList;
import java.util.Scanner;

class Project{
    public static void main(String[] args){

        class Aluno{
            String nome;
            int idade;
        }
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        
        for(int x=0; x<2; x++){   
            Aluno aluno = new Aluno();
            Scanner input = new Scanner(System.in);      
            System.out.println("Qual o nome do " + (x+1) + "° aluno");
            aluno.nome = input.nextLine();
            System.out.println("Qual a idade do " + (x+1) + "° aluno");
            aluno.idade = input.nextInt();
            alunos.add(x, aluno);
        }
        for(int y=0; y<2; y++){
            System.out.println("O nome do " + (y+1) + "° aluno é " + alunos.get(y).nome + " e a sua idade é " + alunos.get(y).idade);
        }
    }
}