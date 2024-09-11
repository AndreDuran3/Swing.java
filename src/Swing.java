import javax.swing.*;

public class Swing{
    public static void main(String[] args){
        //creating the window titling it Calculator
        JFrame f = new JFrame("Calculator");

        //JLabel Declare
        JLabel input1, input2, operator, result;
        JTextField t1,t2,t3,t4;
        JButton add;
        JButton sub;
        JButton mult;
        JButton div; 
        JButton compute;

        //Creating the window and settings
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);

        //created new JLabels
        input1 = new JLabel("Number1");
        input2 = new JLabel("Number2");
        operator = new JLabel("Operation(+,-,*,/)");
        result = new JLabel("Result");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField(); 
        add = new JButton("+");
        sub = new JButton("-");
        mult = new JButton("*");
        div = new JButton("/");
        compute = new JButton("Compute");

        //JLabel boundaries
        input1.setBounds(40,50,90,30);
        input2.setBounds(40,150,90,30);
        operator.setBounds(10, 100, 100, 30);
        result.setBounds(265,70,90,30);
        t1.setBounds(130,50,90,30);
        t2.setBounds(130,100,90,30);
        t3.setBounds(130,150,90,30);
        t4.setBounds(240, 100, 90, 30);
        add.setBounds(90,200,60,30);
        sub.setBounds(155,200,60,30);
        mult.setBounds(90, 235,60,30);
        div.setBounds(155,235,60,30);
        compute.setBounds(240,200,120,30);

        //adding labels
        f.add(input1);
        f.add(input2);
        f.add(operator);
        f.add(result);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(add);
        f.add(sub);
        f.add(mult);
        f.add(div);
        f.add(compute);
    }
}