import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Digite um saldo: ");
            double saldo = input.nextDouble();
            System.out.println("Digite um valor para transferir: ");
            double valor = input.nextDouble();
            Carteira ted = new Cripto(saldo);

            System.out.println("Saldo antes de transferir: " + ted.getSaldo());
            ted.transferir(valor);
            System.out.println("Saldo depois de transferir: " + ted.getSaldo());
        } catch (InputMismatchException e){
            System.out.println(e.getMessage());
            System.out.println("O saldo está incorreto !");

        }
    }
}
