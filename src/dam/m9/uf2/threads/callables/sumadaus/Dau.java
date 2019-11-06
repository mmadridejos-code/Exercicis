package dam.m9.uf2.threads.callables.sumadaus;

public class Dau {
    private int tirada;
    public int llençarDau() {
        tirada = (int) (Math.random() * 5 + 1);
        System.out.println("Tirada " + Thread.currentThread().getName() + " : " + tirada);
        //  tirada=new Random().ints(1,5).findFirst().getAsInt();
        return tirada;
    }
    public int getTirada() {
        return tirada;
    }
}
