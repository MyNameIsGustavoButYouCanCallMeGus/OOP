public class Laptop extends Gadgets {

    private String memory;

    private String ram;

    private String videocard;

    private String OS;

    public Laptop(String name, String size, String color, int price, Integer quantity, String memory, String ram, String videocard, String OS) {
        super(name, size, color, price, quantity);
        this.memory = memory;
        this.ram = ram;
        this.videocard = videocard;
        this.OS = OS;
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

    public String getVideocard() {
        return videocard;
    }

    public void setVideocard(String videocard) {
        this.videocard = videocard;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }
}
