package sales;


import car.Car;
import car.CarService;
import client.Client;
import client.ClientService;
import client.ClientStorage;

import java.util.Scanner;

public class SalesConsoleReader {
    public Sales readSalesData() {
        Sales sales = new Sales();
        ClientService clientService = ClientService.getInstance();
        CarService carService = CarService.getInstance();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adding a new order");
        Client client = null;
        while (client == null) {
            System.out.println("Add client ID:");
            int idClient = scanner.nextInt();
            client = clientService.getClientById(idClient);
            if (client == null) {
                System.out.println("Client code doesn`t exist!!!");
            }
        }
        sales.setClient(client);


        System.out.println("Please enter your car code");

        Car car = null;
        while (car == null) {
            System.out.println("Add car ID:");
            int idCar = scanner.nextInt();
            car = carService.getCarById(idCar);
            if (car == null) {
                System.out.println("Car code doesn`t exist!!!");
            }
        }

        sales.setCar(car);

        System.out.println("Please enter your quantity");
        int quantity = 0;
        while (quantity <= 0) {
            if (quantity <= 0) {
                System.out.println("Please check the quantity desired and retry!");
            }
            quantity = scanner.nextInt();
        }
        sales.setQuantity(quantity);

        return sales;
    }

}

