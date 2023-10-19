package com;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.xml.bind.JAXBPermission;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.security.AlgorithmConstraints;

public class calculator {

    JFrame frame;
    private JTextField textField1 = new JTextField();
    private JTextField textField2 = new JTextField();
    private JTextField textField3 = new JTextField();
    private JTextField textField4 = new JTextField();
    private JLabel label1 = new JLabel();
    private JLabel label2 = new JLabel();
    private JLabel label3 = new JLabel();
    private JLabel label4 = new JLabel();
    private JButton button = new JButton("Рассчитать");
    private JPanel panel = new JPanel();

    public calculator() {
        frame = new JFrame();
        frame.getContentPane().setBackground(java.awt.Color.GRAY);
        frame.setBounds(300, 200, 600, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);

        panel.setLayout(null);
        panel.setBackground(java.awt.Color.GRAY);
        frame.add(panel);

        Font font = new Font("Times New Roman", Font.BOLD, 30);
        Font font1 = new Font("Times New Roman", Font.BOLD, 15);
        Font btnFont = new Font("Times New Roman", Font.BOLD, 45);

        JLabel mainLabel = new JLabel("<html>rасчет платы за отопление<br/>в квартире</html>");
        mainLabel.setBounds(0, 0, 600, 100);
        mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mainLabel.setForeground(java.awt.Color.WHITE);
        mainLabel.setFont(font);
        panel.add(mainLabel);

        label1.setText("Введите тарифную стоимость:");
        label2.setText("Введите площадь здания:");
        label3.setText("<html>Введите площадь<br>общеведомого имущества</html>");
        label4.setText("Введите площадь квартиры:");

        elements.SetLabels(label1, panel, 150, font1);
        elements.SetLabels(label2, panel, 250, font1);
        elements.SetLabels(label3, panel, 350, font1);
        elements.SetLabels(label4, panel, 450, font1);

        elements.SetTextFields(textField1, panel, 150);
        elements.SetTextFields(textField2, panel, 250);
        elements.SetTextFields(textField3, panel, 350);
        elements.SetTextFields(textField4, panel, 450);

        elements.SetButtons(button, panel, 50, 530, btnFont);

        ActionListener MOUSE_CLICKED = new ListenerButton();
        button.addActionListener(MOUSE_CLICKED);

        frame.setVisible(true);

        elements.setNumericOnly(textField1);
        elements.setNumericOnly(textField2);
        elements.setNumericOnly(textField3);
        elements.setNumericOnly(textField4);
    }

    public JTextField getJTextField1() {
        return textField1;
    }

    public JTextField getJTextField2() {
        return textField2;
    }

    public JTextField getJTextField3() {
        return textField3;
    }

    public JTextField getJTextField4() {
        return textField4;
    }

    public JPanel getJPanel() {
        return panel;
    }

    public JFrame getJFrame() {
        return frame;
    }
}
