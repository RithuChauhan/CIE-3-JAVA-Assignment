import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class multiple_buttons extends JFrame implements ActionListener{

    JButton red, blue, green ;
    JLabel label;

    multiple_buttons(){
        red = new JButton("red");
        blue = new JButton("blue");
        green = new JButton("green");

        label = new JLabel("select a color");

        add(red);
        add(blue);
        add(green);
        add(label);

        red.addActionListener(this);
        blue.addActionListener(this);
        green.addActionListener(this);

        setLayout(new FlowLayout());
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == red){
            label.setText("red selected");
        }

        if(e.getSource() == blue){
            label.setText("blue selected");
        }

        if(e.getSource() == green){
            label.setText("green selected");
        }
    }

    public static void main(String[]args){
        new multiple_buttons();
    }

}