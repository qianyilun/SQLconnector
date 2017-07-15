import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by allen on 11/07/17.
 */
public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        String databaseName = "student_information";
        try {
            connection = ConnectionConfiguration.getConnection(databaseName);
            if (connection != null) {
                System.out.println("Connection Established!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
