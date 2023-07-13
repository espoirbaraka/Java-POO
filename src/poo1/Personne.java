package poo1;

public abstract class Personne {
    private String nom;
    String postnom;
    private int salaire = 200;
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
