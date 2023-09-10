import java.util.Scanner;

class Leitura{
        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);

            System.out.println("Digite o nome do filme : ");
            String nome = leitura.nextLine();
            System.out.println("Digite o ano do filme : ");
            int ano = leitura.nextInt();
            System.out.println("Digite a nota do filme : ");
            double nota = leitura.nextDouble();
            System.out.println(nome+ano+nota);
        }
    }