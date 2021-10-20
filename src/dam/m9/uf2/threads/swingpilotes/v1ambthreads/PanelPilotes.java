package dam.m9.uf2.threads.swingpilotes.v1ambthreads;



import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/** El panell s'encarrega de crear les pilotes, afegir-les a una llista i pintar-les
 * al mètode paint()
 * @author Montse
 * @version 14/10/2021
 */
class PanelPilotes extends JPanel {
    private ArrayList<Pilota> pilotes = new ArrayList<Pilota>();

    public void addPilota() {
        //es crea una pilota, ara és un thread
        Pilota p = new Pilota();
        //se li passa el panell, per saber les dimensions on ha de rebotar
        p.setElPanelComu(this);
        //s'afegeix a una llista de pilotes, per quan hi hagi vàries
        pilotes.add(p);
        //es posa en marxa el thread
        p.start();
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



