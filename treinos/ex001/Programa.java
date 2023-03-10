public class Programa{
    public static void main(String[] args){
        int x = 4;
        int y = 6;

        System.out.println("A soma é igual a : "+ (x + y));

        class Casa{
            String nome;
            int quartos;

            void addQuartos(){
                System.out.println("O quarto: "+ nome);
            }
            void altNome(){
                System.out.println("O nome é: "+ quartos);
            }
        }
    }
}
