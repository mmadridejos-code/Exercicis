package dam.m9.uf2.threads.raceConditions;

public class CounterSync {

    
    //private volatile int c;
    private int c;
//    public synchronized void increment() {
//        c++;
//    }
//    public synchronized void decrement() {
//        c--;
//    }
//    public synchronized int getValue() {
//        return c;
//    }
public  void increment() {
    synchronized (this){
        c++;
        System.out.println("Thread "+Thread.currentThread().getName()+" incrementant en 1 "+getValue());
    }
}
    public void decrement() {
        synchronized (this) {
            c--;
            System.out.println("Thread "+Thread.currentThread().getName()+" decrementant en 1 "+getValue());
        }
    }
    public int getValue() {
        synchronized (this) {
            return c;
        }
    }
}
