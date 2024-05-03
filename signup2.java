import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

import com.toedter.calendar.JDateChooser;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;

// import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

import java.awt.Color;
import java.util.Random;

public class signup2 extends JFrame implements ActionListener {

    long random;


    JTextField mobtxt, occupationtxt, incometxt, adhartxt, pantxt, existingtxt , citizentxt;
    JButton clear, next;
//    JRadioButton yes;
//    JRadioButton no;

    JComboBox religiontxt , categorytxt , qualificationtxt;

    JLabel religion , category  , mob , qualification , occupation , income , adhar , pan , SeniorCitizen , existingaccount;

    signup2() {
        setTitle("APPLICATION FORM NUMBER 2");



        JLabel formnum = new JLabel("APPLICATION FORM NUMBER: " + random);
        formnum.setBounds(560, 10, 230, 20);
        formnum.setFont(new Font("Aerial", Font.BOLD, 12));
        add(formnum);

        JLabel title = new JLabel("Page 2: Additional Details");
        title.setBounds(250, 15, 400, 90);
        title.setFont(new Font("raleway", Font.BOLD, 21));
        add(title);

        religion = new JLabel(" Religion: ");
        religion.setBounds(150, 70, 400, 90);
        religion.setFont(new Font("raleway", Font.BOLD, 16));
        add(religion);

        String religionVal[] = { "Select Religion " ,"Hindu" , "Muslim" , "Christian" , "Other"};
        religiontxt = new JComboBox(religionVal);
        religiontxt.setBounds(300, 105, 300, 25);
        religiontxt.setFont(new Font("raleway", Font.BOLD, 15));
        add(religiontxt);


        category = new JLabel("Category: ");
        category.setBounds(150, 120, 400, 90);
        category.setFont(new Font("raleway", Font.BOLD, 16));
        add(category);

        String categoryVal[] = { "Select Category ", "Upper Caste" , "General" , "SC/ST" , "OBC"};
        categorytxt = new JComboBox(categoryVal);
        categorytxt.setBounds(300, 155, 300, 25);
        categorytxt.setFont(new Font("raleway", Font.BOLD, 15));
        add(categorytxt);


        mob = new JLabel("Mobile No.: ");
        mob.setBounds(150, 170, 400, 90);
        mob.setFont(new Font("raleway", Font.BOLD, 16));
        add(mob);

        mobtxt = new JTextField();
        mobtxt.setBounds(300, 205, 300, 25);
        mobtxt.setFont(new Font("raleway", Font.BOLD, 15));
        add(mobtxt);


        qualification = new JLabel("Qualification: ");
        qualification.setBounds(150, 220, 400, 90);
        qualification.setFont(new Font("raleway", Font.BOLD, 16));
        add(qualification);

        String qualificationVal[] = { "Select Qualification ", "10th" , "12th" , "Under-Graduate" , "Graduate" , "Post-Graduate"};
        qualificationtxt = new JComboBox(qualificationVal);
        qualificationtxt.setBounds(300, 255, 300, 25);
        qualificationtxt.setFont(new Font("raleway", Font.BOLD, 15));
        add(qualificationtxt);





        occupation = new JLabel("Occupation: ");
        occupation.setBounds(150, 270, 400, 90);
        occupation.setFont(new Font("raleway", Font.BOLD, 16));
        add(occupation);

        occupationtxt  = new JTextField();
        occupationtxt.setBounds(300, 305, 300, 25);
        occupationtxt.setFont(new Font("raleway", Font.BOLD, 15));
        add(occupationtxt);

        income = new JLabel("Income: ");
        income.setBounds(150, 320, 400, 90);
        income.setFont(new Font("raleway", Font.BOLD, 16));
        add(income);

        incometxt = new JTextField();
        incometxt.setBounds(300, 355, 300, 25);
        incometxt.setFont(new Font("raleway", Font.BOLD, 15));
        add(incometxt);



        adhar = new JLabel("Adhar-card No.: ");
        adhar.setBounds(150, 370, 400, 90);
        adhar.setFont(new Font("raleway", Font.BOLD, 16));
        add(adhar);

        adhartxt = new JTextField();
        adhartxt.setBounds(300, 405, 300, 25);
        adhartxt.setFont(new Font("raleway", Font.BOLD, 15));
        add(adhartxt);

        pan = new JLabel("PAN No. : ");
        pan.setBounds(150, 420, 400, 90);
        pan.setFont(new Font("raleway", Font.BOLD, 16));
        add(pan);

        pantxt = new JTextField();
        pantxt.setBounds(300, 455, 300, 25);
        pantxt.setFont(new Font("raleway", Font.BOLD, 15));
        add(pantxt);

        SeniorCitizen = new JLabel("Senior Citizen: ");
        SeniorCitizen.setBounds(150, 470, 400, 90);
        SeniorCitizen.setFont(new Font("raleway", Font.BOLD, 16));
        add(SeniorCitizen);

        citizentxt = new JTextField();
        citizentxt.setBounds(300 , 500 , 300 , 25);
        citizentxt.setFont(new Font("raleway", Font.BOLD, 16));
        add(citizentxt);


//
//        JRadioButton yes = new JRadioButton("Yes");
//        yes.setBounds(320 , 503 , 60 , 25);
//        yes.setFont(new Font("raleway", Font.BOLD, 16));
//        yes.setBackground(Color.white);
//        yes.setFocusable(false);
//        add(yes);
//
//        JRadioButton no = new JRadioButton("No");
//        no.setBounds(440 , 503 , 60 , 25);
//        no.setFont(new Font("raleway", Font.BOLD, 16));
//        no.setBackground(Color.white);
//        no.setFocusable(false);
//        add(no);
//
//        ButtonGroup SeniorCitizen = new ButtonGroup();
//        SeniorCitizen.add(yes);
//        SeniorCitizen.add(no);


        existingaccount = new JLabel("Existing Account: ");
        existingaccount.setBounds(150, 520, 400, 90);
        existingaccount.setFont(new Font("raleway", Font.BOLD, 16));
        add(existingaccount);

        existingtxt = new JTextField();
        existingtxt.setBounds(300, 555, 300, 25);
        existingtxt.setFont(new Font("raleway", Font.BOLD, 15));
        add(existingtxt);

        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD, 15));
        next.setBounds(303, 605, 100, 30);
        next.addActionListener(this); // IMPORTANT
        add(next);

        clear = new JButton("Clear");
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.setFont(new Font("Raleway", Font.BOLD, 15));
        clear.setBounds(490, 605, 100, 30);
        clear.addActionListener(this); // IMPORTANT
        add(clear);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(800, 700);
        setLocation(410, 50);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear) {
            mobtxt.setText("");
            occupationtxt.setText("");
            incometxt.setText("");
            adhartxt.setText("");
            existingtxt.setText("");
            pantxt.setText("");

//          dobtxt.setText("");
        } else if (ae.getSource() == next) {

            String formnum = " " + random;  // int value ha toh sring m save krne ke liye ye krna padega

            String religion = (String) religiontxt.getSelectedItem();

            String category = (String) categorytxt.getSelectedItem();

            String mob = mobtxt.getText();

            String qualification = (String) qualificationtxt.getSelectedItem();


            String occupation = occupationtxt.getText();

            String income = incometxt.getText();

            String adhar = adhartxt.getText();

            String pan = pantxt.getText();

            String SeniorCitizen = citizentxt.getText();

//            String SeniorCitizen = null;
//            if(yes.isSelected()){
//                SeniorCitizen = "Yes";
//
//            }else if(no.isSelected()){
//                SeniorCitizen = "No";
//            }


            String existingaccount = existingtxt.getText();



            try {
                if (mob.equals("")) {
                    JOptionPane.showMessageDialog(null, "Mobile Number is Required");
                } else {
                    conn c = new conn();
                    String query = " Insert into signuptwo values('" + formnum + "', '" + religion + "' , '" + category + "'  , '" + mob + "' ,'" + qualification + "'   , '" + occupation + "' , '" + income + "'  , '" + adhar + "'  , '"+ pan +"',  '"+SeniorCitizen+"' , '"+ existingaccount+"' )";
                    c.s.executeUpdate(query);

                    new signup3();
                    dispose();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    public static void main(String[] args) {

        new signup2();
    }
}
