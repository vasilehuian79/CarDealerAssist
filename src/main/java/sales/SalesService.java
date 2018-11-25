package sales;

import client.ClientConsoleReader;
import client.ClientService;

import java.util.List;

public class SalesService {

    SalesStorage salesStorage = new SalesStorage();
    ClientService clientService = ClientService.getInstance();
    SalesConsoleReader saleReader = new SalesConsoleReader();



    public void addSale(Sales sales) {
        //TODO: validate product and client
        //TODO: validate and subtract from stock
        salesStorage.add(sales);

    }

    public List<Sales> getAllOrders() {
        return salesStorage.getAll();
    }
}
