package dam.m9.uf2.threads.executors;

import java.awt.*;
import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Exemple4ExecutorsPeriodic {
    public static void main(String[] args) {
       ScheduledExecutorService temporitzador = Executors.newScheduledThreadPool(1);
        Runnable alarma = () -> {
            System.out.println("beep a les "+ LocalTime.now());
            Toolkit.getDefaultToolkit().beep();
        };

        //posa en marxa l'alarma immediatament i després cada 5 segons.
        System.out.println("Comencem els beeps immediatament a les "+LocalTime.now());
        ScheduledFuture beeper = temporitzador.scheduleAtFixedRate(alarma, 0, 5, TimeUnit.SECONDS);
    }
}