package dam.m9.uf2.threads.raceConditions;

/** Exemple de sincronització de codi dintre del run
 *
 */
public class TestCounterSync {
    public static void main(String[] args) {
        Counter c = new Counter();

        //un thread incrementa 2 cops
        Runnable runner1 = () -> {
            synchronized (c) {
                c.increment();
                System.out.println("Thread " + Thread.currentThread().getName() + " incrementant en 1 " + c.getValue());
                c.increment();
                System.out.println("Thread " + Thread.currentThread().getName() + " incrementant en 1 " + c.getValue());
            }

        };

        //l'altre thread decrementa 2 cops
        Runnable runner2 = () -> {
            synchronized (c) {
                c.decrement();
                System.out.println("Thread " + Thread.currentThread().getName() + " decrementant en 1 " + c.getValue());
                c.decrement();
                System.out.println("Thread " + Thread.currentThread().getName() + " decrementant en 1 " + c.getValue());
            }
        };

        new Thread(runner1, "t1").start();
        new Thread(runner2, "t2").start();

    }
}
