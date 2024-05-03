import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup3 extends JFrame  implements ActionListener {

    JLabel type , card , cnumber , cardtxt, pin, pintxt ,pnumber , services;

    JCheckBox ATM ,emailsms;

    long random;

    JButton submit , mainpg;
    JComboBox typetxt;

    signup3(){
        setTitle("APPLICATION FORM NUMBER 3");

        JLabel formnum = new JLabel("APPLICATION FORM NUMBER: " + random);
        formnum.setBounds(560, 10, 230, 20);
        formnum.setFont(new Font("Aerial", Font.BOLD, 12));
        add(formnum);


        JLabel title = new JLabel("Page 3: Account Details");
        title.setBounds(250, 15, 400, 90);
        title.setFont(new Font("raleway", Font.BOLD, 21));
        add(title);

        type = new JLabel(" Account Type: ");
        type.setBounds(150, 70, 400, 90);
        type.setFont(new Font("raleway", Font.BOLD, 16));
        add(type);

        String accounttypes[] = {"Select Account Type" , "Current Account" , "Saving Account" , "Fixed Deposit Account" , "Reccuring Deposit Account"};
        typetxt = new JComboBox(accounttypes);
        typetxt.setBounds(300, 105, 300, 25);
        typetxt.setFont(new Font("raleway", Font.BOLD, 15));
        add(typetxt);

        card = new JLabel("Card Number: ");
        card.setBounds(150, 120, 400, 90);
        card.setFont(new Font("raleway", Font.BOLD, 20));
        add(card);

        cardtxt = new JLabel(" (Your 16 Digit Number) ");
        cardtxt.setBounds(145, 167, 400, 30);
        cardtxt.setFont(new Font("raleway", Font.BOLD, 12));
        add(cardtxt);

        cnumber = new JLabel("XXXX-XXXX-XXXX-2124 ");
        cnumber.setBounds(310, 123, 400, 90);
        cnumber.setFont(new Font("raleway", Font.BOLD, 20));
        add(cnumber);

        pin = new JLabel("PIN : ");
        pin.setBounds(150, 170, 400, 90);
        pin.setFont(new Font("raleway", Font.BOLD, 20));
        add(pin);

        pintxt = new JLabel(" (Your 4 Digit PIN) ");
        pintxt.setBounds(145, 215, 400, 30);
        pintxt.setFont(new Font("raleway", Font.BOLD, 12));
        add(pintxt);

        pnumber = new JLabel("XXXX ");
        pnumber.setBounds(310, 170, 400, 90);
        pnumber.setFont(new Font("raleway", Font.BOLD, 20));
        add(pnumber);


        services = new JLabel("Services Required: ");
        services.setBounds(150, 220, 400, 90);
        services.setFont(new Font("raleway", Font.BOLD, 20));
        add(services);

        ATM = new JCheckBox("ATM");
        ATM.setBounds(150, 300, 90, 30);
        ATM.setFont(new Font("raleway", Font.BOLD, 11));
        add(ATM);

        emailsms = new JCheckBox("Email & SMS ");
        emailsms.setBounds(150, 340, 110, 30);
        emailsms.setFont(new Font("raleway", Font.BOLD, 11));
        add(emailsms);

        submit = new JButton("Submit");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway", Font.BOLD, 15));
        submit.setBounds(303, 605, 100, 30);
        submit.addActionListener(this); // IMPORTANT
        add(submit);

        mainpg = new JButton("Sign-in Page");
        mainpg.setBackground(Color.black);
        mainpg.setForeground(Color.white);
        mainpg.setFont(new Font("Raleway", Font.BOLD, 15));
        mainpg.setBounds(450, 605, 100, 30);
        mainpg.addActionListener(this); // IMPORTANT
        add(mainpg);





        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(800, 700);
        setLocation(410, 50);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {


            String formnum = "" + random;
            String type = (String) typetxt.getSelectedItem();

            Random random = new Random();
            String card = "" + (long) (Math.random() * 10000000000000000L);


            Random Prandom = new Random();
            String pin = "" + (long) (Math.random() * 10000L);


            String services = null;
            if (ATM.isSelected()) {
                services = "ATM";
            } else if (emailsms.isSelected()) {
                services = "Email & SMS";
            } else {
                services = "Null";
            }


            try {
                if (type.equals("Select Account Type")) {
                    JOptionPane.showMessageDialog(null, "select Account Type");
                } else {


                    conn c = new conn();
                    String query = " Insert into signupthree values( '" + formnum + "','" + type + "', '" + card + "' , '" + pin + "'  , '" + services + "'  )";
                    String query1 = "Insert into loginidpass values('" + formnum + "' , '" + card + "' , '" + pin + "' )";
                    c.s.executeUpdate(query);
                    c.s.executeUpdate(query1);

                    JOptionPane.showMessageDialog(null, "Card Number :  " + card + " \n PIN :  " + pin);
                }

            } catch (Exception ae) {
                System.out.println(ae);
            }
        }else if (e.getSource() == mainpg){
            new Main();
            dispose();
        }
    }
    public static  void main(String[] args){

        new signup3();
    }
}
