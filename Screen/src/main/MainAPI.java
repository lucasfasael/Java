package main;

import br.com.alura.screenmatch.model.Video;
import br.com.alura.screenmatch.model.VideoOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class MainAPI {
    public static void main(String[] args) throws IOException, InterruptedException{
        Scanner input = new Scanner(System.in);

        System.out.println("Qual filme ? : ");
        String titulo = input.nextLine();

        try{
        String endereco = "https://www.omdbapi.com/?t=" + titulo + "&apikey=e131c7a5";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        System.out.println("Before conversion: ");
        VideoOmdb myVideoOmdb = gson.fromJson(json, VideoOmdb.class);


            Video myVideo = new Video(myVideoOmdb);
            System.out.println(myVideoOmdb);

            System.out.println("After conversion: ");
            System.out.println(myVideo);
        } catch (NumberFormatException e){
            System.out.println("Tivemos um problema: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Digitou algo errado no endereço " + e.getMessage());
        }

        System.out.println("Finalizado corretamente !");
    }



}
