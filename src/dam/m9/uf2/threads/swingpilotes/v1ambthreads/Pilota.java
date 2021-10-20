package dam.m9.uf2.threads.swingpilotes.v1ambthreads;

import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;


/**
 * Classe bàsica Pilota. Versió Thread per evitar esperes actives de les GUIs
 * Una pilota que es mou i rebota dintre d'uns límits
 * En aquest exemple, els límits venen donats per un panell (JPanel) contenidor
 *
 * @author Montse
 * @version 14/10/2021
 */
public class Pilota extends Thread{

    private double x = 0; //perquè la funció ellipse utilitza double
    private double y = 0;
    private double dx = 1;
    private double dy = 1;
    private int radi = 15;

    private JPanel elPanelComu; //el panell on reboten les pilotes

    public void setElPanelComu(JPanel p) {
        elPanelComu = p;
    }

    /* es desplaça la pilota 1 posició en x i en y*/
    /* quan arriba als limits, canvia de direcció */
    public void mourePilota() {
        Rectangle2D limits = elPanelComu.getBounds();
        double width = limits.getWidth();
        double height = limits.getHeight();
        x += dx;
        y += dy;
        if (x + radi / 2 > width || x + radi / 2 < 0) dx = -dx;
        if (y + radi / 2 > height || y + radi / 2 < 0) dy = -dy;
    }

    public Ellipse2D dibuixarPilota() {
        return new Ellipse2D.Double(x, y, radi, radi);
    }


    @Override
    public void run() {
        for (int i = 1; i <= 2000; i++) {
            mourePilota();
            try {
                Thread.sleep(4);
            } catch (Exception e) {
            }
            elPanelComu.repaint();
        }
    }
}