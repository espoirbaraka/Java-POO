
package poo1;

public class ExtedingThread extends Thread {
    public static void main(String[] args){
        ExtedingThread thread = new ExtedingThread();
        thread.start();
        System.out.println("Ce code n'est pas dans le thread");
    }
    public void run(){
        System.out.println("Ce code est dans le thread");
    }
}
