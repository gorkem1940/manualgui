//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.arlasner.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator {
    private JPanel MainPanel;
    private JPanel topPanel;
    private JPanel bottomPanel;
    private JTextField firtstNumberField;
    private JLabel firstNumber;
    private JTextField secondNumberField;
    private JLabel secondNumber;
    private JLabel result;
    private JButton addButton;
    private JButton modButton;
    private JButton clearButton;
    private JTextField resultField;

    public SimpleCalculator() {
        this.$$$setupUI$$$();
        this.addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstNumber = SimpleCalculator.this.firtstNumberField.getText().trim();
                String secondNumber = SimpleCalculator.this.secondNumberField.getText().trim();
                Double result = Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);
                SimpleCalculator.this.resultField.setText(result.toString());
            }
        });
        this.modButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        this.clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SimpleCalculator");
        frame.setContentPane((new SimpleCalculator()).MainPanel);
        frame.setDefaultCloseOperation(3);
        frame.pack();
        frame.setVisible(true);
    }
}
