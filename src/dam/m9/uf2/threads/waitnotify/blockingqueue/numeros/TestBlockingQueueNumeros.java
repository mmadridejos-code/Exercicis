package dam.m9.uf2.threads.waitnotify.blockingqueue.numeros;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestBlockingQueueNumeros {
    public static void main(String[] args) {
        BlockingQueue<Integer> q = new ArrayBlockingQueue<>(20);

        //cachedThreadPool reutilitza threads sobre la marxa
        ExecutorService executor = Executors.newCachedThreadPool();

        //2 productors i 1 consumidor
        executor.submit(new ProductorNumeros(q));
        executor.submit(new ProductorNumeros(q));
        executor.submit(new ConsumidorNumeros(q));
    }
}
