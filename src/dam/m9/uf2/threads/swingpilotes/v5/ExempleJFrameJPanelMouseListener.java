package dam.m9.uf2.threads.swingpilotes.v5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/** Petit exemple amb Swing per detectar les coordenades del ratolí
 * @author Montse
 * @version 29/10/2020
 *
 */
public class ExempleJFrameJPanelMouseListener extends JFrame {
    private ElMeuPanel panel;

    public static void main(String[] args) {
        new ExempleJFrameJPanelMouseListener();
    }

    public ExempleJFrameJPanelMouseListener() {
        panel = new ElMeuPanel();
        setBounds(600, 300, 600, 500);
        setBackground(Color.white);
        setTitle("Proves amb el mouse!");
        add(panel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}


class ElMeuPanel extends JPanel implements MouseListener {
    //per fer x i y accessibles des del paint()
    private int x, y;

    public ElMeuPanel() {
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        x = mouseEvent.getX();
        y = mouseEvent.getY();
        //printa per consola les coordenades del mouse en format (x,y)
        System.out.println("(" + x + "," + y + ")");
        repaint(); //es crida a paint()

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        Graphics2D g = (Graphics2D) graphics;
        //així pintem la coordenada al Panel
        g.fillOval(x, y, 10, 10);
    }
}