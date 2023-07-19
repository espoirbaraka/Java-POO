package poo1;
import java.util.ArrayList;
import java.util.Collections;
public class List {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList(); 
        cars.add("VOLVO");
        cars.add("TX");
        cars.add("TOYOTA");
        System.out.println(cars);
        cars.remove(cars.set(0,"BUS"));
        System.out.println(cars);
        
        Collections.sort(cars);
        System.out.println(cars);
        for(int i = 0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }
    }
}
