package menus;

import car.Car;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static menus.MainMenu.displayMainMenu;

public class StockMenu {

    public static List<Car> carList = new ArrayList<>();

    public static void displayStockMenu() throws IOException {

        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("+-----------------------+");
            System.out.println("| *** Meniu stocuri *** |");
            System.out.println("+-----------------------+");
            System.out.println("\t1. Adauga masina");
            System.out.println("\t2. Vizualizeaza tipuri de masini");
            System.out.println("\t3. Vizualizare stocuri");
            System.out.println("\t0. Intoarcere la meniul principal");
            System.out.print("Alege o optiune: ");
            option = sc.nextInt();
            System.out.println();
            switch (option) {
                case 1:
//                    CarService.addCar(readCar());
                    break;
                case 2:
//                    displayCar(carList);
                    break;
                case 3:
                    break;
                case 0:
                    displayMainMenu();
                    break;
            }}
            while (option != 0);
    }
}
