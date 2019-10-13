package dam.m9.uf2.threads.raceConditions;

public class CounterSync {

    private int c;
    //private volatile int c; //volatile funciona per tipus primitius
    //sempre i quan només acccessos de lectura

    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int getValue() {
        return c;
    }
}
