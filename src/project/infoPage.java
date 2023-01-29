package project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class infoPage extends JFrame{
    private JPanel panel1;
    private JTextPane KOMPSHOPJestToTextPane;
    private JButton COFNIJButton;


    public infoPage() {

        super("Informacje!");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(choosePage.EXIT_ON_CLOSE);
        this.setSize(720, 720);


        COFNIJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
