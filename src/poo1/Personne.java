package poo1;

public class Personne {

    String nom;
    String postnom;
    String prenom;
    String datenaiss;
    String lieunaiss;

    public Personne(String name, String second_name, String third_name) {
        this.nom = name;
        this.postnom = second_name;
        this.prenom = third_name;
    }

    public void manger(String gout) {
        System.out.print(this.nom + " " + this.postnom + " " + this.prenom + " mange "+gout);
    }
    
    static void courir(){
        System.out.print("Je cours");
    }
}
