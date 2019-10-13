package dam.m9.uf2.threads.raceConditions;

public class Counter {
    private int c;

    public void increment() {
        c++;
    }

    public void decrement() {
        c--;
    }

    public int getValue() {
        return c;
    }
}
