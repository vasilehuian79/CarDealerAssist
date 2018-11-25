package sales;



public class SalesConsoleWriter {

    public void displaySalesData(Sales sales) {
        System.out.println(sales.getSaleID() + " " +
                sales.getClient().getClientCode() + " " +
                sales.getClient().getFirstName()+ " " +
                sales.getClient().getLastName()+ " " +
                sales.getCar().getCarCode()+ " " +
                sales.getCar().getModel()+ " " +
                sales.getCar().getVersionType()+ " " +
                sales.getQuantity());
    }
}
