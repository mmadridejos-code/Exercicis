package dam.m9.uf2.threads.volatiles;

public class ReaderWriterProblem {
    private static volatile int c;

    public static void main (String[] args) {

        Thread thread1 = new Thread(() -> {
            int temp = 0;
            while (true) {
                if (temp != c) {
                    temp = c;
                    System.out.println("reader: value of c = " + c);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                c++;
                System.out.println("writer: changed value to = " + c);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // sleep enough time to allow reader thread to read pending changes (if it can!).
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //exit the program otherwise other threads will be keep waiting on c to change.
            System.exit(0);
        });

        thread1.start();
        thread2.start();
    }
}
