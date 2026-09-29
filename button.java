import javax.swing.*;

class button {
    public static void main(String[] args) {

        JFrame frame = new JFrame("button ex");

        JLabel button = new JLabel("click me");

        frame.add(button);

        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}