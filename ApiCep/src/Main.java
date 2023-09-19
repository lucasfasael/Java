import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        String cep = "";
        int cepValid = 0;
        List<Cep> ceps = new ArrayList<>();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        while (!cep.equalsIgnoreCase("sair")) {
            try {
                System.out.println("Digite um CEP: ");
                cep = input.nextLine();
                if (cep.equalsIgnoreCase("sair")) {
                    System.out.println("Saindo !");
                    break;
                }
                cepValid = Integer.parseInt(cep);
                System.out.println("CEP DIGITADO: " + cepValid);
                String adress = "https://viacep.com.br/ws/" + cep.replace("-", "") + "/json/";

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(adress))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();

                //Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();


                Cep myCep = gson.fromJson(json, Cep.class);
                System.out.println(myCep);
                ceps.add(myCep);

            } catch (NumberFormatException e) {
                System.out.println("O cep digitado não é um número !");
            }
        }
        FileWriter fileWriter = new FileWriter("search.json");
        fileWriter.write(gson.toJson(ceps));
        fileWriter.close();
    }
}
