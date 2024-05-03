
import java.sql.*;
public class conn {
    Connection c;
    Statement s;
    public conn(){

        try{
            c = DriverManager.getConnection("jdbc:mysql:///BankATM" , "root" , "parth@0002");
            s = c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
