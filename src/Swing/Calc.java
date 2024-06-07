package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Basic Calculator");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel Head = new JLabel("The Sum of Two Numbers");
        Head.setBounds(130, 20, 150, 30);
        frame.add(Head);

        JLabel firstLabel = new JLabel("First Number:");
        JTextField firstField = new JTextField();
        firstField.setBounds(200, 70, 150, 30);
        firstLabel.setBounds(50, 70, 150, 30);
        frame.add(firstLabel);

        JLabel secondLabel = new JLabel("Second Number:");
        JTextField secondField = new JTextField();
        secondField.setBounds(200, 120, 150, 30);
        secondLabel.setBounds(50, 120, 150, 30);
        frame.add(secondLabel);

        JButton clear = new JButton("CLEAR");
        clear.setBounds(50, 170, 100, 30);

        JButton calculate = new JButton("CALCULATE");
        calculate.setBounds(200, 170, 150, 30);

        frame.add(firstLabel);
        frame.add(secondLabel);
        frame.add(firstField);
        frame.add(secondField);
        frame.add(clear);
        frame.add(calculate);
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int first = Integer.parseInt(firstField.getText());
                int second = Integer.parseInt(secondField.getText());
                int sum = first + second;

                JOptionPane.showMessageDialog(frame, "Sum: " + sum);
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstField.setText("");
                secondField.setText("");
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
    }
}