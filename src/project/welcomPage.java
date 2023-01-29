package project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class welcomPage extends JFrame {
    private JPanel panel1;
    private JButton wyjscieButton;
    private JButton infoButton;
    private JButton zaczynamyButton;

    public static void main(String[] args) {

        welcomPage Window = new welcomPage();
        Window.setVisible(true);
    }

    public welcomPage() {
        super("Witamy w sklepie!");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(choosePage.EXIT_ON_CLOSE);
        this.setSize(720, 720);

        //Zaczynamy Button
        zaczynamyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                choosePage choosePage = new choosePage();
                choosePage.setVisible(true);
                dispose();
            }
        });

        //Wyjscie Button
        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int exit = JOptionPane.showConfirmDialog(null, "Czy napewno chcesz wyjść?");

                switch (exit){
                    case 0:
                        System.exit(0);
                    case 1:
                        break;
                }
            }
        });
        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infoPage info = new infoPage();
                info.setVisible(true);
            }
        });
    }

}
