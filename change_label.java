import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class change_label extends JFrame implements ActionListener{

    JButton button;
    JLabel label;

    change_label(){
        label = new JLabel("hello");
        button = new JButton("click");

        add(label);
        add(button);

        button.addActionListener(this);

        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        label.setText("Button clicked");
    }

    public static void main(String[]args){
        new change_label();
    }


}
