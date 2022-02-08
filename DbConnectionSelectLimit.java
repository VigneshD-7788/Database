package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnectionSelectLimit {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Vign@123");
            Statement stmt= con.createStatement();
            ResultSet rsDbCt= stmt.executeQuery("select count(employee_id) as count from database_table");
            rsDbCt.next();
            System.out.println("Total record:" +rsDbCt.getInt("count"));

            ResultSet rsDb=stmt.executeQuery("select *from database_table limit 1,5");

            while(rsDb.next()){
                System.out.println(rsDb.getInt("employee_id")+"  "+rsDb.getString("name")+"  "+rsDb.getString("location"));

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
