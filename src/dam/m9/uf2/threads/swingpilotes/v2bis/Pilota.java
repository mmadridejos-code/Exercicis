package dam.m9.uf2.threads.swingpilotes.v2bis;

import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;


/** Classe bàsica Pilota que implementa Runnable
 *  Una pilota que es mou i rebota dintre d'uns límits del panell
 * @author Montse
 * @version 22/11/2020
 */
public class Pilota implements Runnable {

    private double x = 0; //perquè la funció ellipse utilitza double
    private double y = 0;
    private double dx = 1;
    private double dy = 1;
    private int radi = 15;

    //la pilota es mou sobre aquest panell
    //totes les pilotes es mouen sobre el mateix panell
    private static JPanel elPanel;

    public Pilota(JPanel pan) {
        elPanel = pan;
    }


    /* es desplaça la pilota 1 posició en x i en y*/
    /* quan arriba als limits, canvia de direcció */
    public void mourePilota() {
        Rectangle2D limits=elPanel.getBounds();
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
        //per exemple, que es desplaci 2000 vegades
        //per veure la necessitat dels threads
        for (int i = 1; i <= 2000; i++) {
            mourePilota();
            try {
                Thread.sleep(4);
            } catch (Exception e) {
            }
            elPanel.repaint();

        }
    }

}
