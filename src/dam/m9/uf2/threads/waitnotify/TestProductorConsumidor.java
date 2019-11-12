package dam.m9.uf2.threads.waitnotify;

public class TestProductorConsumidor {
    public static void main(String[] args) {

        Monitor safata=new Monitor();
        Productor p=new Productor(safata);
        Consumidor c=new Consumidor(safata);
        Thread productor =new Thread(p);
        Thread consumidor=new Thread(c);
        productor.start();
        consumidor.start();

    }
}
