package poo1;
import java.io.File;
import java.io.IOException;

public class Fichier {
    public static void main(String[] args){
        try{
            File monfichier = new File("E:\\JAVA\\POO1\\monfichier1.txt");
            if(monfichier.createNewFile()){
                System.out.println("Le fichier "+monfichier.getName()+" a été crée");
            }else{
                System.out.println("Ce fichier existe déjà");
            }
        }catch(IOException e){
            System.out.println("Error dans le code");
            e.printStackTrace();
        }
    }
}
