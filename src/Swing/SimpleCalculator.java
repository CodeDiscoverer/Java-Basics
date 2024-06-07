package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {

    final JTextField textField;
    boolean isFirstInput = true;
    double num1 = 0;
    double num2 = 0;
    char operator;

    public SimpleCalculator() {
        JFrame frame = new JFrame("Simple Calculator");
        JPanel panel = new JPanel();
        textField = new JTextField();
        JButton[] numberButtons = new JButton[10];
        JButton[] functionButtons = new JButton[4];
        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");
        JButton multiplyButton = new JButton("*");
        JButton divideButton = new JButton("/");
        JButton equalsButton = new JButton("=");
        JButton clearButton = new JButton("C");

        // Set fonts
        Font buttonFont = new Font("Arial", Font.BOLD, 20);
        textField.setFont(buttonFont);

        // Set button sizes
        Dimension buttonSize = new Dimension(60, 60);
        addButton.setPreferredSize(buttonSize);
        subtractButton.setPreferredSize(buttonSize);
        multiplyButton.setPreferredSize(buttonSize);
        divideButton.setPreferredSize(buttonSize);
        equalsButton.setPreferredSize(buttonSize);
        clearButton.setPreferredSize(buttonSize);

        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setEditable(false);

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(buttonFont);
            numberButtons[i].addActionListener(new NumberListener());
            numberButtons[i].setPreferredSize(buttonSize);
        }

        functionButtons[0] = addButton;
        functionButtons[1] = subtractButton;
        functionButtons[2] = multiplyButton;
        functionButtons[3] = divideButton;

        for (JButton button : functionButtons) {
            button.setFont(buttonFont);
            button.setPreferredSize(buttonSize);
            button.addActionListener(new FunctionListener());
        }

        equalsButton.setFont(buttonFont);
        clearButton.setFont(buttonFont);

        equalsButton.addActionListener(new EqualsListener());
        clearButton.addActionListener(new ClearListener());

        panel.add(clearButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(divideButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(multiplyButton);
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(subtractButton);
        panel.add(numberButtons[0]);
        panel.add(equalsButton);
        panel.add(addButton);

        frame.add(textField, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    class NumberListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String digit = ((JButton) e.getSource()).getText();
            textField.setText(textField.getText() + digit);
        }
    }

    class FunctionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (isFirstInput) {
                String command = ((JButton) e.getSource()).getText();
                operator = command.charAt(0);
                num1 = Double.parseDouble(textField.getText());
                textField.setText("");
                isFirstInput = false;
            } else {
                // Allow only one operator per calculation
                textField.setText("Error");
            }
        }
    }

    class EqualsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!isFirstInput) {
                num2 = Double.parseDouble(textField.getText());
                double result = 0;

                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            textField.setText("Error");
                            return;
                        }
                        break;
                }

                textField.setText(String.valueOf(result));
                isFirstInput = true;
            } else {
                // No operation has been selected
                textField.setText("Error");
            }
        }
    }

    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textField.setText("");
            num1 = 0;
            num2 = 0;
            isFirstInput = true;
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
