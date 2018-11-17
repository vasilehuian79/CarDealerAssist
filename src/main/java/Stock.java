public class Stock {
    private int carCode;
    private int quantity;

    public Stock(int carCode, int quantity) {
        this.carCode = carCode;
        this.quantity = quantity;
    }

    public int getCarCode() {
        return carCode;
    }

    public void setCarCode(int carCode) {
        this.carCode = carCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

