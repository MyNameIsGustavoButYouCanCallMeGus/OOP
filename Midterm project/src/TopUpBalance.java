import java.sql.*;

public class TopUpBalance {
    public static void increaseBalance(String name, int amount) {
        Connection connection = null;

        try
        {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/OOP_Project", "postgres", "20040621551467");

            Statement statement = connection.createStatement();

            String sql = "UPDATE users SET balance = balance + " + amount +
                    " WHERE name = '" + name + "'";
            statement = connection.createStatement();
            statement.executeUpdate(sql);

            connection.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}
