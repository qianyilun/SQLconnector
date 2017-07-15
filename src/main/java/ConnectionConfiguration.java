import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by allen on 11/07/17.
 */
public class ConnectionConfiguration {
    public static Connection getConnection(String databaseName) {
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/" + databaseName + "?autoReconnect=true&useSSL=false";
            connection = DriverManager.getConnection(url, "root", "   ");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
