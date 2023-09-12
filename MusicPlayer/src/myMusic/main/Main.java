package myMusic.main;

import myMusic.components.Music;
import myMusic.components.MyFavorite;
import myMusic.components.PodCast;

public class Main {
    public static void main(String[] args) {

        System.out.println("Reprodutor de música");
        System.out.println("--------------------");

        Music musica = new Music();
        musica.setTitle("Bring Back the Summer");
        musica.play();
        musica.rate();

        System.out.println("A nota da música é: " + musica.showAverage());

        MyFavorite favorita = new MyFavorite();

        favorita.favorite(musica);

        PodCast pod = new PodCast();

        pod.setTitle("Groselha Talk");
        pod.rate();
        pod.play();

        favorita.favorite(pod);
    }
}