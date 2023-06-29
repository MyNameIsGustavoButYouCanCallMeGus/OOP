import java.sql.*;

public class DecreaseBalance {
    public static boolean isSuccessfull = false;
    public static void decreaseBalance(String name, int amount) {
        Connection connection = null;

        try
        {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/OOP_Project", "postgres", "20040621551467");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT balance FROM users WHERE name = '" + name + "'");
            if (resultSet.next()) {
                int balance = resultSet.getInt("balance");
                if (balance - amount >= 0) {
                    isSuccessfull = true;
                    String query = "UPDATE users SET balance = balance - " + amount +
                            " WHERE name = ?";
                    PreparedStatement preparedStmt = connection.prepareStatement(query);
                    preparedStmt.setString(1, name);
                    preparedStmt.executeUpdate();
                }
            }

            connection.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}
