import javax.swing.*;

public class textfield {
    public static void main(String[] args) {

        JFrame frame = new JFrame("TextField");

        JTextField textfield = new JTextField("hello");

        frame.add(textfield);

        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}