import java.util.ArrayList;

public class Printer implements PrinterInterface{
    public void printPhones(ArrayList<Phones> phones) {
        System.out.println("List of phones: ");

        for (int i = 0; i < phones.size(); i++) {
            System.out.println(i + 1 + ". Phone model: " + phones.get(i).getName());
            System.out.println("   Size: " + phones.get(i).getSize());
            System.out.println("   Color: " + phones.get(i).getColor());
            System.out.println("   Price: " + phones.get(i).getPrice());
            System.out.println("   Memory: " + phones.get(i).getMemory());
            System.out.println("   RAM: " + phones.get(i).getRam());
            System.out.println("   OS: " + phones.get(i).getOS());
            System.out.println("   Camera: " + phones.get(i).getCamera_px());
            System.out.println("   Quantity: " + phones.get(i).getQuantity());
        }
    }


    public void printLaptops(ArrayList<Laptop> laptops) {
        System.out.println("List of laptops: ");

        for (int i = 0; i < laptops.size(); i++) {
            System.out.println(i + 1 + ". Model: " + laptops.get(i).getName());
            System.out.println("   Size: " + laptops.get(i).getSize());
            System.out.println("   Color: " + laptops.get(i).getColor());
            System.out.println("   Price: " + laptops.get(i).getPrice());
            System.out.println("   Memory: " + laptops.get(i).getMemory());
            System.out.println("   RAM: " + laptops.get(i).getRam());
            System.out.println("   Videocard: " + laptops.get(i).getVideocard());
            System.out.println("   OS: " + laptops.get(i).getOS());
            System.out.println("   Quantity: " + laptops.get(i).getQuantity());
        }
    }

    public void printHeadphones(ArrayList<Headphones> headphones) {
        System.out.println("List of headphones: ");

        for (int i = 0; i < headphones.size(); i++) {
            System.out.println(i + 1 + ". Model: " + headphones.get(i).getName());
            System.out.println("   Size: " + headphones.get(i).getSize());
            System.out.println("   Color: " + headphones.get(i).getColor());
            System.out.println("   Price: " + headphones.get(i).getPrice());
            System.out.println("   Type of connection: " + headphones.get(i).getTypeOfConnection());
            System.out.println("   Quantity: " + headphones.get(i).getQuantity());
        }
    }

    public void printWatches(ArrayList<Watch> watches) {
        System.out.println("List of watches: ");

        for (int i = 0; i < watches.size(); i++) {
            System.out.println(i + 1 + ". Watch model: " + watches.get(i).getName());
            System.out.println("   Size: " + watches.get(i).getSize());
            System.out.println("   Color: " + watches.get(i).getColor());
            System.out.println("   Price: " + watches.get(i).getPrice());
            System.out.println("   Quantity: " + watches.get(i).getQuantity());
        }
    }
}
