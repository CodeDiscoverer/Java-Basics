package Swing;

import javax.swing.*;

public class BasicClickButton {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My First Swing Program");


        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JButton button = new JButton("Hello, Swing!");
        button.setBounds(200, 100, 100, 100);


        frame.add(button);
        frame.setVisible(true);
    }
}
