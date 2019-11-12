package dam.m9.uf2.threads.waitnotify;

/** Exemple de Monitor compartit entre productors / consumidors
 *  Quan la safata està buida, el consunmidor s'epera (wait)
 *  Quan la safata està plena, el productor s'espera (wait)
 *  Quna es canvia l'estat s'envia un avís al thread que està esperant: notify() o notifyAll()
 *
 */
public class Monitor {
    private String message;
    private boolean empty=true;

    public synchronized String agafar(){
    while(empty){
        try{
            wait();
        }catch(InterruptedException e){}
    }
    empty=true;
    notify();
    //notifyAll(); //per notificar tots els productors
    return message;
    }

    public synchronized void deixar(String m){
    while(!empty){
        try{
            wait();
        }catch(InterruptedException e){}

    }
    empty=false;
    message=m;
    notify(); //notifyAll(); //per notificar tots els consumidors
    }
}
