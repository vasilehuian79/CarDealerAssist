package Car;

public class Car {
    private int carCode;
    private String model;
    private String gearbox;
    private String versionType;
    private String color[]={"ALB","NEGRU","ALBASTRU","GALBEN","GRI","ROZ"};
    private int price;

    public Car(int carCode,String model,int price) {
        this.carCode = carCode;
        this.model = model;
        this.price = price;
    }

    public int getCarCode() {
        return carCode;
    }

    public void setCarCode(int carCode) {
        this.carCode = carCode;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public String getVersionType() {
        return versionType;
    }

    public void setVersionType(String versionType) {
        this.versionType = versionType;
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
}


