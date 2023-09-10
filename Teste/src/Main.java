
public class Main {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        int classificacao =(int) (media / 2);

        String sinopse = """
                Top Gun
                Filme de aventura com  galã do anos 90
                Muito Bom
                """;
        System.out.println("Esse é o Screen Match !  ");
        System.out.println("Filme: Top Gun: Maverick: " + anoDeLancamento + " a sua estrela é: " + classificacao);
        System.out.println(sinopse);




    }
}

