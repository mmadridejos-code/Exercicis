package dam.m9.uf2.threads.swingpilotes.v2bis;

import javax.swing.*;

/** Classe que obre una finestra de joc on es creen pilotes que es mouen i reboten.
 *  Cada vegada que es crea una pilota, es crea un Thread on s'executa el seu codi
 *  de moviment i pintar.
 *  El Panell on es pinta es comparteix.
 *
 * @author Montse
 * @version 22/11/2020 Versió AMB threads
 */
public class MainV2bis {
    public static void main(String[] args) {
        JFrame joc=new FinestraJocV2bis();
        joc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        joc.setVisible(true);
    }
}