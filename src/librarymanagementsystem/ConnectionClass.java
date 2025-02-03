package librarymanagementsystem;   
import java.sql.*;    
public class ConnectionClass {
    Connection connect;
    Statement stmt;
    
    public ConnectionClass() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","5284912015");
            stmt=connect.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new ConnectionClass();
    }
}


