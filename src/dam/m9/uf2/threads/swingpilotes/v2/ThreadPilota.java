package dam.m9.uf2.threads.swingpilotes.v2;


/** normalment, seria una classe auxiliar dintre de FinestraJocV2
*  El codi del moviment de la pilota s'executa en el mètode run()
*  de la interface Runnable
*/
class ThreadPilota implements Runnable {
    private Pilota p;
    private PanelPilotes panel;

    public ThreadPilota(Pilota p1, PanelPilotes pan) {
        p = p1;
        panel = pan;
    }

    @Override
    public void run() {
        //per exemple, que es desplaci 2000 vegades
        //per veure la necessitat dels threads
        for (int i = 1; i <= 2000; i++) {
            p.mourePilota(panel.getBounds());
            try {
                Thread.sleep(4);
            } catch (Exception e) {
            }
            panel.repaint();

        }
    }
}