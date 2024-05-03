import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signin extends JFrame implements ActionListener {

    JButton deposit , fastcash , pinchange , cashout , ministatement , balenquiry , exit;

    signin(){

        setTitle("ATM");

        ImageIcon bg = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image bg1 = bg.getImage().getScaledInstance(800 , 700 , Image.SCALE_DEFAULT);
        ImageIcon bg2 = new ImageIcon(bg1);

        JLabel title = new JLabel("Please select your Transaction");
        title.setBounds(200, 230 , 200 , 25);
        title.setFont(new Font("raleway" , Font.BOLD, 13));
        title.setForeground(Color.white);
        add(title);

        deposit = new JButton("Deposit");
        deposit.setBounds(150 , 310 , 100 , 20 );
        deposit.addActionListener(this);
        add(deposit);

        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(150 , 340 , 100 , 20 );
        fastcash.addActionListener(this);
        add(fastcash);

        pinchange = new JButton("Pin Change");
        pinchange.setBounds(150 , 370 , 100 , 20 );
        pinchange.addActionListener(this);
        add(pinchange);

        cashout = new JButton("Cash Withdrawl");
        cashout.setBounds(310 , 310 , 140 , 20 );
        cashout.addActionListener(this);
        add(cashout);

        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(310 , 340 , 140 , 20 );
        ministatement.addActionListener(this);
        add(ministatement);

        balenquiry = new JButton("Balance Enquiry");
        balenquiry.setBounds(310 , 370 , 140 , 20 );
        balenquiry.addActionListener(this);
        add(balenquiry);

        exit = new JButton("Exit");
        exit.setBounds(310 , 400 , 140 , 20 );
        exit.addActionListener(this);
        add(exit);



        JLabel bgimage = new JLabel(bg2);
        bgimage.setBounds(0 ,0 , 800 , 700);
        add(bgimage);




        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(800, 700);
        setLocation(410, 50);
        getContentPane().setBackground(Color.WHITE);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == exit){
            System.exit(0);
        } else if (ae.getSource()== deposit) {
            new UP();
            dispose();
        }else if (ae.getSource() == fastcash){
            JOptionPane.showMessageDialog(null , "Sorry, This page is under Maintenance");
        }else if (ae.getSource() == pinchange) {
            JOptionPane.showMessageDialog(null, "Sorry, This page is under Maintenance");
        }else if (ae.getSource() == cashout) {
            JOptionPane.showMessageDialog(null, "Sorry, This page is under Maintenance");
        }else if (ae.getSource() == ministatement) {
            JOptionPane.showMessageDialog(null, "Sorry, This page is under Maintenance");
        }else if (ae.getSource() == balenquiry) {
            JOptionPane.showMessageDialog(null, "Sorry, This page is under Maintenance");
        }

        }





    public static void main(String[] args){
        new signin();
    }



}
