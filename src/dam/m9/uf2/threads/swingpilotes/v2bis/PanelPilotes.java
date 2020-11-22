package dam.m9.uf2.threads.swingpilotes.v2bis;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/** Classe auxiliar on es guarden i es mouen les pilotes creades al Frame
 * FinestraJoc.
 * @author Montse
 * @version 22/11/2020
 */
class PanelPilotes extends JPanel {
    private ArrayList<Pilota> pilotes = new ArrayList<Pilota>();

    public void add(Pilota p) {
        pilotes.add(p);
    }

    /** Mètode que no es pot canviar de nom. Quan es vol pintar un objecte gràfic sobre un Component
     * de Swing de Java.
     */
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        /* Itera i dibuixa totes les pilotes.
        Quan s'itera sobre un arraylist que s'està modificant en un thread, salta una excepció
        ConcurrentModificationException
        */
        for (Pilota p : pilotes) {
            g2.fill(p.dibuixarPilota());
        }
        // Asegura que el objeto gráfico se actualiza
        Toolkit.getDefaultToolkit().sync();
    }
}


