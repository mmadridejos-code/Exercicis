package dam.m9.uf2.threads.raceConditions;

/** Exemple de sincronització amb mètodes synchronized dintre de la classe
 * CounterSync. Tot i que els mètode de Counter són synchronized,
 * si els prints es fan al main, se solapen i donen insconsistències
 *
 */
public class TestCounterSync2 {
    public static void main(String[] args) {
        CounterSync c=new CounterSync();

        //un thread incrementa 2 cops
        Runnable runner1=()->{
            c.increment();
        //    System.out.println("Thread "+Thread.currentThread().getName()+" incrementant en 1 "+c.getValue());
            c.increment();
        //    System.out.println("Thread "+Thread.currentThread().getName()+" incrementant en 1 "+c.getValue());
        };

        //l'altre thread decrementa 2 cops
        Runnable runner2=()->{
            c.decrement();
         //   System.out.println("Thread "+Thread.currentThread().getName()+" decrementant en 1 "+c.getValue());
            c.decrement();
         //   System.out.println("Thread "+Thread.currentThread().getName()+" decrementant en 1 "+c.getValue());
        };

        new Thread(runner1,"t1").start();
        new Thread(runner2,"t2").start();

    }
}
