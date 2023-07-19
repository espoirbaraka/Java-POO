package poo1;
import java.util.ArrayList;
public class List {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<>(); 
        cars.add("VOLVO");
        cars.add("TX");
        cars.add("TOYOTA");
        System.out.println(cars);
        cars.remove("TOYOTA");
        System.out.println(cars);
    }
}
