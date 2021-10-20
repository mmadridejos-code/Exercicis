package dam.m9.uf2.threads.states;

public class TestWaitingState {
    private static Thread t1; //per compartir el thread al Thread2
    public static void main(String[] args) {
        Runnable runner=()->codi1();
        t1=new Thread(runner);
        t1.start();
    }

    public static void codi1(){
        Runnable runner=()->codi2();
        Thread t2=new Thread(runner);
        t2.start();
        try {
            t2.join(); //fa esperar t1 fins que acabi t2
            System.out.println("t2 "+t2.getState());
        }catch(InterruptedException e){}
    }

    public static void codi2(){
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e){}
        //t1 is WAITING
        System.out.println("t1 "+t1.getState());
    }
}
