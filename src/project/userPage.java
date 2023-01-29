package project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class userPage extends JFrame {
    private JPanel userPanel;
    private JTabbedPane tabbedPane1;
    private JButton backButton;
    private JButton resetButton;
    private JCheckBox checkBox1;
    public JTextArea JTextArea;
    private JButton zamawiamButton;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JCheckBox checkBox5;
    private JCheckBox checkBox6;
    private JCheckBox checkBox7;
    private JCheckBox checkBox8;
    public JTextField JTextFieldCena;
    public JSpinner JSpinner1;
    public JSpinner JSpinner2;
    public JSpinner JSpinner3;
    private JSpinner JSpinner4;
    private JSpinner JSpinner5;
    private JSpinner JSpinner6;
    private JSpinner JSpinner7;
    private JSpinner JSpinner8;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JSpinner jSpinner9;
    private JSpinner jSpinner10;
    private JSpinner jSpinner11;
    private JSpinner jSpinner12;
    private JSpinner jSpinner13;
    private JSpinner jSpinner14;
    private JSpinner jSpinner15;
    private JSpinner jSpinner16;
    private JCheckBox checkBox9;
    private JCheckBox checkBox10;
    private JCheckBox checkBox11;
    private JCheckBox checkBox12;
    private JCheckBox checkBox13;
    private JCheckBox checkBox14;
    private JCheckBox checkBox15;
    private JCheckBox checkBox16;
    private int x=0;
    public int total=0;

    public userPage(){
        super("Strona sklepu");
        this.setContentPane(this.userPanel);
        this.setDefaultCloseOperation(userPage.EXIT_ON_CLOSE);
        this.setSize(1280, 720);

        //Back Button
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                choosePage choosePage = new choosePage();
                choosePage.setVisible(true);
                dispose();
            }
        });

        //Reset Button
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextFieldCena.setText("0");
                total=0;
                x=0;
                JTextArea.setText("");

                //CPU
                JSpinner1.setValue(0);
                JSpinner2.setValue(0);
                JSpinner3.setValue(0);
                JSpinner4.setValue(0);
                JSpinner5.setValue(0);
                JSpinner6.setValue(0);
                JSpinner7.setValue(0);
                JSpinner8.setValue(0);
                checkBox1.setSelected(false);
                checkBox2.setSelected(false);
                checkBox3.setSelected(false);
                checkBox4.setSelected(false);
                checkBox5.setSelected(false);
                checkBox6.setSelected(false);
                checkBox7.setSelected(false);
                checkBox8.setSelected(false);

                //GPU
                jSpinner9.setValue(0);
                jSpinner10.setValue(0);
                jSpinner11.setValue(0);
                jSpinner12.setValue(0);
                jSpinner13.setValue(0);
                jSpinner14.setValue(0);
                jSpinner15.setValue(0);
                jSpinner16.setValue(0);
                checkBox9.setSelected(false);
                checkBox10.setSelected(false);
                checkBox11.setSelected(false);
                checkBox12.setSelected(false);
                checkBox13.setSelected(false);
                checkBox14.setSelected(false);
                checkBox15.setSelected(false);
                checkBox16.setSelected(false);

            }
        });

        //Zamowienie Button
        zamawiamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (total==0){
                    JOptionPane.showMessageDialog(null, "Nie wybrałeś żadnego przedmiotu!");
                }else {
                    String msg = JTextFieldCena.getText();
                    new zamPage(msg).setVisible(true);


                }

            }
        });


    //CPU

        //przedmiot 1
        checkBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int qty = Integer.parseInt(JSpinner1.getValue().toString());
                if (qtyZero(qty) && checkBox1.isSelected()){
                    x++;
                    if(x==1){
                        kompShop();
                    }
                    int cena = qty*550;
                    total += cena;

                    JTextArea.setText(JTextArea.getText()+x+". "+jLabel1.getText()+"\t\t\t"+cena+"\n");
                    cena();
                } else {
                    checkBox1.setSelected(false);
                }
            }
        });
        //przedmiot 2
        checkBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int qty = Integer.parseInt(JSpinner2.getValue().toString());
                if (qtyZero(qty) && checkBox2.isSelected()){
                    x++;
                    if(x==1){
                        kompShop();
                    }
                    int cena = qty*850;
                    total += cena;
                    JTextArea.setText(JTextArea.getText()+x+". "+jLabel2.getText()+"\t\t\t"+cena+"\n");
                    cena();
                } else {
                    checkBox2.setSelected(false);
                }
            }
        });

        //przedmiot 3
        checkBox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int qty = Integer.parseInt(JSpinner3.getValue().toString());
                if (qtyZero(qty) && checkBox3.isSelected()){
                    x++;
                    if(x==1){
                        kompShop();
                    }
                    int cena = qty*1250;
                    total += cena;
                    JTextArea.setText(JTextArea.getText()+x+". "+jLabel3.getText()+"\t\t\t"+cena+"\n");
                    cena();
                } else {
                    checkBox3.setSelected(false);
                }
            }
        });

        //przedmioty 4
        checkBox4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int qty = Integer.parseInt(JSpinner4.getValue().toString());
                if (qtyZero(qty) && checkBox4.isSelected()){
                    x++;
                    if(x==1){
                        kompShop();
                    }
                    int cena = qty*2250;
                    total += cena;
                    JTextArea.setText(JTextArea.getText()+x+". "+jLabel4.getText()+"\t\t\t"+cena+"\n");
                    cena();
                } else {
                    checkBox4.setSelected(false);
                }
            }
        });

        //przedmiot 5
        checkBox5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int qty = Integer.parseInt(JSpinner5.getValue().toString());
                if (qtyZero(qty) && checkBox5.isSelected()){
                    x++;
                    if(x==1){
                        kompShop();
                    }
                    int cena = qty*350;
                    total += cena;
                    JTextArea.setText(JTextArea.getText()+x+". "+jLabel5.getText()+"\t\t\t"+cena+"\n");
                    cena();
                } else {
                    checkBox5.setSelected(false);
                }
            }
        });

        //przedmiot 6
        checkBox6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int qty = Integer.parseInt(JSpinner6.getValue().toString());
                if (qtyZero(qty) && checkBox6.isSelected()){
                    x++;
                    if(x==1){
                        kompShop();
                    }
                    int cena = qty*650;
                    total += cena;
                    JTextArea.setText(JTextArea.getText()+x+". "+jLabel6.getText()+"\t\t\t"+cena+"\n");
                    cena();
                } else {
                    checkBox6.setSelected(false);
                }
            }
        });

        //przedmiot 7
        checkBox7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int qty = Integer.parseInt(JSpinner7.getValue().toString());
                if (qtyZero(qty) && checkBox7.isSelected()){
                    x++;
                    if(x==1){
                        kompShop();
                    }
                    int cena = qty*1200;
                    total += cena;
                    JTextArea.setText(JTextArea.getText()+x+". "+jLabel7.getText()+"\t\t\t"+cena+"\n");
                    cena();
                } else {
                    checkBox7.setSelected(false);
                }
            }
        });

        //przedmiot 8
        checkBox8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int qty = Integer.parseInt(JSpinner8.getValue().toString());
                if (qtyZero(qty) && checkBox8.isSelected()){
                    x++;
                    if(x==1){
                        kompShop();
                    }
                    int cena = qty*2350;
                    total += cena;
                    JTextArea.setText(JTextArea.getText()+x+". "+jLabel8.getText()+"\t\t\t"+cena+"\n");
                    cena();
                } else {
                    checkBox8.setSelected(false);
                }
            }
        });



    //GPU

        //przedmiot 9
        checkBox9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int qty = Integer.parseInt(jSpinner9.getValue().toString());
                if (qtyZero(qty) && checkBox9.isSelected()){
                    x++;
                    if(x==1){
                        kompShop();
                    }
                    int cena = qty*450;
                    total += cena;
                    JTextArea.setText(JTextArea.getText()+x+". "+jLabel9.getText()+"\t\t\t"+cena+"\n");
                    cena();
                } else {
                    checkBox9.setSelected(false);
                }
            }
        });

        //przedmiot 10
        checkBox10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int qty = Integer.parseInt(jSpinner10.getValue().toString());
                if (qtyZero(qty) && checkBox10.isSelected()){
                    x++;
                    if(x==1){
                        kompShop();
                    }
                    int cena = qty*1150;
                    total += cena;
                    JTextArea.setText(JTextArea.getText()+x+". "+jLabel10.getText()+"\t\t"+cena+"\n");
                    cena();
                } else {
                    checkBox10.setSelected(false);
                }
            }
        });

        //przedmiot 11
        checkBox11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int qty = Integer.parseInt(jSpinner11.getValue().toString());
                if (qtyZero(qty) && checkBox11.isSelected()){
                    x++;
                    if(x==1){
                        kompShop();
                    }
                    int cena = qty*2300;
                    total += cena;
                    JTextArea.setText(JTextArea.getText()+x+". "+jLabel11.getText()+"\t\t"+cena+"\n");
                    cena();
                } else {
                    checkBox11.setSelected(false);
                }
            }
        });

        //przedmiot 12
        checkBox12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int qty = Integer.parseInt(jSpinner12.getValue().toString());
                if (qtyZero(qty) && checkBox12.isSelected()){
                    x++;
                    if(x==1){
                        kompShop();
                    }
                    int cena = qty*3850;
                    total += cena;
                    JTextArea.setText(JTextArea.getText()+x+". "+jLabel12.getText()+"\t\t"+cena+"\n");
                    cena();
                } else {
                    checkBox12.setSelected(false);
                }
            }
        });

        //przedmiot 13
        checkBox13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int qty = Integer.parseInt(jSpinner13.getValue().toString());
                if (qtyZero(qty) && checkBox13.isSelected()){
                    x++;
                    if(x==1){
                        kompShop();
                    }
                    int cena = qty*650;
                    total += cena;
                    JTextArea.setText(JTextArea.getText()+x+". "+jLabel13.getText()+"\t\t"+cena+"\n");
                    cena();
                } else {
                    checkBox13.setSelected(false);
                }
            }
        });

        //przedmiot 14
        checkBox14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int qty = Integer.parseInt(jSpinner14.getValue().toString());
                if (qtyZero(qty) && checkBox14.isSelected()){
                    x++;
                    if(x==1){
                        kompShop();
                    }
                    int cena = qty*1100;
                    total += cena;
                    JTextArea.setText(JTextArea.getText()+x+". "+jLabel14.getText()+"\t\t"+cena+"\n");
                    cena();
                } else {
                    checkBox14.setSelected(false);
                }
            }
        });

        //przedmiot 15
        checkBox15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int qty = Integer.parseInt(jSpinner15.getValue().toString());
                if (qtyZero(qty) && checkBox15.isSelected()){
                    x++;
                    if(x==1){
                        kompShop();
                    }
                    int cena = qty*2200;
                    total += cena;
                    JTextArea.setText(JTextArea.getText()+x+". "+jLabel15.getText()+"\t\t"+cena+"\n");
                    cena();
                } else {
                    checkBox15.setSelected(false);
                }
            }
        });

        //przedmiot 16
        checkBox16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int qty = Integer.parseInt(jSpinner16.getValue().toString());
                if (qtyZero(qty) && checkBox16.isSelected()){
                    x++;
                    if(x==1){
                        kompShop();
                    }
                    int cena = qty*3450;
                    total += cena;
                    JTextArea.setText(JTextArea.getText()+x+". "+jLabel16.getText()+"\t\t"+cena+"\n");
                    cena();
                } else {
                    checkBox16.setSelected(false);
                }
            }
        });

    }


    public void kompShop(){

        JTextArea.setText("*************************KOMP-SHOP*************************"
                            +"\n\n"
                        +"Nazwa:\t\t\t"+"cena:\n");
    }

    public boolean qtyZero(int qty){
        if (qty == 0){
            JOptionPane.showMessageDialog(null, " Proszę podać ilość!");
            return false;
        }
        return true;
    }

    public String cena(){
        JTextFieldCena.setText(String.valueOf(total));
        return null;
    }

}
