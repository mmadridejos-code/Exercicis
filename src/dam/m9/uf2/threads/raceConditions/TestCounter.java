package dam.m9.uf2.threads.raceConditions;

/**
 * Exemple d'interferència a les dades compartides. "Race conditions".
 *  Com que els dos threads comparteixen el counter i el seu atribut c,
 *  en ocasions no s'incrementa o decrementa "realment". Poden sortir
 *  execucions corruptes perquè les operacions increment() i decrement()
 *  no són atòmiques. Tampoc ho són c++ ni c-- (dintre de la classe Counter)
 *
 * En ocasions, els resultats poden ser:
 *  incr1, incr1, decr2, decr2: 1,2,1,0  OK
 *  incr1, decr2, decr2, incr1: 1,0,0,1  ERROR!!!
 *  incr1, decr2, incr1, decr2: 1,0,1,0  OK
 *  incr1, incr1, decr2, decr2: 1,1,0,0  ERROR!!!
 *  incr1, incr1, decr2, decr2: 0,1,0,0  ERROR!!!
 *
 */
public class TestCounter {
    public static void main(String[] args) {
        Counter c=new Counter();

        //un thread incrementa 2 cops
        Runnable runner1=()->{
            c.increment();
            System.out.println("Thread "+Thread.currentThread().getName()+" incrementant en 1 "+c.getValue());
            c.increment();
            System.out.println("Thread "+Thread.currentThread().getName()+" incrementant en 1 "+c.getValue());
        };

        //l'altre thread decrementa 2 cops
        Runnable runner2=()->{
            c.decrement();
            System.out.println("Thread "+Thread.currentThread().getName()+" decrementant en 1 "+c.getValue());
            c.decrement();
            System.out.println("Thread "+Thread.currentThread().getName()+" decrementant en 1 "+c.getValue());
        };

        new Thread(runner1,"t1").start();
        new Thread(runner2,"t2").start();


    }
}
