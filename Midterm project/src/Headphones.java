public class Headphones extends Gadgets {
    public Headphones(String name, String size, String color, int price, Integer quantity) {
        super(name, size, color, price, quantity);
    }

    private String typeOfConnection;

    public Headphones(String name, String size, String color, int price, Integer quantity, String typeOfConnection) {
        super(name, size, color, price, quantity);
        this.typeOfConnection = typeOfConnection;
    }

    public String getTypeOfConnection() {
        return typeOfConnection;
    }

    public void setTypeOfConnection(String typeOfConnection) {
        this.typeOfConnection = typeOfConnection;
    }
}
