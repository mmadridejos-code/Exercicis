package dam.m9.uf2.threads.waitnotify.blockingqueue.numeros;

import java.util.concurrent.BlockingQueue;

public class ConsumidorNumeros implements Runnable {
    private BlockingQueue<Integer> cua;

    public ConsumidorNumeros(BlockingQueue<Integer> q) {
        this.cua = q;
    }

    @Override
    public void run() {

        try {
            while (true) {
                System.out.println(cua.take());
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

}
