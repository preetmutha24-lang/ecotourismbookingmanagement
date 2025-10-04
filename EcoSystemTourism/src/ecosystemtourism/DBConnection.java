package ecosystemtourism;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() throws Exception {
       String url = "jdbc:mysql://localhost:3306/EcoTourism";
       String user = "root";
       String password = "Heena@123";  // Replace with your MySQL password
       Class.forName("com.mysql.cj.jdbc.Driver");
       return DriverManager.getConnection(url, user, password);
    }
}
