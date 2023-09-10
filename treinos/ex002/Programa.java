// public class Programa{
//     public static void main(String[] args){
//         System.out.print("Welcome to ");
//         System.out.println("Java\n Programming!");
//     }
// }
import java.util.Scanner;

class Programa{
     public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int number_one;
        
        System.out.print("Qual é o seu nome ? : ");

         //Aqui  você passa o valor para um string

        String valor_lido = s.nextLine();
        System.out.print("Qual é a sua idade ? : ");
        number_one = s.nextInt();

        // nextFloat usar ","

         //Agora é fazer o que quiser com o valor dessa String

        System.out.println("Seu nome é : "+valor_lido);
        System.out.println("Sua idade é : "+number_one);
     }
}