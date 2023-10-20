package com;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

public class Calculator {

    // Объекты GUI
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
    private String fnt = "Times New Roman";

    public Calculator() {
        // Окно
        frame = new JFrame();
        frame.getContentPane().setBackground(java.awt.Color.GRAY);
        frame.setBounds(300, 200, 600, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Калькулятор расчета оплаты отопления в квартире");
        Image img = Toolkit.getDefaultToolkit().getImage(".\\src\\pic\\jpg1685139384.jpg");
        frame.setIconImage(img);

        // Панель
        panel.setLayout(null);
        panel.setBackground(java.awt.Color.GRAY);
        frame.add(panel);

        // Шрифты
        Font font = new Font(fnt, Font.BOLD, 30);
        Font font1 = new Font(fnt, Font.BOLD, 15);
        Font btnFont = new Font(fnt, Font.BOLD, 45);

        // Главная метка
        JLabel mainLabel = new JLabel("<html>Расчет платы за отопление<br/>в квартире</html>");
        mainLabel.setBounds(0, 0, 600, 100);
        mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mainLabel.setForeground(java.awt.Color.WHITE);
        mainLabel.setFont(font);
        panel.add(mainLabel);

        // Текст в метках
        label1.setText("Введите тарифную стоимость:");
        label2.setText("Введите площадь здания:");
        label3.setText("<html>Введите площадь<br>общеведомого имущества</html>");
        label4.setText("Введите площадь квартиры:");

        // Добавление меток на панель
        Elements.setLabels(label1, panel, 150, font1);
        Elements.setLabels(label2, panel, 250, font1);
        Elements.setLabels(label3, panel, 350, font1);
        Elements.setLabels(label4, panel, 450, font1);

        // Добавление текстовых полей на панель
        Elements.setTextFields(textField1, panel, 150);
        Elements.setTextFields(textField2, panel, 250);
        Elements.setTextFields(textField3, panel, 350);
        Elements.setTextFields(textField4, panel, 450);

        // Добавление кнопки
        Elements.setButtons(button, panel, 50, 530, btnFont);

        // Метод при нажатии на кнопку
        ActionListener mouseClicked = new ListenerButton();
        button.addActionListener(mouseClicked);

        frame.setVisible(true);

        // Ограничивание ввода в текстовые поля
        Elements.setNumericOnly(textField1);
        Elements.setNumericOnly(textField2);
        Elements.setNumericOnly(textField3);
        Elements.setNumericOnly(textField4);
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
