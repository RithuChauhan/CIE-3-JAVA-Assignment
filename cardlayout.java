java
import javax.swing.*;
import java.awt.*;

class CardLayoutDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Card Layout");

        CardLayout card = new CardLayout();
        JPanel panel = new JPanel(card);

        JPanel card1 = new JPanel();
        JButton button1 = new JButton("Go to Card 2");
        card1.add(new JLabel("This is Card 1"));
        card1.add(button1);

        JPanel card2 = new JPanel();
        JButton button2 = new JButton("Go to Card 1");
        card2.add(new JLabel("This is Card 2"));
        card2.add(button2);

        panel.add(card1, "one");
        panel.add(card2, "two");

        button1.addActionListener(e -> card.show(panel, "two"));
        button2.addActionListener(e -> card.show(panel, "one"));

        frame.add(panel);

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
