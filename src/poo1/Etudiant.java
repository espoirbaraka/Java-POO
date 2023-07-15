package poo1;

public class Etudiant extends Personne {
    String matricule;

    public Etudiant(String name, String second_name, String third_name, String matr) {
        super(name, second_name, third_name);
        this.matricule = matr;
    }
    public void estInscrit(){
        System.out.print(nom+" est deja inscrit");
    }
}
