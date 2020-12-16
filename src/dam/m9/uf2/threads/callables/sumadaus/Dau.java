package dam.m9.uf2.threads.callables.sumadaus;

import java.util.concurrent.Callable;

public class Dau implements Callable<Integer> {
    private int tirada;

    public int llençarDau() {
        tirada = (int) (Math.random() * 6 + 1);
        System.out.println("Tirada " + Thread.currentThread().getName() + " : " + tirada);
        //  tirada=new Random().ints(1,5).findFirst().getAsInt();
        return tirada;
    }

    public int getTirada() {
        return tirada;
    }

    @Override
    public Integer call() throws Exception {
        return llençarDau();
    }
}
