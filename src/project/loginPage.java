package project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginPage extends JFrame {
    private JPanel logPanel;
    private JTextField LoginField;
    private JPasswordField PasswordField;
    private JButton loginButton;
    private JButton backButton;
    private JButton registerButton;
    private String username, password;

    public loginPage() {
        super("Login");
        this.setContentPane(this.logPanel);
        this.setDefaultCloseOperation(loginPage.EXIT_ON_CLOSE);
        this.setSize(580, 720);


        //Login Button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                username = new String(LoginField.getText());
                password = new String(PasswordField.getPassword());

                if(username.equals("admin") && password.equals("admin")){
                    adminPage admin = new adminPage();
                    admin.setVisible(true);
                    dispose();
                } else{
                    JOptionPane.showMessageDialog(null,"Zły login lub hasło!");
                }

            }
        });

        //Back Button
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                choosePage choosePage = new choosePage();
                choosePage.setVisible(true);
                dispose();
            }
        });
    }
}