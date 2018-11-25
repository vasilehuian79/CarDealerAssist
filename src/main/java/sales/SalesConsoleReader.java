package sales;


import client.ClientService;

import java.util.Scanner;

public class SalesConsoleReader {
    public Sales readSalesData() {
        Sales sales = new Sales();
        ClientService clientService = new ClientService();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adding a new order");

        System.out.println("Please enter your client code");
        int id = scanner.nextInt();
        clientService.getClientById(id);

        System.out.println("Please enter your car code");

        System.out.println("Please enter your quantity");

        return sales;
    }

}

