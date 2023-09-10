public class Condicional {
    public static void main(String[] args) {
        int ano = 2022;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0) / 3;
        boolean incluidoNoPlano = true;
        String tipoDoPlano = "plus";
        if(ano >= 2022){
            System.out.println("Lançamento que está sendo muito admirado !!");
        } else{
            System.out.println("Filme retrô que vale a pena assistir !!");
        }
        if(incluidoNoPlano || tipoDoPlano.equals("plus")){
            System.out.println("Está incluso no seu pacote !!");
        }else{
            System.out.println("Vai ter que pagar locação !!");
        }
    }
}
