package poo1;

public class Personne {
    String nom;
    String postnom;
    int age;
    public Personne(String name, String second_name, int age){
        this.nom = name;
        this.postnom = second_name;
        this.age = age;
    }
    public void parler(){
        System.out.println(this.nom+" parle");
    }
    
}
