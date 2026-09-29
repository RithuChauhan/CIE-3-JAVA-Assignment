import javax.swing.*;

public class textarea {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Textarea");

        JTextArea area = new JTextArea(5,20);

        frame.add(area);

        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}