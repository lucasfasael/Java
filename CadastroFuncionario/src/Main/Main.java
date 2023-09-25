package Main;

import Classes.*;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Funcionario> funcionarios = new LinkedList<>();
        int opcao = -1;

        while (opcao != 0){
            System.out.println("Bem vindo ao cadastro de funcionários !");
            System.out.println("Digite 0 para sair 1 para cadastrar um funcionário, 2 para pagar: ");
            Scanner input = new Scanner(System.in);
            opcao = input.nextInt();
            if(opcao == 0){
                break;
            } else if(opcao == 1){
                Scanner input2 = new Scanner(System.in);
                System.out.println("Qual o nome desta pessoa ? : ");
                String nome = input2.nextLine();
                System.out.println("Qual o cargo desta pessoa ? 1 estagiario, 2 patrao : ");
                int op = input2.nextInt();
                Cargo novo = null;
                if(op == 1){
                    Estagio estagio = new Estagio();
                    novo = estagio;
                } else if(op == 2){
                    Patrao patrao = new Patrao();
                    novo = patrao;
                }
                
                ContaBancaria contaBancaria = new ContaBancaria();
                Funcionario funcionario = new Funcionario(nome, novo, contaBancaria);
                funcionarios.add(funcionario);

            } else if (opcao == 2){
                 funcionarios.forEach(e ->  e.getContaBancaria().setSaldo(e.getContaBancaria().getSaldo() + e.getCargo().getSalario()));
                 System.out.println(funcionarios);
            }
        }
    }
}
