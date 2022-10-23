import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserCount {
    public void count(String q) {
        try (var connection = DriverManager.getConnection(Constants.URL, Constants.USER_NAME, Constants.PASSWORD); Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(q);
            resultSet.next();
            int count = resultSet.getInt("count");
            System.out.println(count);

        } catch (
                SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public UserCount() {
    }
}