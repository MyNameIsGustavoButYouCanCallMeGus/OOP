public class Phones extends Gadgets {
    public Phones(String name, String size, String color, int price, Integer quantity) {
        super(name, size, color, price, quantity);
    }

    private String memory;

    private String ram;

    private String OS;

    private String Camera_px;

    public Phones(String name, String size, String color, int price, Integer quantity, String memory, String ram, String OS, String camera_px) {
        super(name, size, color, price, quantity);
        this.memory = memory;
        this.ram = ram;
        this.OS = OS;
        Camera_px = camera_px;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getCamera_px() {
        return Camera_px;
    }

    public void setCamera_px(String camera_px) {
        Camera_px = camera_px;
    }
}
