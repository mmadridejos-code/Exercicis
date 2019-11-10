package dam.m9.uf2.threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exemple2Executors {
    public static void main(String[] args) {
        System.out.println("Dintre de: " + Thread.currentThread().getName());
        System.out.println("Creant Executor Service amb un thread pool de mida 2");
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Runnable task1 = () -> {
            System.out.println("runnable task1 : " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException ex) {
            }
        };

        Runnable task2 = () -> {
            System.out.println("runnable task2 : " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
            }
        };

        Runnable task3 = () -> {
            System.out.println("runnable task3 : " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                throw new IllegalStateException(ex);
            }
        };


        System.out.println("Enviant les tasques a executar-se...");
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);

        executorService.shutdown();
    }
}


