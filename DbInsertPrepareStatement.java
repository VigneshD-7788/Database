package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DbInsertPrepareStatement {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Vign@123");
            PreparedStatement pstmt= con.prepareStatement("insert into database_table(employee_id,name,email,location)values(?,?,?,?)");

            pstmt.setInt(1,10985);
            pstmt.setString(2,"Jack");
            pstmt.setString(3,"bjki88@gmail.com");
            pstmt.setString(4,"America");

            pstmt.execute();
            con.close();

            System.out.println("Inserted Successfully");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
