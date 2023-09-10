import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Digite o ano de lançamento: ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Digite uma nota para avaliar o filme: ");
        double avaliacao = leitura.nextDouble();

        System.out.println("O seu filme favorito é: " + filme + " que lançou em: " + anoDeLancamento + " e a nota aviliativa foi: " + avaliacao);

    }
}
