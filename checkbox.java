import javax.swing.*;

public class checkbox{
    public static void main(String[] args) {

        JFrame frame = new JFrame("checkbox");

        JCheckBox java = new JCheckBox("java");

        JCheckBox python = new JCheckBox("python");

        JCheckBox C = new JCheckBox("C");

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(java);
        frame.add(C);
        frame.add(python);
        frame.setSize(400,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}