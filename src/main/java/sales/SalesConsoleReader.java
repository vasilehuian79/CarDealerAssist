package sales;


import car.CarService;
import client.ClientService;

import java.util.Scanner;

public class SalesConsoleReader {
    public Sales readSalesData() {
        Sales sales = new Sales();
        ClientService clientService = ClientService.getInstance();
        CarService carService = new CarService();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adding a new order");

        System.out.println("Please enter your client code");
        int idClient = scanner.nextInt();
        clientService.getClientById(idClient);

        System.out.println("Please enter your car code");
        int idCar = scanner.nextInt();
        carService.getCarById(idCar);

        System.out.println("Please enter your quantity");
        int quantity = scanner.nextInt();
        sales.setQuantity(quantity);

        return sales;
    }

}

