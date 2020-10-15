package dam.m9.uf2.threads.swingpilotes.v1;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;


/** Classe bàsica Pilota.
 *  Una pilota que es mou i rebota dintre d'uns límits (Rectangle2D)
 * @author Montse
 * @version 15/10/2020
 */
public class Pilota {

    private double x=0; //perquè la funció ellipse utilitza double
    private double y=0;
    private double dx=1;
    private double dy=1;
    private int radi=15;


    /* es desplaça la pilota 1 posició en x i en y*/
    /* quan arriba als limits, canvia de direcció */
    public void mourePilota(Rectangle2D limits){
        double width=limits.getWidth();
        double height = limits.getHeight();
        x+=dx;
        y+=dy;
        if (x + radi/2 > width || x + radi/2 < 0) dx = -dx;
        if (y + radi/2 > height || y + radi/2 < 0) dy = -dy;
    }

    public Ellipse2D dibuixarPilota(){
        return new Ellipse2D.Double(x,y,radi,radi);
    }

}
