package car;

public class Car {
    private int carCode;
    private String model;
    private String versionType;
    private String color;
    private int price;
    private String gearbox;

    public Car() {

    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public int getCarCode() {
        return carCode;
    }

    public void setCarCode(int carCode) { this.carCode = carCode; }

    public String getModel() { return model; }

    public void setModel(String model) {this.model = model; }

    public String getVersionType() { return versionType; }

    public void setVersionType(String versionType) { this.versionType = versionType; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }
}


