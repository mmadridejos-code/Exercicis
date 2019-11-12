package dam.m9.uf2.threads.waitnotify;

public class Productor implements Runnable{
    private Monitor safata;

    public Productor(Monitor safata) {
        this.safata = safata;
    }

   @Override
    public void run() {
       String[] text={"Una vegada hi havia un gat",
       "que bé li ha estat",
       "al gat l'esquella",
       "s'ha menjat la carn del plat",
       "que bé li ha estat", "l'esquella al gat"};
        for(int i=0;i<text.length;i++){
            safata.deixar(text[i]);
            System.out.println("Produït el text: "+text[i]);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
        safata.deixar("FET!");
    }
}
