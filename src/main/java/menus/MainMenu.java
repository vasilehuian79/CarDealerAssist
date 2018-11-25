package menus;

import car.CarConsoleMenu;
import client.ClientConsoleMenu;
import sales.SalesConsoleMenu;

import java.io.IOException;
import java.util.Scanner;

public class MainMenu {

    public static void displayMainMenu() throws IOException {
        ClientConsoleMenu clientConsoleMenu = new ClientConsoleMenu();
        SalesConsoleMenu salesConsoleMenu = new SalesConsoleMenu();

//        ClearScreen.clearScreen();
        System.out.println("+-------------------+");
        System.out.println("| *** Main menu *** |");
        System.out.println("+-------------------+");
        System.out.println("\t1. Stocks");
        System.out.println("\t2. Clients");
        System.out.println("\t3. Sales");
        System.out.println("\t0. Exit");
        System.out.print(" Select your option: ");

        Scanner sc = new Scanner(System.in);
        int option;
        do {
//            System.out.print("Alege o optiune: ");
            option = sc.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    CarConsoleMenu.displayStockMenu();
                    break;
                case 2:
                    clientConsoleMenu.takeClientsOption();
                    break;
                case 3:
                    salesConsoleMenu.takeClientsOption();
                    break;
                case 0:
                    System.exit(0);
            }}
            while (option != 0);
    }
}
