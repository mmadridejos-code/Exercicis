package dam.m9.uf2.threads.states;

public class TestBlocked {
    public static void main(String[] args) throws Exception{
        Runnable runner=()->infinit();
        Thread t1=new Thread(runner);
        Thread t2=new Thread(runner);
        t1.start();
        t2.start();
        Thread.sleep(1000);
        System.out.println("t1 "+t1.getState()); //RUNNABLE
        System.out.println("t2 "+t2.getState()); //BLOCKED
    }

    public static synchronized void infinit() {
        while (true) ;
    }
}

