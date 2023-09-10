package calculator;

public class FilterOfRecommendation {

    public void filters(Classified classified){
        if(classified.getClassified() >= 4){
            System.out.println("Este título está entre os melhores !!!");
        } else if (classified.getClassified() >= 2) {
            System.out.println("Este título é bom!");
        } else{
            System.out.println("Adicione a lista para assistir mais tarde !");
        }
    }
}
