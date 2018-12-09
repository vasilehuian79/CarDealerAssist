
package sales;

import car.Car;
import client.Client;

import java.util.Date;

public class Sales {

        int saleID;
        Client client;
        Car car;
        Date sellingDate;
        int quantity;
        int totalValue;

        public Sales() { }

        public Sales(int saleID, Client client, Car car, Date sellingDate, int quantity, int totalValue) {
            this.saleID = saleID;
            this.client = client;
            this.car = car;
            this.sellingDate = sellingDate;
            this.quantity = quantity;
            this.totalValue = totalValue;
        }

        public int getSaleID() {
            return saleID;
        }

        public void setSaleID(int saleID) {
            this.saleID = saleID;
        }

        public Client getClient() {
            return client;
        }

        public void setClient(Client client) {
            this.client = client;
        }

        public Car getCar() {
            return car;
        }

        public void setCar(Car car) {
            this.car = car;
        }

        public Date getSellingDate() {
            return sellingDate;
        }

        public void setSellingDate(Date sellingDate) {
            this.sellingDate = sellingDate;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public int getTotalValue() {
            return totalValue;
        }

        public void setTotalValue(int totalValue) {
            this.totalValue = totalValue;
        }
}


//    @Override
//    public String getFilePath() {
//        return Paths.ORDERS_FILE_PATH;

