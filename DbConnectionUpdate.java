package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbConnectionUpdate {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Vign@123");
            Statement stmt= con.createStatement();
            stmt.execute("update database_table set name ='Madhav' where employee_id= 10899");
            con.close();
            System.out.println("Request Updated Successfully");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
