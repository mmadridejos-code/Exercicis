package dam.m9.uf2.threads.basic4;

public class ExempleLambda {
    public static void main(String[] args) {
        Runnable runa = () -> {
            System.out.println("\n" + "està comptant... en el thread " + Thread.currentThread().getName());
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        };

        Thread t1 = new Thread(runa);
        Thread t2 = new Thread(runa);

        Thread t3 = new Thread(() -> {
            System.out.println("\n" + "està comptant... en el thread " + Thread.currentThread().getName());
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        });
        t1.start();
        t2.start();
        t3.start();


    }
}
