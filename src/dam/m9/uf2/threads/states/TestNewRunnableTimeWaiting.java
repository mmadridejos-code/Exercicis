package dam.m9.uf2.threads.states;

public class TestNewRunnableTimeWaiting {
    public static void main(String[] args) throws Exception{
        Runnable runner=()->codi();
        Thread t1=new Thread(runner);
        System.out.println("t1 "+t1.getState()); //NEW state
        t1.start();
        System.out.println("t1 "+t1.getState()); //RUNNABLE state
        Thread.sleep(1000);
        //TIMED_WAITING sempre i quan t1 s'hagi d'esperar per alguna raó,
        //per exemple, amb un sleep llarg dintre del seu run
        System.out.println("t1 "+t1.getState()); //TIMED_WAITING
       // Thread.sleep(2000); //si espero suficient, t1 acaba segur: TERMINATED
        t1.join();
        System.out.println(t1.getState());
    }

    public static void codi(){
      try {
          Thread.sleep(2000);
      }catch(InterruptedException e){}
    }
}
