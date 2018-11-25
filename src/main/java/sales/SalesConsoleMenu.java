package sales;

import client.Client;
import client.ClientConsoleReader;
import menus.MainMenu;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class SalesConsoleMenu {

    SalesService salesService = new SalesService();
    SalesConsoleWriter salesWriter = new SalesConsoleWriter();

    private void displaySalesMenuOption() throws IOException {
        System.out.println("\t1. Add sale");
        System.out.println("\t2. Display all sales");
        System.out.println("\t0. Return to the main menu");
        System.out.print("\tSelect your option: ");
    }


    public void takeClientsOption() throws IOException {

        Scanner scanner = new Scanner(System.in);
        int option;
        System.out.println("+-----------------------+");
        System.out.println("| *** Sales Menu   ***  |");
        System.out.println("+-----------------------+");
        do {
            displaySalesMenuOption();
            option = scanner.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    addSale();
                    break;
                case 2:
                    displayAllSales();
                    break;
                case 0:
                    MainMenu.displayMainMenu();
                    break;
            }

        } while (option != 0);

    }


    private void displayAllSales() {
        List<Sales> allSales = salesService.getAllOrders();
        for (Sales sales : allSales) {
            salesWriter.displaySalesData(sales);
        }
    }


    private void addSale() {
        SalesConsoleReader saleReader = new SalesConsoleReader();
        Sales sales = saleReader.readSalesData();
        salesService.addSale(sales);
        System.out.println("Sale successfully added.");
    }

}


