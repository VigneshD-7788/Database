package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnectionSelectJoin {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Vign@123");
            Statement stmt= con.createStatement();

            ResultSet resDb = stmt.executeQuery("select *from people as p join city as c on c.id=p.city_id");
            //below loop will execute till the last data
            while(resDb.next()){
                System.out.println(resDb.getInt("id")+"  "+resDb.getString("email")+"  "+resDb.getString("city"));

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
