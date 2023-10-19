package com;

import java.awt.Font;
import java.awt.event.KeyAdapter;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class elements {
    static void SetLabels(JLabel label, JPanel panel, int y, Font font1) {
        label.setBounds(40, y, 300, 40);
        label.setForeground(java.awt.Color.WHITE);
        label.setFont(font1);
        panel.add(label);
        System.out.println("Gratz");
    }

    static void SetTextFields(JTextField textField, JPanel panel, int y) {
        textField.setBounds(360, y, 200, 40);
        panel.add(textField);
    }

    static void SetButtons(JButton button, JPanel panel, int x, int y, Font font) {
        button.setBounds(x, y, 475, 200);
        button.setFont(font);
        panel.add(button);
    }

    public static void setNumericOnly(JTextField jTextField) {
        jTextField.addKeyListener(new KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                char c = e.getKeyChar();
                if ((!Character.isDigit(c) ||
                        (c == java.awt.event.KeyEvent.VK_BACK_SPACE) ||
                        (c == java.awt.event.KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });
    }
}
