package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnectionSelect {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Vign@123");
            Statement stmt=con.createStatement();
            ResultSet resDb= stmt.executeQuery("select *from database_table");
            //below loop will execute until last data
            while(resDb.next()){
                System.out.println(resDb.getInt(1)+"  "+ resDb.getString(2)+"  "+resDb.getString(3)+"  "+ resDb.getString(4));
            }
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
