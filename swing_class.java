import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{

    JButton button;

    MyFrame(){
        button  = new JButton("clickme");
        add(button);

        button.addActionListener(this);

        setSize(300, 200);
        setLayout(new java.awt.FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        System.out.println("button clicked");
    }

    public static void main(String[]args){
        new MyFrame();
    }

}