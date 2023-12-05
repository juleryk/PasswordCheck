import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public Main() {

        JFrame frame = new JFrame("Hasło checker");
        JPanel ePanel = new JPanel();
        frame.add(ePanel);
        frame.setSize(400, 300);
        JLabel label = new JLabel("Hasło");
        JTextField textField = new JTextField(20);
        JLabel label2 = new JLabel("Email");
        JTextField textField2 = new JTextField(20);
        Button button = new Button("Zaakceptuj");
        button.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                String text2 = textField2.getText();
                if (text.length() >= 8) {
                    System.out.println("Haslo jest poprawne");
                } else {
                    System.out.println("Popraw haslo");
                }

                if (text2.contains("@") && text2.contains(".")) {
                    System.out.println("Email poprawny");
                } else {
                    System.out.println("Email niepoprawny");
                }

            }


        });
        ePanel.add(label);
        ePanel.add(textField);
        ePanel.add(new JLabel(" "));
        ePanel.add(label2);
        ePanel.add(textField2);
        ePanel.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new Main();
    }
}
