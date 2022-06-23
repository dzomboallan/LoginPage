package LoginPage;

import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame{
    private JTextField userTextField;
    private JPanel panel1;
    private JPasswordField PasswordField;
    private JButton loginButton;
    private JFrame frame;

    public LoginPage(){

        frame= new JFrame ("Login frame");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(250 ,200));
        frame.setResizable(false);

        frame.add(panel1);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.green);
    }
}
