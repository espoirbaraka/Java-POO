package poo1;

class POO1 {

    public static void main(String[] args) {
        Personne espoir = new Personne("BARAKA","BIGEGA","ESPOIR");
        Etudiant baraka = new Etudiant("BARAKA","BIGEGA","ESPOIR","18IGGJ007672");
        //espoir.manger();
        baraka.matricule = "12AAA";
        baraka.estInscrit();
        System.out.print(baraka.matricule);
    }    
}
