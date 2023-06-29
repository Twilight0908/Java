import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");

        frame.setSize(300, 200);

        JLabel label = new JLabel("Hello World");
        frame.add(label);

        JButton button = new JButton("Button");
        button.setSize(20,10);
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}