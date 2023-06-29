import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Purchase {
    Scanner sc = new Scanner(System.in);
    Login log = new Login();
    DecreaseBalance decreaseBalance = new DecreaseBalance();
    Connection connection = null;
    public void buyPhone(ArrayList<Phones> phones) {
        System.out.print("Enter the index of the phone you want to buy or 0 if you want to exit: ");
        int indexPhone = sc.nextInt() - 1;
        if (indexPhone < 0) {
            return;
        }

        decreaseBalance.decreaseBalance(E_Shop.name, phones.get(indexPhone).getPrice());

        if (decreaseBalance.isSuccessfull == true) {
            System.out.println("You have purchased " + phones.get(indexPhone).getName() + "!");
            phones.get(indexPhone).quantity();

            try
            {
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/OOP_Project", "postgres", "20040621551467");

                String query = "update users set phone = ? where name = ?";
                PreparedStatement preparedStmt = connection.prepareStatement(query);
                preparedStmt.setString(1, phones.get(indexPhone).getName());
                preparedStmt.setString(2, E_Shop.name);

                preparedStmt.executeUpdate();



                connection.close();
            }
            catch (Exception e)
            {
                System.err.println("Got an exception! ");
                System.err.println(e.getMessage());
            }
        }
        else {
            System.out.println("You do not have enough money!");
        }
    }

    public void buyLaptop(ArrayList<Laptop> laptops) {
        System.out.print("Enter the index of the laptop you want to buy or 0 if you want to exit: ");
        int indexLaptop = sc.nextInt() - 1;
        if (indexLaptop < 0) {
            return;
        }
        decreaseBalance.decreaseBalance(E_Shop.name, laptops.get(indexLaptop).getPrice());

        if (decreaseBalance.isSuccessfull == true) {
            System.out.println("You have purchased " + laptops.get(indexLaptop).getName() + "!");
            laptops.get(indexLaptop).quantity();

            try
            {
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/OOP_Project", "postgres", "20040621551467");

                String query = "update users set laptop = ? where name = ?";
                PreparedStatement preparedStmt = connection.prepareStatement(query);
                preparedStmt.setString(1, laptops.get(indexLaptop).getName());
                preparedStmt.setString(2, E_Shop.name);

                preparedStmt.executeUpdate();



                connection.close();
            }
            catch (Exception e)
            {
                System.err.println("Got an exception! ");
                System.err.println(e.getMessage());
            }
        }
        else {
            System.out.println("You do not have enough money!");
        }
    }

    public void buyHeadphones(ArrayList<Headphones> headphones) {
        System.out.print("Enter the index of the headphones you want to buy or 0 if you want to exit: ");
        int indexHeadphone = sc.nextInt() - 1;
        if (indexHeadphone < 0) {
            return;
        }
        decreaseBalance.decreaseBalance(E_Shop.name, headphones.get(indexHeadphone).getPrice());

        if (decreaseBalance.isSuccessfull == true) {
            System.out.println("You have purchased " + headphones.get(indexHeadphone).getName() + "!");
            headphones.get(indexHeadphone).quantity();

            try
            {
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/OOP_Project", "postgres", "20040621551467");

                String query = "update users set headphones = ? where name = ?";
                PreparedStatement preparedStmt = connection.prepareStatement(query);
                preparedStmt.setString(1, headphones.get(indexHeadphone).getName());
                preparedStmt.setString(2, E_Shop.name);

                preparedStmt.executeUpdate();



                connection.close();
            }
            catch (Exception e)
            {
                System.err.println("Got an exception! ");
                System.err.println(e.getMessage());
            }
        }
        else {
            System.out.println("You do not have enough money!");
        }
    }

    public void buyWatch(ArrayList<Watch> watches) {
        System.out.print("Enter the index of the watches you want to buy or 0 if you want to exit: ");
        int index = sc.nextInt() - 1;
        if (index < 0) {
            return;
        }
        decreaseBalance.decreaseBalance(E_Shop.name, watches.get(index).getPrice());

        if (decreaseBalance.isSuccessfull == true) {
            System.out.println("You have purchased " + watches.get(index).getName() + "!");
            watches.get(index).quantity();

            try
            {
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/OOP_Project", "postgres", "20040621551467");

                String query = "update users set watches = ? where name = ?";
                PreparedStatement preparedStmt = connection.prepareStatement(query);
                preparedStmt.setString(1, watches.get(index).getName());
                preparedStmt.setString(2, E_Shop.name);

                preparedStmt.executeUpdate();



                connection.close();
            }
            catch (Exception e)
            {
                System.err.println("Got an exception! ");
                System.err.println(e.getMessage());
            }
        }
        else {
            System.out.println("You do not have enough money!");
        }
    }
}
