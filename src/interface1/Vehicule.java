package interface1;

public abstract class Vehicule {
    String marque;
    String modele;
    public abstract void demarrer();
    public void rouler(){
	System.out.println("Je roule");
    };

}
