package sales;



public class SalesConsoleWriter {

    public void displaySalesData(Sales sales) {
        System.out.println(sales.getSaleID() + " " +
                sales.getClient().getClientCode() + " " +
                sales.getCar().getCarCode() + " " +
                sales.getSellingDate() + " " +
                sales.getQuantity());


    }
}
