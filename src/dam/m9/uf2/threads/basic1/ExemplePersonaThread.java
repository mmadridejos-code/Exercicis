package dam.m9.uf2.threads.basic1;

public class ExemplePersonaThread {
    public static void main(String[] args) {
        Persona t1 = new Persona("Montse");
        Persona t2 = new Persona("Clara");
        Persona t3 = new Persona("Fran");
        t1.start();
        t2.start();
        t3.start();
    }
}

// System.out.println("\nDesprés de t1.start()");
//System.out.println("\nDesprés de t2.start()");
//System.out.println("\nDesprés de t3.start()");