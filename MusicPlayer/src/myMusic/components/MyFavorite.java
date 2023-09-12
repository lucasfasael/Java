package myMusic.components;

public class MyFavorite {
    public void favorite(Audio audio){
        if(audio.showAverage() >= 5){
            System.out.println("O áudio: " + audio.getTitle() + " está bombando !");
        } else{
            System.out.println("O áudio: " + audio.getTitle() + " pode ser assistido mais tarde !");
        }
    }




}
