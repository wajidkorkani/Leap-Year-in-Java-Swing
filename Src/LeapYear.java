import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LeapYear{
    public static void main(String[] args){
        leapYear();
    }
    public static void leapYear(){
        JFrame frame = new JFrame("Java Swing");
        frame.setLayout(new FlowLayout());
        JTextField input = new JTextField(50);
        // input.setFont(new Font("Arial", Font.BOLD, 20));
        // input.setBackground(Color.WHITE);
        // input.setForeground(Color.BLACK);
        JButton btn = new JButton("Submit");
        btn.setFont(new Font("Arial", Font.BOLD, 30));
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.WHITE);
        btn.setBorder(BorderFactory.createEmptyBorder());
        frame.getContentPane().add(input);
        frame.getContentPane().add(btn);
        JLabel label = new JLabel();
        frame.getContentPane().add(label);
        btn.addActionListener( e ->{
                String text = input.getText();
                int year = Integer.parseInt(text);
                if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                    input.setText(text + " is a leap year.");
                }else{
                    input.setText(text + " is not a leap year.");
                }
            }
        );
                    // ___UI Setup___
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
