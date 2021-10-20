package dam.m9.uf2.threads.swingpilotes.v1ambthreads;

import javax.swing.*;

/** Classe que obre una finestra de joc on es creen pilotes que es mouen i reboten.
 *
 * @author Montse
 * @version 14/10/2021 Versió amb threads
 */
public class Main {
    public static void main(String[] args) {
        JFrame joc=new FinestraJoc();
        joc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        joc.setVisible(true);
    }
}