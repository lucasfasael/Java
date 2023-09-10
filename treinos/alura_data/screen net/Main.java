public class Main{
    public static void main(String[] args){
        System.out.println("Esse é o Screen Match ! ");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;
        System.out.println("O ano de lançamento é: "+ano);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("A media é: "+media);

        String sinopse;
        sinopse = """
                Filme: A Bela e a Fera !
                Filme de conto !
                Muito bom !
                Ano de lançamento
                
                """+ano;

        int classificacao = (int) (media / 2);
        System.out.println("O filme é : "+ classificacao+ " estrelas.");
    }
}