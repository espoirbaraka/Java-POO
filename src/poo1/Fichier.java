package poo1;
import java.io.File;
import java.io.IOException;

public class Fichier {
    public static void main(String[] args){
        try{
            File monfichier = new File("E:\\JAVA\\POO1\\monfichier1.txt");
            monfichier.createNewFile();
        }catch(IOException e){
            
        }
    }
}
