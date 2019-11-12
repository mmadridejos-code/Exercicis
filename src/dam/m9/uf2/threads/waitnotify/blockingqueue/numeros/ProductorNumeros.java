package dam.m9.uf2.threads.waitnotify.blockingqueue.numeros;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class ProductorNumeros implements Runnable{
    private BlockingQueue<Integer> cua;

    public ProductorNumeros(BlockingQueue<Integer> q) {
        this.cua = q;
    }

    @Override
    public void run() {
        Random r = new Random();

        try {
            while (true) {
                cua.put(r.nextInt(100));
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }
}
