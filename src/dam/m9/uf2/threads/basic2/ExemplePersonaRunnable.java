package dam.m9.uf2.threads.basic2;

public class ExemplePersonaRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Persona("Montse"));
        Thread t2 = new Thread(new Persona("Clara"));
        Thread t3 = new Thread(new Persona("Fran"));
        t1.start();
        t2.start();
        t3.start();
    }
}


class Persona implements Runnable {
    private String nom;
    public Persona(String s) {
        nom = s;
    }
    @Override
    public void run() {
        System.out.println("\n" + nom +
                " està comptant... dins el thread " +
                Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println(nom + " " + i);
        }
    }
}
