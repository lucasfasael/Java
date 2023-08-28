import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int mediaAvaliacao = 0;
        for(int x = 0; x < 3; x++){
            System.out.println("Digite a nota do filme : ");
            double nota = leitura.nextDouble();
            mediaAvaliacao += nota;
            }
        System.out.println("Média das avaliações: "+mediaAvaliacao / 3);
    }
}
