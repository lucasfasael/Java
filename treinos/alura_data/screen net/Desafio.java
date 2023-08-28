import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    String nome;
    String tipoDeConta = "c";
    double saldo;
    boolean continuar = true;
    int opcao = 0;
    
        System.out.println("Qual o nome do titular da conta ? : ");
        nome = leitura.nextLine();
        System.out.println("Qual o tipo da conta ? 1 - Conta Corrente, 2 - Poupança : ");
        int tipo = leitura.nextInt();
        if(tipo == 1){
            tipoDeConta = "Conta Corrente";
        } 
        if(tipo == 2){
            tipoDeConta = "Poupança";
        }if(tipoDeConta != "Conta Corrente" && tipoDeConta != "Poupança"){
            System.out.println("Você não digitou uma opção valida !!!");
        }
        System.out.println("Qual o saldo inicial da conta ? : ");
        saldo = leitura.nextDouble();

        System.out.println("Bem vindo ao banco digital !!!");

        while(continuar){
            System.out.println("****** -- Menu -- ******");
            System.out.println("\n1 - Exibir informações do cliente");
            System.out.println("2 - Receber um valor");
            System.out.println("3 - Tranferir um valor");
            System.out.println("4 - Encerrar o sistema");
            System.out.println("\n****** -- Menu -- ******");
            System.out.println("Qual opção deseja ? : ");
            opcao = leitura.nextInt();

            if(opcao == 1){
                System.out.println("**********************");
                System.out.println("\nNome do cliente: "+nome);
                System.out.println("Tipo de Conta: "+tipoDeConta);
                System.out.println("Saldo atual: R$ "+saldo);
                System.out.println("\n**********************");
                System.out.println("Digite 4 para encerrar");
                opcao = leitura.nextInt();
            }
            if(opcao == 2){
                System.out.println("Qual valor o cliente está recebendo ? : ");
                double valor = leitura.nextDouble();
                saldo += valor;
            }
            if(opcao == 3){
                System.out.println("Quanto está transferindo ? : ");
                double transf = leitura.nextDouble();
                if(saldo < transf){
                    System.out.println("Saldo insuficiente !!!");
                }else{
                    saldo -= transf;
                }
            }
            if(opcao == 4){
                System.out.println("Até a próxima !!!");
                continuar = false;
            }else{
                System.out.println("Você não digitou uma opção valida !!!");
            }
        }
    }
}
