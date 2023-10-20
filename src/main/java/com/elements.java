package com;

import java.awt.Font;
import java.awt.event.KeyAdapter;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Elements {

    private Elements() {

    }

    // Добавление меток
    static void setLabels(JLabel label, JPanel panel, int y, Font font1) {
        label.setBounds(40, y, 300, 40);
        label.setForeground(java.awt.Color.WHITE);
        label.setFont(font1);
        panel.add(label);
    }

    // Добавление текстовых полей
    static void setTextFields(JTextField textField, JPanel panel, int y) {
        textField.setBounds(359, y, 200, 40);
        panel.add(textField);
    }

    // Добавление кнопки
    static void setButtons(JButton button, JPanel panel, int x, int y, Font font) {
        button.setBounds(x, y, 475, 200);
        button.setFont(font);
        panel.add(button);
    }

    // Ограничивание ввода только цифр
    public static void setNumericOnly(JTextField jTextField) {
        jTextField.addKeyListener(new KeyAdapter() {
            @Override
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
