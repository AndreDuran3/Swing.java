import javax.swing.*;

public class Swing{
    public static void main(String[] args){
        //creating the window titling it Calculator
        JFrame f = new JFrame("Calculator");
        JTextField t1,t2;
        //JLabel Declare
        JLabel input1, input2, operator;

        //Creating the window and settings
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);

        //created new JLabels
        input1 = new JLabel("Number1");
        input2 = new JLabel("Number2");
        operator = new JLabel("Operation(+,-,*,/)");
        input1.setBounds(40,50,90,30);
        input2.setBounds(40,150,90,30);
        operator.setBounds(10, 100, 100, 30);
        
        //adding labels
        f.add(input1);
        f.add(input2);
        f.add(operator);
    }
}