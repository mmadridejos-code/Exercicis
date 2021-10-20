package dam.m9.uf2.threads.swingpilotes.v0sensethreads;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/** Classe auxiliar on es guarden i es dibuixen les pilotes creades al Frame
 * FinestraJoc.
 * @author Montse
 * @version 14/10/2021
 */
class PanelPilotes extends JPanel {
    private ArrayList<Pilota> pilotes = new ArrayList<Pilota>();

    public void addPilota() {
        //es crea una pilota
        Pilota p = new Pilota();
        //se li passa el panell, per saber les dimensions on ha de rebotar
        p.setElPanelComu(this);
        //s'afegeix a una llista de pilotes, per quan hi hagi vàries
        pilotes.add(p);
        //es simula el moviment, fent 2000 canvis de posició amb una pausa al mig
        for (int i = 0; i < 2000; i++) {
            p.mourePilota();
//            try {
//                Thread.sleep(4);
//            } catch (InterruptedException e) {
//            }
            paint(getGraphics());
        }
    }

    /** Mètode que no es pot canviar de nom. Quan es vol pintar un objecte gràfic sobre un Component
     * de Swing de Java.
     * @param g de tipus Graphics
     */
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        /* itera i dibuixa totes les pilotes*/
        for (Pilota p : pilotes) {
            g2.fill(p.dibuixarPilota());
        }
        //Tip per assegurar que el Graphics s'actualitza
        Toolkit.getDefaultToolkit().sync();
    }
}
