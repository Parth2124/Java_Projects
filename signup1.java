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

import java.awt.Color;
import java.util.Random;

public class signup1 extends JFrame implements ActionListener {

    long random;

    JLabel gender;
    JTextField nametxt, fnametxt, emailtxt, addresstxt, pincodetxt, citytxt, statetxt , gendertxt , maritaltxt;
    JDateChooser dobtxt;
    JButton clear, next;
    JRadioButton  male ;
    JRadioButton female;

    signup1() {
        setTitle("APPLICATION FORM NUMBER 1");

//        Random ran = new Random();
        random = (int) (Math.random() * 1000);

        JLabel formnum = new JLabel("APPLICATION FORM NUMBER: " + random);
        formnum.setBounds(560, 10, 230, 20);
        formnum.setFont(new Font("Aerial", Font.BOLD, 12));
        add(formnum);

        JLabel title = new JLabel("Page 1: Personal Details");
        title.setBounds(250, 15, 400, 90);
        title.setFont(new Font("raleway", Font.BOLD, 21));
        add(title);

        JLabel name = new JLabel("Name: ");
        name.setBounds(150, 70, 400, 90);
        name.setFont(new Font("raleway", Font.BOLD, 16));
        add(name);

        nametxt = new JTextField();
        nametxt.setBounds(300, 100, 300, 25);
        nametxt.setFont(new Font("raleway", Font.BOLD, 15));
        add(nametxt);

        JLabel fname = new JLabel("Father's Name: ");
        fname.setBounds(150, 120, 400, 90);
        fname.setFont(new Font("raleway", Font.BOLD, 16));
        add(fname);

        fnametxt = new JTextField();
        fnametxt.setBounds(300, 155, 300, 25);
        fnametxt.setFont(new Font("raleway", Font.BOLD, 15));
        add(fnametxt);

        JLabel dob = new JLabel("Date Of Birth: ");
        dob.setBounds(150, 170, 400, 90);
        dob.setFont(new Font("raleway", Font.BOLD, 16));
        add(dob);

        dobtxt = new JDateChooser();
        dobtxt.setBounds(300, 205, 300, 25);
        add(dobtxt);

        gender = new JLabel("Gender: ");
        gender.setBounds(150, 220, 400, 90);
        gender.setFont(new Font("raleway", Font.BOLD, 16));
        add(gender);

        gendertxt = new JTextField();
        gendertxt.setBounds(300, 255, 300, 25);
        gendertxt.setFont(new Font("raleway", Font.BOLD, 15));
        add(gendertxt);



//        JRadioButton male = new JRadioButton("Male");
//        male.setBounds(300, 258, 80, 25);
//        male.setBackground(Color.WHITE);
//        male.setFocusable(false);
//        male.addActionListener(this);
//        add(male);
//
//        JRadioButton female = new JRadioButton("FeMale");
//        female.setBounds(420, 258, 80, 25);
//        female.setBackground(Color.WHITE);
//        female.setFocusable(false);
//        male.addActionListener(this);
//        add(female);
//
//        // -------we have made button group to make both the button radio.
//        ButtonGroup genderGroup = new ButtonGroup();
//        genderGroup.add(male);
//        genderGroup.add(female);
//         //--------------------------------------

        JLabel email = new JLabel("Email Address: ");
        email.setBounds(150, 270, 400, 90);
        email.setFont(new Font("raleway", Font.BOLD, 16));
        add(email);

        emailtxt = new JTextField();
        emailtxt.setBounds(300, 305, 300, 25);
        emailtxt.setFont(new Font("raleway", Font.BOLD, 15));
        add(emailtxt);

        JLabel marital = new JLabel("Marital Status: ");
        marital.setBounds(150, 320, 400, 90);
        marital.setFont(new Font("raleway", Font.BOLD, 16));
        add(marital);

        maritaltxt = new JTextField();
        maritaltxt.setBounds(300, 355, 300, 25);
        maritaltxt.setFont(new Font("raleway", Font.BOLD, 15));
        add(maritaltxt);

//        JRadioButton married = new JRadioButton("Married");
//        married.setBounds(300, 353, 80, 25);
//        married.setBackground(Color.WHITE);
//        married.setFocusable(false);
//        add(married);
//
//        JRadioButton unmarried = new JRadioButton("UnMarried");
//        unmarried.setBounds(410, 353, 100, 25);
//        unmarried.setBackground(Color.WHITE);
//        unmarried.setFocusable(false);
//        add(unmarried);
//
//        JRadioButton other = new JRadioButton("Other");
//        other.setBounds(540, 353, 80, 25);
//        other.setBackground(Color.WHITE);
//        other.setFocusable(false);
//        add(other);
//        // -------we have made button group to make both the button radio.
//        ButtonGroup maritalstatus = new ButtonGroup();
//        maritalstatus.add(married);
//        maritalstatus.add(unmarried);
//        maritalstatus.add(other);
//        // --------------------------------------

        JLabel address = new JLabel("Home Addrress: ");
        address.setBounds(150, 370, 400, 90);
        address.setFont(new Font("raleway", Font.BOLD, 16));
        add(address);

        addresstxt = new JTextField();
        addresstxt.setBounds(300, 405, 300, 25);
        addresstxt.setFont(new Font("raleway", Font.BOLD, 15));
        add(addresstxt);

        JLabel city = new JLabel("City: ");
        city.setBounds(150, 420, 400, 90);
        city.setFont(new Font("raleway", Font.BOLD, 16));
        add(city);

        citytxt = new JTextField();
        citytxt.setBounds(300, 455, 300, 25);
        citytxt.setFont(new Font("raleway", Font.BOLD, 15));
        add(citytxt);

        JLabel state = new JLabel("State: ");
        state.setBounds(150, 470, 400, 90);
        state.setFont(new Font("raleway", Font.BOLD, 16));
        add(state);

        statetxt = new JTextField();
        statetxt.setBounds(300, 500, 300, 25);
        statetxt.setFont(new Font("raleway", Font.BOLD, 15));
        add(statetxt);

        JLabel pincode = new JLabel("Pin Code: ");
        pincode.setBounds(150, 520, 400, 90);
        pincode.setFont(new Font("raleway", Font.BOLD, 16));
        add(pincode);

        pincodetxt = new JTextField();
        pincodetxt.setBounds(300, 555, 300, 25);
        pincodetxt.setFont(new Font("raleway", Font.BOLD, 15));
        add(pincodetxt);

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
            nametxt.setText("");
            fnametxt.setText("");
            emailtxt.setText("");
            addresstxt.setText("");
            pincodetxt.setText("");
            citytxt.setText("");
            statetxt.setText("");
            gendertxt.setText("");
            maritaltxt.setText("");
//          dobtxt.setText("");
        }else if(ae.getSource() == next){

            String formnum = " " + random;  // int value ha toh sring m save krne ke liye ye krna padega

            String name = nametxt.getText();

            String fname = fnametxt.getText();

            String dob = ((JTextField)dobtxt.getDateEditor().getUiComponent()).getText();  // IMPORTANT

            String gender = gendertxt.getText();

//            String gender = null;
//            if(male.isSelected()){
//                gender = "male";
//            }else if (female.isSelected()){
//                gender = "FeMale";
//            }

            String email = emailtxt.getText();

            String marital = maritaltxt.getText();

//            String marital = null;
//            if(married.isSelected()){
//                marital = "Married";
//            }else if(unmarried.isSelected()){
//                marital =  "UnMarried";
//            }else if(other.isSelected()){
//                marital = "Other";
//            }

            String address = addresstxt.getText();

            String city = citytxt.getText();

            String state = statetxt.getText();

            String pin = pincodetxt.getText();



            try{
                if(name.equals("")){
                    JOptionPane.showMessageDialog(null,"Name is Required");
                } else{
                    conn c = new conn();
                    String query = " Insert into signupone values('"+formnum+"', '"+name+"' , '"+fname+"' , '"+dob+"' , '"+gender+"' ,'"+email+"'  , '"+marital+"' , '"+address+"' , '"+city+"' , '"+state+"' , '"+pin+"'  )";
                    c.s.executeUpdate(query);

                    new signup2();
                    dispose();

                }
            }catch (Exception e){
                System.out.println(e);
            }


        }

    }



    public static void main(String[] args) {

        new signup1();

    }

}
