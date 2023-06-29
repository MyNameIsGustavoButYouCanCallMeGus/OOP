import java.sql.*;

public class ShowBalance {
    public void showBalance(String name) {
        Connection connection = null;
        ResultSet rs = null;

        try
        {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/OOP_Project", "postgres", "20040621551467");

            Statement statement = connection.createStatement();
            String sql = "SELECT balance FROM users WHERE name = '" + name + "'";
            statement = connection.createStatement();
            rs = statement.executeQuery(sql);

            // Print the balance value
            if (rs.next()) {
                int balance = rs.getInt("balance");
                System.out.println("Balance: " + balance);
            } else {
                System.out.println("No balance found.");
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
