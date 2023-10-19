package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ListenerButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JTextField textField = main.window.getJTextField1();

        if (!"1234567890.\b".contains(textField.getText()) || textField.getText().isEmpty()) {
            textField.setText("0");
        }
        tarif tarif = new tarif(Double.parseDouble(textField.getText()));
        System.out.println(tarif.gettarif());
        // Output.setText(tarif1.toString());
    }

}
