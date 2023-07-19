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
        int[] nombre = {2,6,7,7};
        try{
            System.out.println(nombre[2]);
        }catch(Exception e){
            System.out.println("Il y a un souci");
        }
        
        age(2);
    }
    public static void age(int age){
        if(age<18){
            throw new ArithmeticException("Pas cette age");
        }else{
            System.out.println("Super");
        }
    }
}
