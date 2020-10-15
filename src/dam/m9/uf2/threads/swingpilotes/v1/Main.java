package dam.m9.uf2.threads.swingpilotes.v1;

import javax.swing.*;

/** Classe que obre una finestra de joc on es creen pilotes que es mouen i reboten.
 *  Atenció: la primera vegada que s'executa sembla que les pilotes no es veuen perquè
 *  es desplacen molt ràpidament. Cal descomentar el sleep del actionPerformed del botó
 *  "Pilota va".
 * @author Montse
 * @version 15/10/2020 Versió sense threads
 */
public class Main {
    public static void main(String[] args) {
        JFrame joc=new FinestraJoc();
        joc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        joc.setVisible(true);
    }
}
