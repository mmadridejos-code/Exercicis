package dam.m9.uf2.threads.swingpilotes.v0sensethreads;

import javax.swing.*;

/** Classe que obre una finestra de joc on es creen pilotes que es mouen i reboten.
 *  Atenció: la primera vegada que s'executa sembla que les pilotes no es veuen perquè
 *  es desplacen molt ràpidament. Cal descomentar el sleep del PanelPilotes
 * @author Montse
 * @version 14/10/2021 Versió sense threads
 */
public class Main {
    public static void main(String[] args) {
        JFrame joc=new FinestraJoc();
        joc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        joc.setVisible(true);
    }
}