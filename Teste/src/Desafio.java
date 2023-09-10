import java.util.Scanner;

public class Desafio {
    static double saldo = 0;
    static Scanner leitura = new Scanner(System.in);

    public static void main(String[] args) {

        boolean sistema = true;
        int opcao = 0;

        String nome = "Lucas Fasael";
        String tipoConta = "Corrente";


        System.out.println("**********************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("\nNome:               " + nome);
        System.out.println("Tipo de conta:      " + tipoConta);
        System.out.println("Saldo inicial:      " + saldo);
        System.out.println("\n**********************************");

        while(sistema){
            System.out.println("""
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Digite a opção desejada:
                    """);
            opcao = leitura.nextInt();

            if(opcao == 1){
                consultar();
            }

            else if(opcao == 2){
                receber();
            }

            else if(opcao == 3){
                transferir();
            }

            else if(opcao == 4){
                sistema = false;
                System.out.println("Desligando o sistema...");
            } else{
                System.out.println("Opção inválida !");
            }
        }
    }

    private static void consultar() {
        System.out.println("Saldo bancário: R$ " + saldo);
    }

    private static void receber(){
        System.out.println("Quanto é o valor que você está recebendo ? : ");
        double valor = leitura.nextDouble();
        saldo += valor;
    }

    private static void transferir() {
        System.out.println("Quanto é o valor que você está transferindo ? : ");
        double valor = leitura.nextDouble();
        if(valor <= saldo){
            saldo -= valor;
        }else {
            System.out.println("Saldo insuficiente !");
        }
    }
}
