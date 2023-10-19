package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ListenerButton implements ActionListener {

    solver slv;

    @Override
    public void actionPerformed(ActionEvent e) {
        JTextField textField = main.window.getJTextField1();
        JTextField textField2 = main.window.getJTextField2();
        JTextField textField3 = main.window.getJTextField3();
        JTextField textField4 = main.window.getJTextField4();
        if (true) {
            heatSolver heat = new heatSolver(Double.parseDouble(textField4.getText()),
                    Double.parseDouble(textField3.getText()), Double.parseDouble(textField2.getText()),
                    Double.parseDouble(textField.getText()));
            System.out.println(heat.getOtv());
            JOptionPane.showMessageDialog(main.window.getJFrame(),
                    "Вам нужно оплатить за отопление: " + heat.getOtv() + " Руб.");
        } else {
            JOptionPane.showMessageDialog(main.window.getJFrame(),
                    "Введите корректные числа");
        }
    }

}
