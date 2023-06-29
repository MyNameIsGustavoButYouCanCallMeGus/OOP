import java.sql.*;
import java.util.Scanner;

public class Login {
    public String name;
    public int balance;
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost:5432/OOP_Project";

    static final String USER = "postgres";
    static final String PASS = "20040621551467";

    boolean isInvalid = false;

    public void userLog() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        name = input.nextLine();
        System.out.print("Enter password: ");
        String password = input.nextLine();

        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM users WHERE name = '" + name + "' AND password = '" + password + "'";
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                System.out.println("Welcome, " + name + "!");
            } else {
                System.out.println("Invalid username or password, please try again...");
                isInvalid = true;
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
