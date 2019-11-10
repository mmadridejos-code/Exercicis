package dam.m9.uf2.threads.executors;


import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Exemple3ExecutorsScheduled {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        Runnable task = () -> {
            System.out.println("Posada en marxa del thread a les  " + LocalTime.now());
        };

        System.out.println("Enviant la tasca a les " + LocalTime.now() + " per ser executada en 5 segons");
        scheduledExecutorService.schedule(task, 5, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
    }
}
