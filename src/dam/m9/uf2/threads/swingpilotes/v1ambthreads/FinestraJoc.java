package dam.m9.uf2.threads.swingpilotes.v1ambthreads;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** Classe gràfica de tipus finestra (JFrame) on es situa un panell
 * on es mouen i reboten pilotes que es creen amb un botó (JButton)
 * que està situat al sud de la finestra.
 * Utilitzo una classe auxiliar PanelPilotes que és on es creen i es mouen les pilotes.
 * @author Montse
 * @version 14/10/2021
 *
 */

public class FinestraJoc extends JFrame {

    private PanelPilotes panelPilotes = new PanelPilotes();

    public FinestraJoc() {
        setBounds(600, 300, 400, 350);
        setTitle("Pilotes botant");
        add(panelPilotes, BorderLayout.CENTER);
        JPanel botonera = new JPanel();
        JButton boto1 = new JButton("Pilota va!");
        JButton boto2 = new JButton("Sortir");
        botonera.add(boto1);
        botonera.add(boto2);
        boto1.addActionListener(new ClickBotoPilotaVa());
        boto2.addActionListener(new ClickSortir());
        add(botonera, BorderLayout.SOUTH);
    }

    class ClickSortir implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.exit(0);
        }
    }

    class ClickBotoPilotaVa implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            panelPilotes.addPilota();
            }
        }
}