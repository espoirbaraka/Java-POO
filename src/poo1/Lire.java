package poo1;
import java.util.Scanner;
import java.time.LocalDate;
public class Lire {
   public static void main(String[] args){
       Scanner myobj = new Scanner(System.in);
       LocalDate date= LocalDate.now();
       System.out.println("Saisissez votre nom");
       String monnom= myobj.nextLine();
       System.out.println("Saisissez le premier nombre");
       int nbre1= myobj.nextInt();
       System.out.println("Saisissez votre nom");
       int nbre2= myobj.nextInt();
       int somme = nbre1+nbre2;
       System.out.println("Mon nom est : "+monnom+" et "+nbre1+" + "+nbre2+" = "+somme);
       System.out.println("Il est "+date);
   } 
}
