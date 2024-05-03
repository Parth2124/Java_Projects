import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UP extends JFrame implements ActionListener {

    JButton back;
     UP(){

         JLabel underprocess = new JLabel("Sorry , Page Under Maintenance");
         underprocess.setBounds(260 , 200 , 400 , 300);
         underprocess.setFont(new Font("raleway" , Font.BOLD , 17));
         add(underprocess);

         back = new JButton("Back");
         back.setBounds(620 , 580 , 100 , 40 );
         back.setBackground(Color.black);
         back.setForeground(Color.white);
         back.addActionListener(this);
         back.setFocusable(false);
         add(back);

         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLayout(null);
         setSize(800, 700);
         setLocation(410, 50);
         getContentPane().setBackground(Color.WHITE);
         setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back){
            new signin();
            dispose();
        }
    }

    public static void main(String[] args){
        new UP();
    }


}
