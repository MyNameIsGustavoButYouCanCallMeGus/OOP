import java.util.ArrayList;

class Gadgets implements AddGadgetInterface {
    private String  name;

    private String size;

    private String color;

    private int price;

    private Integer quantity;

    private ArrayList<Phones> phones;
    private ArrayList<Laptop> laptops;
    private ArrayList<Headphones> headphones;
    private ArrayList<Watch> watches;

    public Gadgets(String name, String size, String color, int price, Integer quantity) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }

    public Gadgets(ArrayList<Phones> phones, ArrayList<Laptop> laptops, ArrayList<Headphones> headphones, ArrayList<Watch> watches) {
        this.phones = phones;
        this.laptops = laptops;
        this.headphones = headphones;
        this.watches = watches;
    }

    public void addPhone(Phones phone) {
        phones.add(phone);
    }
    public void addLaptop(Laptop laptop) { laptops.add(laptop); }
    public void addHeadphone(Headphones headphone) { headphones.add(headphone); }
    public void addWatch(Watch watch) { watches.add(watch); }

    public void quantity() {
        setQuantity(quantity - 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
