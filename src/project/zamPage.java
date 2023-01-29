package project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class zamPage extends userPage {
    private JPanel panel1;
    private JButton ZamowButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textFieldC;
    private JButton resetButton;


    public zamPage(String msg){
        super();
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(loginPage.DISPOSE_ON_CLOSE);
        this.setSize(580, 720);

        textFieldC.setText(msg);

        //Zamow Button
        ZamowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                String name = textField1.getText();
                String adres = textField2.getText();
                String kod = textField3.getText();
                String email = textField4.getText();
                String tel = textField5.getText();
                String cena = textFieldC.getText();


                if (name.equals("") || adres.equals("") || kod.equals("") || email.equals("") || tel.equals(""))
                    JOptionPane.showMessageDialog(null,"Wypełnij wszytskie pola!");
                else if (!email.contains("@"))
                    JOptionPane.showMessageDialog(null, "Podaj prawidłowy e-mail!");
                else{
                    try{
                        FileWriter Writer = new FileWriter("zamowienie.txt",true);
                        Writer.write(""+name+" | "+adres+" | "+kod+" | "+email+" | "+tel+" | "+cena);
                        Writer.write(System.getProperty("line.separator"));
                        Writer.close();
                        dispose();
                        thxPage Page = new thxPage();
                        Page.setVisible(true);
                        userPage User = new userPage();
                        User.setVisible(false);
                    }catch (Exception e){
                        JOptionPane.showMessageDialog(null, "Error!");
                    }
                }

            }
        });

        //Reset Button
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
            }
        });
    }


}
