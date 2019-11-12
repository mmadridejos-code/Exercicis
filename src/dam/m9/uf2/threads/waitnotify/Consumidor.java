package dam.m9.uf2.threads.waitnotify;

public class Consumidor implements Runnable {
    private Monitor safata;

    public Consumidor(Monitor safata) {
        this.safata = safata;
    }

    @Override
    public void run() {
        for (String m = safata.agafar(); !m.equals("FET!"); m = safata.agafar()) {
            System.out.println("String agafat: " + m);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

}
