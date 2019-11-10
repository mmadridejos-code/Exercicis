package dam.m9.uf2.threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exemple1Executors {
            public static void main(String[] args) {
                System.out.println("Dintre de: " + Thread.currentThread().getName());

                System.out.println("Creant un ExecutorService...");
                ExecutorService executorService = Executors.newSingleThreadExecutor();

                System.out.println("Creant un objecte Runnable...");
                Runnable runnable = () -> {
                    System.out.println("Dintre : " + Thread.currentThread().getName());
                };

                System.out.println("Enviar la tasca de l'objecte runnable a l'executor service.");
                executorService.submit(runnable);
                System.out.println("Tancant l'executor"); //si no ho fem es queda fent run
                executorService.shutdown();
    }
}

