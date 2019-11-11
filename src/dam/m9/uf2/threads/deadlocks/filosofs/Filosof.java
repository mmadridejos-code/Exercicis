package dam.m9.uf2.threads.deadlocks.filosofs;

public class Filosof extends Thread {
    private String nom;
    private Objecte a;
    private Objecte b;

    public Filosof(String nom, Objecte a, Objecte b) {
        this.nom = nom;
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        synchronized (a) {
            System.out.println(nom + " agafa primer recurs " + a.getNom());
           //la pausa és per simular cas real i que hi hagi més probabilitat de deadlock
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            synchronized (b) {
                //la pausa és per simular cas real i que hi hagi més probabilitat de deadlock
                System.out.println(nom + " agafa segon recurs " + b.getNom());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
            System.out.println(nom + " deixa " + b.getNom());
        }
        System.out.println(nom + " deixa " + a.getNom());
    }
}
