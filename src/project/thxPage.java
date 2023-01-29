package project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class thxPage extends JFrame{
    private JPanel panel1;
    private JButton WYJŚCIEButton;
    private JButton KOLEJNEZAKUPYButton;

    public thxPage() {

        super("Dziękujemy!");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(choosePage.EXIT_ON_CLOSE);
        this.setSize(720, 720);

        //Wyjscie Button
        WYJŚCIEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //Zakupy Button
        KOLEJNEZAKUPYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
