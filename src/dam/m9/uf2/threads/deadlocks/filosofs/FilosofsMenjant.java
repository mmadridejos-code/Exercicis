package dam.m9.uf2.threads.deadlocks.filosofs;

public class FilosofsMenjant {
    public static void main(String[] args) {
        Objecte a=new Objecte("forquilla");
        Objecte b=new Objecte("ganivet");
        //Objecte c=new Objecte("forquilla");

        //amb (a,b) i (b,a) hi ha deadlock
        //amb (a,b) i (b,c) no hi ha deadlock
        Thread t1 = new Thread(new Filosof("Sócrates", a,b));
        Thread t2 = new Thread(new Filosof("Aristóteles",b,a));
        t1.start();
        t2.start();
    }
}

