package dam.m9.uf2.threads.swingpilotes.v1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/** Classe auxiliar on es guarden i es mouen les pilotes creades al Frame
 * FinestraJoc.
 * @author Montse
 * @version 15/10/2020
 */
class PanelPilotes extends JPanel {
    private ArrayList<Pilota> pilotes = new ArrayList<Pilota>();

    public void add(Pilota p) {
        pilotes.add(p);
    }

    /** Mètode que no es pot canviar de nom. Quan es vol pintar un objecte gràfic sobre un Component
     * de Swing de Java.
     * @param g
     */
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        /* itera i dibuixa totes les pilotes*/
        for (Pilota p : pilotes) {
            g2.fill(p.dibuixarPilota());
        }
        // Asegura que el objeto gráfico se actualiza
        Toolkit.getDefaultToolkit().sync();
    }
}


