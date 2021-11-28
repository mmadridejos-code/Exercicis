package dam.m9.uf2.threads.waitnotify.blockingqueue.numeros;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class ProductorNumeros implements Runnable{
    private BlockingQueue<Integer> cua;
    private ThreadLocalRandom random= ThreadLocalRandom.current();

    public ProductorNumeros(BlockingQueue<Integer> q) {
        this.cua = q;
    }

    @Override
    public void run() {


        try {
            while (true) {
                cua.put(random.nextInt(100));
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }
}
