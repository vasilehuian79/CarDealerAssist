package Menus;

import Car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockMenu {

    List<Car> carList = new ArrayList<>();
    public void displayStockMenu() {

        System.out.println("+-----------------------+");
        System.out.println("| *** Meniu stocuri *** |");
        System.out.println("+-----------------------+");
        System.out.println("\t1. Adauga masina");
        System.out.println("\t2. Vizualizare stocuri");
        System.out.println("\t0. Intoarcere la meniu principal");

        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.print("Alege o optiune: ");
            option = sc.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    MainMenu.displayMainMenu();
                    break;
            }}
            while (option != 0);
    }
}
