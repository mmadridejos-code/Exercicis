package dam.m9.uf2.threads.callables.sumadaus;

import java.util.concurrent.Callable;

//Parametritzat
public class CallableDau implements Callable<Integer> {
    private Dau dau;

    public CallableDau(Dau d) {
        dau = d;
    }

    @Override
    public Integer call() throws Exception {
        return dau.llençarDau();
    }
}


//sense parametritzar
/*
public class CallableDau implements Callable {
    private Dau dau;
    public CallableDau(Dau d) {
        dau = d;
    }
    @Override
    public Object call() throws Exception {
        return dau.llençarDau();
    }
}*/


