package Menus;

import java.util.Scanner;

public class MainMenu {

    public static void displayMainMenu() {

        System.out.println("+-------------------------+");
        System.out.println("| *** Meniu principal *** |");
        System.out.println("+-------------------------+");
        System.out.println("\t1. Stocuri");
        System.out.println("\t2. Clienti");
        System.out.println("\t3. Vinzari");
        System.out.println("\t0. Iesire");

        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.print("Alege o optiune: ");
            option = sc.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    StockMenu.displayStockMenu();
                    break;
                case 2:
                    ClientsMenu.displayClientsMenu();
                    break;
                case 3:
                    StockMenu.displayStockMenu();
                    break;
                case 0:
                    System.exit(0);
            }}
            while (option != 0);
    }
}