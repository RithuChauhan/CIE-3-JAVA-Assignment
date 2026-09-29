package OnlineExam;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class OnlineExam extends JFrame implements ActionListener {

        ArrayList<Question> questions = new ArrayList<>();

        JLabel questionLabel;
        JLabel timerLabel;

        JRadioButton option1;
        JRadioButton option2;
        JRadioButton option3;
        JRadioButton option4;

        ButtonGroup group;

        JButton previousButton;
        JButton nextButton;
        JButton submitButton;

        Timer timer;

        int currentQuestion = 0;
        int timeLeft = 60;

        int[] answers = new int[10];

        public OnlineExam() {

                // Add 10 questions
                questions.add(new Question(
                                "Which language is used for Java programming?",
                                "Python", "Java", "C++", "HTML", 2));

                questions.add(new Question(
                                "Which keyword is used to create a class?",
                                "def", "Class", "new", "object", 2));

                questions.add(new Question(
                                "Which method is the starting point of Java?",
                                "start()", "run()", "main()", "begin()", 3));

                questions.add(new Question(
                                "Which collection stores elements dynamically?",
                                "Array", "ArrayList", "String", "int", 2));

                questions.add(new Question(
                                "Which component allows selecting one option?",
                                "JTextField", "JLabel", "JRadioButton", "JTextArea", 3));

                questions.add(new Question(
                                "Which class is used for a group of radio buttons?",
                                "ButtonGroup", "ButtonSet", "RadioGroup", "GroupButton", 1));

                questions.add(new Question(
                                "Which keyword is used for inheritance?",
                                "this", "super", "extends", "inherit", 3));

                questions.add(new Question(
                                "Which package contains Swing components?",
                                "java.io", "javax.swing", "java.util", "java.lang", 2));

                questions.add(new Question(
                                "Which keyword is used to create an object?",
                                "create", "object", "new", "make", 3));

                questions.add(new Question(
                                "Which class is used to display a message box?",
                                "JOptionPane", "JMessage", "MessageBox", "JDialogBox", 1));

                for (int i = 0; i < 10; i++) {
                        answers[i] = 0;
                }

                setTitle("Online Examination System");
                setSize(600, 400);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLayout(new BorderLayout());

                // Top panel
                JPanel topPanel = new JPanel(new BorderLayout());

                JLabel titleLabel = new JLabel(
                                "ONLINE EXAMINATION SYSTEM",
                                SwingConstants.CENTER);

                titleLabel.setFont(new Font("Arial", Font.BOLD, 20));

                timerLabel = new JLabel("Time: 60", SwingConstants.RIGHT);

                topPanel.add(titleLabel, BorderLayout.CENTER);
                topPanel.add(timerLabel, BorderLayout.EAST);

                add(topPanel, BorderLayout.NORTH);

                // Center panel
                JPanel centerPanel = new JPanel();
                centerPanel.setLayout(new GridLayout(5, 1));

                questionLabel = new JLabel();

                option1 = new JRadioButton();
                option2 = new JRadioButton();
                option3 = new JRadioButton();
                option4 = new JRadioButton();

                group = new ButtonGroup();

                group.add(option1);
                group.add(option2);
                group.add(option3);
                group.add(option4);

                centerPanel.add(questionLabel);
                centerPanel.add(option1);
                centerPanel.add(option2);
                centerPanel.add(option3);
                centerPanel.add(option4);

                add(centerPanel, BorderLayout.CENTER);

                // Bottom buttons
                JPanel bottomPanel = new JPanel();

                previousButton = new JButton("Previous");
                nextButton = new JButton("Next");
                submitButton = new JButton("Submit");

                previousButton.addActionListener(this);
                nextButton.addActionListener(this);
                submitButton.addActionListener(this);

                bottomPanel.add(previousButton);
                bottomPanel.add(nextButton);
                bottomPanel.add(submitButton);

                add(bottomPanel, BorderLayout.SOUTH);

                displayQuestion();

                // 60-second timer
                timer = new Timer(1000, new ActionListener() {

                        public void actionPerformed(ActionEvent e) {

                                timeLeft--;

                                timerLabel.setText("Time: " + timeLeft);

                                if (timeLeft == 0) {
                                        timer.stop();

                                        JOptionPane.showMessageDialog(
                                                        OnlineExam.this,
                                                        "Time is over! Exam will be submitted.");

                                        submitExam();
                                }
                        }
                });

                timer.start();

                setVisible(true);
        }

        public void displayQuestion() {

                Question q = questions.get(currentQuestion);

                questionLabel.setText(
                                (currentQuestion + 1) + ". " + q.getQuestion());

                option1.setText(q.getOption1());
                option2.setText(q.getOption2());
                option3.setText(q.getOption3());
                option4.setText(q.getOption4());

                group.clearSelection();

                if (answers[currentQuestion] == 1) {
                        option1.setSelected(true);
                } else if (answers[currentQuestion] == 2) {
                        option2.setSelected(true);
                } else if (answers[currentQuestion] == 3) {
                        option3.setSelected(true);
                } else if (answers[currentQuestion] == 4) {
                        option4.setSelected(true);
                }
        }

        public void saveAnswer() {

                if (option1.isSelected()) {
                        answers[currentQuestion] = 1;
                } else if (option2.isSelected()) {
                        answers[currentQuestion] = 2;
                } else if (option3.isSelected()) {
                        answers[currentQuestion] = 3;
                } else if (option4.isSelected()) {
                        answers[currentQuestion] = 4;
                }
        }

        public void actionPerformed(ActionEvent e) {

                if (e.getSource() == nextButton) {

                        saveAnswer();

                        if (currentQuestion < questions.size() - 1) {
                                currentQuestion++;
                                displayQuestion();
                        }

                } else if (e.getSource() == previousButton) {

                        saveAnswer();

                        if (currentQuestion > 0) {
                                currentQuestion--;
                                displayQuestion();
                        }

                } else if (e.getSource() == submitButton) {

                        saveAnswer();
                        submitExam();
                }
        }

        public void submitExam() {

                timer.stop();

                int correct = 0;
                int wrong = 0;

                for (int i = 0; i < questions.size(); i++) {

                        if (answers[i] == 0) {
                                continue;
                        }

                        if (answers[i] == questions.get(i).getCorrectAnswer()) {
                                correct++;
                        } else {
                                wrong++;
                        }
                }

                int total = questions.size();

                double percentage = (correct * 100.0) / total;

                String result;

                if (percentage >= 40) {
                        result = "PASS";
                } else {
                        result = "FAIL";
                }

                String message = "EXAM RESULT\n\n" +
                                "Total Questions: " + total + "\n" +
                                "Correct Answers: " + correct + "\n" +
                                "Wrong Answers: " + wrong + "\n" +
                                "Percentage: " + percentage + "%\n" +
                                "Result: " + result;

                JOptionPane.showMessageDialog(
                                this,
                                message,
                                "Final Result",
                                JOptionPane.INFORMATION_MESSAGE);

                System.exit(0);
        }

        public static void main(String[] args) {

                new OnlineExam();
        }
}