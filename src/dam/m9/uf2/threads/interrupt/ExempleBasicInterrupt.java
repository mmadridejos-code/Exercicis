package dam.m9.uf2.threads.interrupt;

import java.awt.*;

/** Exemple bàsic per interrompre un thread des d'un altre thread
 *  amb la funció interrupt() de la classe Thread
 * @version 23/10/2020
 * @author Montse
 */

public class ExempleBasicInterrupt {
    private static Thread unthread;
    private static Thread segonthread;

    public static void main(String[] args) {

        Runnable runner1 = () -> comptar();
        unthread = new Thread(runner1);
        unthread.start();

        Runnable runner2 = () -> interrompre();
        segonthread = new Thread(runner2);
        segonthread.start();

    }

    /* el primer thread només fa que comptar indefinidament d'1 en 1, pausa 1 segon a cada ronda*/
    public static void comptar() {
        try {
            int i = 0;
            while (true) {
                System.out.println("Sóc el thread"+Thread.currentThread().getName()+" i vaig comptant " + i);
                i++;
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("OK. M'acaben d'interrompre.");
        }
    }

    /* el segon thread l'únic que fa és pausar 3 segons i cridar a interrupt() de l'altra thread.
        Farà saltar l'excepció
     */
    public static void interrompre() {

        try {
       //pauso 3 segons i després interrompeixo el primer thread
            Thread.sleep(3000);
            System.out.println("Holaaaaaa!!!");
            Toolkit.getDefaultToolkit().beep();
            unthread.interrupt();
        } catch (InterruptedException e) {
            System.out.println(e);
        }


    }
}
