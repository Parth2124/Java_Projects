import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class Main extends JFrame implements ActionListener {

    // define button globally outside the login constructor and removing them from
    // inside the contructor
    JButton signin, clear, signup = new JButton();

    JTextField cardtextfield = new JTextField();

    // we are using password field for pin text to hide the pin
    JPasswordField pintextfield = new JPasswordField();

    Main() {
        // -----------IMAGE ICON
        ImageIcon logo = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image logo1 = logo.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon logo2 = new ImageIcon(logo1);

        JLabel label = new JLabel(logo2);
//        label.setIcon(new ImageIcon("logo.jpg"));
        label.setBounds(70, 10, 100, 100);
        add(label);

        // ----------TITLE
        JLabel title = new JLabel("WELCOME TO PARTH'S ATM");
        title.setBounds(290, 15, 400, 90);
        title.setFont(new Font("raleway", Font.BOLD, 25));
        add(title);

        // ----------CARD
        JLabel cardnum = new JLabel("Card No. : ");
        cardnum.setBounds(120, 160, 150, 40);
        cardnum.setFont(new Font("Raleway", Font.BOLD, 25));
        add(cardnum);

        // --------CARD NUMBER TEXT
        cardtextfield = new JTextField();
        cardtextfield.setBounds(260, 170, 190, 25);
        cardtextfield.setFont(new Font("Arial", Font.BOLD, 15));
        add(cardtextfield);

        // ---------PIN
        JLabel pin = new JLabel("PIN : ");
        pin.setBounds(120, 220, 150, 25);
        pin.setFont(new Font("Raleway", Font.BOLD, 25));
        add(pin);

        // ----------PIN NUMBER TEXT
        pintextfield = new JPasswordField();
        pintextfield.setBounds(260, 220, 190, 25);
        add(pintextfield);

        // ----------SIGN IN BUTTON
        signin = new JButton("Sign In");
        signin.setBounds(260, 280, 90, 30);
        signin.setFocusable(false);
        signin.setBackground(Color.black);
        signin.setForeground(Color.WHITE);
        signin.addActionListener(this);
        add(signin);

        // -----------CLEAR BUTTON
        clear = new JButton("Clear");
        clear.setBounds(360, 280, 90, 30);
        clear.setFocusable(false);
        clear.setBackground(Color.black);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        // ------------SIGN UP
        signup = new JButton("Sign Up");
        signup.setBounds(260, 320, 190, 30);
        signup.setFocusable(false);
        signup.setBackground(Color.black);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        // -----------FRAME
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(800, 500);
        setLocation(410, 160);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear) {

            cardtextfield.setText("");
            pintextfield.setText("");

        } else if (ae.getSource() == signin) {
            conn c = new conn();
            String card = cardtextfield.getText();
            String pin =  pintextfield.getText();
            String query = "Select * from loginidpass where card = '"+card+"' and pin = '"+pin+"' ";

            try {
                ResultSet rs =   c.s.executeQuery(query);
                if (rs.next()){
                    dispose();
                    new signin();
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                }
            }catch (Exception e){
                System.out.println(e);
            }

        } else if (ae.getSource() == signup) {
            new signup1();
            dispose();

        }
    }

    public static void main(String[] args) {

        new Main();
    }

}
