import java.util.ArrayList;
import java.util.List;

public class Arrays {

    public static void main(String [] args){
        List<String> names = new ArrayList<>();

        names.add("Noel");
        names.add("James");
        names.add("Caleb");


        for (String name : names){
            System.out.println(name);
        }
        
    }
    
}
