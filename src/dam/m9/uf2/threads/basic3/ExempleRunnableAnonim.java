package dam.m9.uf2.threads.basic3;

public class ExempleRunnableAnonim {
    public static void main(String[] args) {

        //classe anònima i interna
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("\n"+ "està comptant... en el thread "+Thread.currentThread().getName());
                for(int i=0;i<10;i++){
                    System.out.println(i+" "+Thread.currentThread().getName());
                }
            }
        });
        t1.start();



        //una altra manera d'escriure, per reciclar el runnable
        //classe anònima
        Runnable runa=new Runnable(){

            @Override
            public void run() {
                System.out.println("\n"+ "està comptant... en el thread "+Thread.currentThread().getName());
                for(int i=0;i<10;i++){
                    System.out.println(i+" "+Thread.currentThread().getName());
                }
            }
        };
        Thread t2=new Thread(runa);
        Thread t3=new Thread(runa);
        t2.start();
        t3.start();


    }
}


