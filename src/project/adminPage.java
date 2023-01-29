package project;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adminPage extends JFrame{
    private JButton backButton;
    private JButton deleteButton;
    private JTable zamTable;
    private JPanel adminPanel;
    private JButton addButton;
    private JTextField JtextField1;
    private JTextField JtextField2;
    private JTextField JtextField3;
    private JTextField JtextField4;
    private JTextField JtextField5;
    private JTextField JtextField6;
    private JButton resetButton;


    public adminPage() {
        super();
        this.setContentPane(this.adminPanel);
        this.setDefaultCloseOperation(userPage.EXIT_ON_CLOSE);
        this.setSize(1280, 720);

        Object[] columns = {"imie i nazwisko", "adres","kod pocztowy","e-mail","nr telefonu", "cena"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        zamTable.setModel(model);


        //Back Button
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                choosePage choosePage = new choosePage();
                choosePage.setVisible(true);
                dispose();
            }
        });


        //Add Button
        Object[] row = new Object[6];

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                row[0] = JtextField1.getText();
                row[1] = JtextField2.getText();
                row[2] = JtextField3.getText();
                row[3] = JtextField4.getText();
                row[4] = JtextField5.getText();
                row[5] = JtextField6.getText();

                model.addRow(row);
            }
        });

        //Delete Button
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = zamTable.getSelectedRow();
                if (i >= 0){
                    model.removeRow(i);
                }else{
                    JOptionPane.showMessageDialog(null,"Wybierz wiersz który chcesz usunąć!");
                }
            }
        });

        //Reset Button
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JtextField1.setText("");
                JtextField2.setText("");
                JtextField3.setText("");
                JtextField4.setText("");
                JtextField5.setText("");
                JtextField6.setText("");
            }
        });
    }

    }


