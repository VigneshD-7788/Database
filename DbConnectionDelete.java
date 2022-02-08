package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbConnectionDelete {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Vign@123");
            Statement stmt= con.createStatement();
            stmt.execute("delete from database_table where employee_id =10583");
            con.close();
            System.out.println("Request deleted successfully");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
