package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnectionCheck {
    public static void main(String[] args) {

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Vign@123");
            Statement stmt= con.createStatement();
            ResultSet resDb= stmt.executeQuery("select * from database_table where name ='Vignesh Devan' and location = 'Chennai'");
            if(resDb.next()){
                System.out.println("Employee is exist. And employee id "+resDb.getInt("employee_id"));
            }else{
                System.out.println("Employee is not exist. Please provide the proper credentials");
            }
            con.close();

            }catch (Exception e){
            System.out.println(e);

        }

    }
}
