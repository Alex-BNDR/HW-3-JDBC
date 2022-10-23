import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class UserSelect {
    public void select(String q) {
        try (var connection = DriverManager.getConnection(Constants.URL, Constants.USER_NAME, Constants.PASSWORD); Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(q);
            var users = new ArrayList<>();

            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setFirst_name(resultSet.getString("first_name"));
                user.setLast_name(resultSet.getString("last_name"));
                user.setAge(resultSet.getInt(4));

                users.add(user);

            }
            users.forEach(System.out::println);
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public UserSelect() {
    }
}
