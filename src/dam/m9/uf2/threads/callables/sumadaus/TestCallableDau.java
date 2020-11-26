package dam.m9.uf2.threads.callables.sumadaus;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallableDau {
    public static void main(String[] args) {

        Dau d1 = new Dau();
        Dau d2 = new Dau();
        Dau d3 = new Dau();

        ExecutorService ex = Executors.newFixedThreadPool(3);

        Future<Integer> f1 = ex.submit(d1);
        Future<Integer> f2 = ex.submit(d2);
        Future<Integer> f3 = ex.submit(d3);

        int i1, i2, i3;
        try {
            i1 = f1.get();
            i2 = f2.get();
            i3 = f3.get();
            System.out.println("La suma dels tres daus es " + (i1 + i2 + i3));
            ex.shutdown();
        } catch (InterruptedException | ExecutionException e) {
        }
    }
}
