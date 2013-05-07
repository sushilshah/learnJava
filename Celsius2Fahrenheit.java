import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;


public class Celsius2Fahrenheit extends JFrame implements ActionListener {
    private JTextField fieldF = new JTextField();
    private JTextField fieldC = new JTextField();
    private JLabel     labelF = new JLabel("Fahrenheit:");
    private JLabel     labelC = new JLabel("Celsius:");

    public Celsius2Fahrenheit() {
        setTitle("Temperature Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new GridLayout(2, 2));
        c.add(labelC);
        c.add(fieldC);
        c.add(labelF);
        c.add(fieldF);
        fieldC.addActionListener(this);
        fieldF.setEditable(false);
        setSize(220, 75);
        setResizable(false);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        String s = fieldC.getText();
        double C = Double.parseDouble(s);
        double F = (9.0 / 5.0) * C + 32.0;
        DecimalFormat f = new DecimalFormat("0.0");
        fieldF.setText(f.format(F));
    }


    public static void main(String[] args) {
        new Celsius2Fahrenheit();
    }
}

