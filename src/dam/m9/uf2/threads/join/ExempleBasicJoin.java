package dam.m9.uf2.threads.join;

/**
 * Exemple per utilitzar la funció join() de la classe Thread.
 *
 * @author Montse
 * @version 23/10/2020
 */
public class ExempleBasicJoin {

    public static void main(String[] args) {
        Thread t1, t2;
        int cont = 0;
        int cont2 = 10;
        int cont3 = 20;
        Runnable runner1 = () -> comptar(cont, cont2);
        Runnable runner2 = () -> comptar(cont2, cont3);
        t1 = new Thread(runner1);
        t2 = new Thread(runner2);
        t1.start();
        //Si no es fa join, els threads s'executen concurrentment, en un ordre sense controlar (random)
//        try {
//            t1.join();
//        }catch(InterruptedException e){
//            System.out.println("El primer thread ha acabat la seva feina");
//        }
        t2.start();

    }

    public static void comptar(int a, int b) {
        for (int i = a; i < b; i++)
            System.out.println("El thread " + Thread.currentThread().getName() + " compta " + i);
    }


}
