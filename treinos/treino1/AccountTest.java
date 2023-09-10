import java.util.Scanner;

public class AccountTest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Account myAccount = new Account();
        System.out.printf("Nome inicial eh: %s%n", myAccount.getName());
        System.out.println("Por favor, entre com o nome da conta");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();  //quebra uma linha
        System.out.printf("Nome da conta eh %s%n%n", myAccount.getName());
    }
}