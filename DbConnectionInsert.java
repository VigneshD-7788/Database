package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbConnectionInsert {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//mysql driver from the external jar files
            Connection con= DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/employee","root","Vign@123");
            Statement stmt= con.createStatement();//create obj for execute the sql queries
            stmt.execute("insert into database_table(employee_id,name,email,location)values('10583','Vignesh Devan','boost4567@gmail.com','Chennai')");
            con.close();
            System.out.println("Insert Completed");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

