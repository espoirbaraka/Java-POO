package poo1;

public abstract class Personne { //Abstract veut dire que cette classe ne peut pas etre instancié(On ne peut pas créer des objets avec cette classe). Pour acceder à cette classe, elle doit être héritée

    private String nom;
    String postnom;
    String prenom;
    String datenaiss;
    String lieunaiss;

    public Personne(String name, String second_name, String third_name) {
        this.nom = name;
        this.postnom = second_name;
        this.prenom = third_name;
    }
    
    public String getNom(){
        return nom;
    }
    public void setNom(String newNom){
        this.nom = newNom;
    }

    public void manger(String gout) {
        System.out.print(this.nom + " " + this.postnom + " " + this.prenom + " mange "+gout);
    }
    
    static void courir(){
        System.out.print("Je cours");
    }
}
