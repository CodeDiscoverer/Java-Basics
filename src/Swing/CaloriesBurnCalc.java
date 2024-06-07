package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaloriesBurnCalc {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calories Burn Calculator");
        frame.setSize(500, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel inputLabel = new JLabel("Choose Input Type:");
        JRadioButton stepsRadio = new JRadioButton("Steps");
        JRadioButton distanceRadio = new JRadioButton("Distance (Kilometers)");
        ButtonGroup inputGroup = new ButtonGroup();
        inputGroup.add(stepsRadio);
        inputGroup.add(distanceRadio);
        stepsRadio.setSelected(true);

        JLabel distanceLabel = new JLabel("Distance (Kilometers):");
        JLabel stepsLabel = new JLabel("Steps Walked:");

        JTextField distanceField = new JTextField();
        JTextField stepsField = new JTextField();

        JButton clear = new JButton("CLEAR");
        JButton calculate = new JButton("CALCULATE");

        inputLabel.setBounds(50, 30, 150, 30);
        stepsRadio.setBounds(200, 30, 100, 30);
        distanceRadio.setBounds(300, 30, 200, 30);
        distanceLabel.setBounds(50, 70, 150, 30);
        stepsLabel.setBounds(50, 110, 150, 30);
        distanceField.setBounds(200, 70, 150, 30);
        stepsField.setBounds(200, 110, 150, 30);
        clear.setBounds(50, 150, 100, 30);
        calculate.setBounds(200, 150, 150, 30);

        frame.add(inputLabel);
        frame.add(stepsRadio);
        frame.add(distanceRadio);
        frame.add(distanceLabel);
        frame.add(stepsLabel);
        frame.add(distanceField);
        frame.add(stepsField);
        frame.add(clear);
        frame.add(calculate);

        ActionListener radioListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (stepsRadio.isSelected()) {
                    distanceField.setEnabled(false);
                    stepsField.setEnabled(true);
                } else {
                    distanceField.setEnabled(true);
                    stepsField.setEnabled(false);
                }
            }
        };
        stepsRadio.addActionListener(radioListener);
        distanceRadio.addActionListener(radioListener);

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double caloriesBurned = 0.0;

                if (stepsRadio.isSelected()) {
                    int steps = Integer.parseInt(stepsField.getText());
                    caloriesBurned = steps * 0.05;
                } else {
                    double distance = Double.parseDouble(distanceField.getText());
                    int steps = (int) (distance * 1500);
                    caloriesBurned = steps * 0.05;
                }

                JOptionPane.showMessageDialog(frame, "Calories Burned: " + caloriesBurned);
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                distanceField.setText("");
                stepsField.setText("");
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
