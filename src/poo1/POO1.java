package poo1;
import java.util.Scanner;

class POO1 {

    static void rire() { // Static veut dire que je peux appeler ma methode sans passer par un objet. Tandis que public demande de passe par un objet obligatoirement
        System.out.println("Je ris");
    }

    public static void main(String[] args) {
        //Personne espoir = new Personne("BARAKA", "BIGEGA", "ESPOIR");
        Etudiant baraka = new Etudiant("BARAKA", "BIGEGA", "ESPOIR", "18IGGJ007672");
        //espoir.manger("LA VIANDE DE VACHE");
        //baraka.estInscrit();
        //espoir.courir();
        //System.out.print(baraka.matricule);
        
        baraka.estInscrit();
        rire();
        
        Scanner saisie = new Scanner(System.in);
        System.out.println("Saisi votre nom");
        String nom = saisie.nextLine();
        System.out.println("Votre nom est :"+nom);
    }
}
