package dam.m9.uf2.threads.volatiles;

public class TestServerVolatileStop {
    public static void main(String[] args) {
        Server myServer =new Server();
        Thread t1=new Thread(myServer);
        t1.start();
        System.out.println(Thread.currentThread().getName()+" is going to stop Server1 thread");
        try {
            Thread.sleep(1000); //espera 1 segon, per simular
        }catch(InterruptedException e){}
        myServer.stop();
        System.out.println("Finished...");

    }
}

class Server implements Runnable{
    // si aquesta boolean no fos volatile, no estem segurs de quan
    // es posarà a true
    private volatile boolean exit=false;
    @Override
    public void run() {
        while(!exit){
            System.out.println("Server "+Thread.currentThread().getName()+" is running...");
        }
        System.out.println("Server "+Thread.currentThread().getName()+" is stopped...");
    }

    public void stop(){
        exit=true;
    }
}