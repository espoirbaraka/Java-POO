package poo1;

public class Etudiant extends Personne {
    final String matricule; //Final ne permet pas de reaffecter une nouvelle valeur à l'attribut 

    public Etudiant(String name, String second_name, String third_name, String matr) {
        super(name, second_name, third_name);
        this.matricule = matr;
    }
    public void estInscrit(){
        System.out.print(nom+" est deja inscrit");
    }
}
