import javax.swing.*;

class Form {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Registration");

        JLabel nameLabel = new JLabel("Name");
        JTextField nameField = new JTextField(25);

        JLabel passwordLabel = new JLabel("Password");
        JPasswordField passwordField = new JPasswordField(25);

        JLabel emailLabel = new JLabel("Email");
        JTextField emailField = new JTextField(15);

        JLabel genderLabel = new JLabel("Gender");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        JLabel courseLabel = new JLabel("Course");
        String[] courses = {"Java", "Python", "C", "C++"};
        JComboBox<String> courseBox = new JComboBox<>(courses);

        JButton submitButton = new JButton("Submit");

        frame.setLayout(new java.awt.FlowLayout());

        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(passwordLabel);
        frame.add(passwordField);

        frame.add(emailLabel);
        frame.add(emailField);

        frame.add(genderLabel);
        frame.add(male);
        frame.add(female);

        frame.add(courseLabel);
        frame.add(courseBox);

        frame.add(submitButton);

        submitButton.addActionListener(e -> {
    frame.dispose();
});
        frame.setSize(450, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}