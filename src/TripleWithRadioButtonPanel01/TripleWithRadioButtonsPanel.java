package TripleWithRadioButtonPanel01;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class TripleWithRadioButtonsPanel extends JPanel{
    public TripleWithRadioButtonsPanel(){
        super();
        this.setLayout(null);

        JLabel label = new JLabel("Hi.");
        label.setBounds(85,10,200,10);
        this.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(10,30,170,20);
        this.add(textField);

        JButton button1 = new JButton("Append");
        button1.setBounds(15,60,80,30);
        this.add(button1);

        JButton button2 = new JButton("Reset");
        button2.setBounds(100,60,75,30);
        this.add(button2);

        ButtonGroup group = new ButtonGroup();
        JRadioButton radio1 = new JRadioButton("lowercase");
        JRadioButton radio2 = new JRadioButton("UPPERCASE");
        group.add(radio1);
        group.add(radio2);

        radio1.setBounds(50,100,100,15);
        radio2.setBounds(45,125,110,15);

        this.add(radio1);
        this.add(radio2);
    }
}
