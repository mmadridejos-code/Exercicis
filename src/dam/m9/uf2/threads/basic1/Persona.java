package dam.m9.uf2.threads.basic1;

public class Persona extends Thread{
    private String nom;
    public Persona(String s){
        nom=s;
    }
    @Override
    public void run() {
        System.out.println("\n"+nom+
        " està comptant... dins el thread "+getName());
        for(int i=0;i<10;i++){
            System.out.println(nom +" "+i);
        }
    }
}
