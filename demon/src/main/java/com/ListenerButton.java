package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ListenerButton implements ActionListener {

    Solver slv;

    @Override
    public void actionPerformed(ActionEvent e) {
        // Получение результатов из текстовых полей
        JTextField textField = main.window.getJTextField1();
        JTextField textField2 = main.window.getJTextField2();
        JTextField textField3 = main.window.getJTextField3();
        JTextField textField4 = main.window.getJTextField4();
        // ПРоверка чтобы не было пустых полей
        String regex = "[0-9]+";
        boolean check = textField.getText().matches(regex);
        boolean check2 = textField2.getText().matches(regex);
        boolean check3 = textField3.getText().matches(regex);
        boolean check4 = textField4.getText().matches(regex);
        if ((check) && (check2) && (check3) && (check4)) {
            // Создание объекта решения
            HeatSolver heat = new HeatSolver(Double.parseDouble(textField4.getText()),
                    Double.parseDouble(textField3.getText()), Double.parseDouble(textField2.getText()),
                    Double.parseDouble(textField.getText()));
            // Вывод ответа
            JOptionPane.showMessageDialog(main.window.getJFrame(),
                    "Вам нужно оплатить за отопление: " + heat.getOtv() + " Руб.");
        } else {
            // Если введены некоректные числа
            JOptionPane.showMessageDialog(main.window.getJFrame(),
                    "Введите корректные числа");
        }
    }

}
