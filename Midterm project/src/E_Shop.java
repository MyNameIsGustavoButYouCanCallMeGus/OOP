import java.util.ArrayList;
import java.util.Scanner;

public class E_Shop {
    public static String name;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Menu menu = new Menu();
        int choice = -1;
        Login login = new Login();
        UserRegistration reg = new UserRegistration();
        Menu mainMenu = new Menu();

        while (choice != 0) {
            System.out.println("Welcome to online shop!");
            System.out.println("1. Log in");
            System.out.println("2. Register");
            System.out.println("0. Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    login.userLog();
                    name = login.name;

                    if (login.isInvalid == true) {
                        login.isInvalid = false;
                        break;
                    }
                    else
                        mainMenu.menu();
                    break;
                case 2:
                    reg.userReg();
                    break;
            }
        }

    }
}