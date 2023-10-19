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
        String regex = "[0-9]+";
        boolean check = textField.getText().matches(regex);
        boolean check2 = textField2.getText().matches(regex);
        boolean check3 = textField3.getText().matches(regex);
        boolean check4 = textField4.getText().matches(regex);
        if ((check == true) && (check2 == true) && (check3 == true) && (check4 == true)) {
            heatSolver heat = new heatSolver(Double.parseDouble(textField4.getText()),
                    Double.parseDouble(textField3.getText()), Double.parseDouble(textField2.getText()),
                    Double.parseDouble(textField.getText()));
            System.out.println(heat.getOtv());
            JOptionPane.showMessageDialog(main.window.getJFrame(),
                    "Вам нужно оплатить за отопление: " + heat.getOtv() + " Руб.");
        } else {
            JOptionPane.showMessageDialog(main.window.getJFrame(),
                    "Введите корректные числа");
            System.out.println(check);
            System.out.println(check2);
            System.out.println(check3);
            System.out.println(check4);
        }
    }

}
