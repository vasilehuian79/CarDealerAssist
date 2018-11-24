package sales;

import java.util.Date;


public class Sales {
    int saleID;
    int clientCode;
    int carCode;
    Date sellingDate;
    int sellingPrice;
    int quantity;
    int billNumber;
    Date billDate;
    int totalValue;

    public Sales() {

    }

    public Sales(int clientCode, int carCode, Date sellingDate, int sellingPrice, int quantity, int billNumber, Date billDate, int totalValue) {
        this.clientCode = clientCode;
        this.saleID = saleID;
        this.carCode = carCode;
        this.sellingDate = sellingDate;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
        this.billNumber = billNumber;
        this.billDate = billDate;
        this.totalValue = totalValue;
    }

    public int getSaleID() {
        return saleID;
    }

    public void setSaleID(int saleID) {
        this.saleID = saleID;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }

    public int getClientCode() {
        return clientCode;
    }

    public void setClientCode(int clientCode) {
        this.clientCode = clientCode;
    }

    public int getCarCode() {
        return carCode;
    }

    public void setCarCode(int carCode) {
        this.carCode = carCode;
    }

    public Date getSellingDate() {
        return sellingDate;
    }

    public void setSellingDate(Date sellingDate) {
        this.sellingDate = sellingDate;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(int billNumber) {
        this.billNumber = billNumber;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }
}
