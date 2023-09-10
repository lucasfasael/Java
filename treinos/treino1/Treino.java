import java.util.ArrayList;
import java.util.List;

public class Treino{
    
    

    public static void main (String[] args){
    
    int n = 4;
    
    int battery = 50;
      
    List<Integer> list = new ArrayList<Integer>(); list.add(10); list.add(-20); list.add(61); list.add(-15);
    
    for(int x=0; x<4; x++){
 
        int y = list.get(x);
        battery += y;
 
        if (battery > 100){
 
            battery = 100;
 }
        if (battery < 0){
 
            battery = 0;
 }
    System.out.println(battery);
    }
    }
}



