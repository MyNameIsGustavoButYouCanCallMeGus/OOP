import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public void menu() {
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        Printer printer = new Printer();
        Purchase purchase = new Purchase();
        ArrayList<Phones> phones = new ArrayList<>();
        ArrayList<Laptop> laptops = new ArrayList<>();
        ArrayList<Headphones> headphones = new ArrayList<>();
        ArrayList<Watch> watches = new ArrayList<>();
        Gadgets gadgets = new Gadgets(phones, laptops, headphones, watches);
        Store store = new Store();
        store.listOfGadgets(phones, laptops, headphones, watches, gadgets);

        while (run) {
            System.out.println("Online Gadget Shop");
            System.out.println("1. View Phones");
            System.out.println("2. View Laptops");
            System.out.println("3. View Headphones");
            System.out.println("4. View Watches");
            System.out.println("5. Show my balance");
            System.out.println("6. Top up your balance");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    //gadgets.showInformationPhones();
                    printer.printPhones(phones);
                    purchase.buyPhone(phones);
                    sc.nextLine();
                    break;
                case 2:
                    //gadgets.showInformationLaptops();
                    printer.printLaptops(laptops);
                    purchase.buyLaptop(laptops);
                    sc.nextLine();
                    break;
                case 3:
                    //gadgets.showInformationHeadphones();
                    printer.printHeadphones(headphones);
                    purchase.buyHeadphones(headphones);
                    sc.nextLine();
                    break;
                case 4:
                    //gadgets.showInformationWatches();
                    printer.printWatches(watches);
                    purchase.buyWatch(watches);
                    sc.nextLine();
                    break;
                case 5:
                    ShowBalance showBalance = new ShowBalance();
                    showBalance.showBalance(E_Shop.name);
                    break;
                case 6:
                    TopUpBalance topUpBalance = new TopUpBalance();
                    System.out.print("Enter the amount: ");
                    int balance = sc.nextInt();
                    topUpBalance.increaseBalance(E_Shop.name, balance);
                    break;
                case 0:
                    run = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}