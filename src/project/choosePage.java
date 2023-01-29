package project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class choosePage extends JFrame{
    private JPanel mainPanel;
    private JButton USERButton;
    private JButton ADMINButton;
    private JButton COFNIJButton;


    public choosePage() {
        super("Wybór użytkownika");
        this.setContentPane(this.mainPanel);
        this.setDefaultCloseOperation(choosePage.EXIT_ON_CLOSE);
        this.setSize(720, 720);

        //Logowanie na Admina
        ADMINButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginPage admin = new loginPage();
                admin.setVisible(true);
                dispose();
            }
        });

        //Logowanie na Usera
        USERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userPage user = new userPage();
                user.setVisible(true);
                dispose();
            }
        });

        //Cofnij Button
        COFNIJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                welcomPage Page = new welcomPage();
                Page.setVisible(true);
                dispose();
            }
        });
    }
}
