import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int soma = 0;
        int totalDeNotas = 0;
        double nota = 0;
        while(nota != -1){
            System.out.println("Digite a nota do filme : ");
            nota = leitura.nextDouble();
            if(nota != -1){
            soma += nota;
            totalDeNotas++;
            }
        }
        System.out.println("Média das avaliações: "+ soma / totalDeNotas);
    }
}
