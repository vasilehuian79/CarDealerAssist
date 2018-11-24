package sales;



public class SalesConsoleWriter {

    public void displaySalesData(Sales sales) {
        System.out.println(sales.getSaleID() + " " +
                sales.getClientCode() + " " +
                sales.getCarCode() + " " +
                sales.getSellingDate() + " " +
                sales.getSellingPrice() + " " +
                sales.getQuantity() + " " +
                sales.getBillNumber() + " " +
                sales.getBillDate());


    }
}
