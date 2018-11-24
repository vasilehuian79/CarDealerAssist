package car;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static menus.MainMenu.displayMainMenu;

public class CarConsoleMenu {

    CarService carService = new CarService();
    CarConsoleReader carConsoleReader = new CarConsoleReader();
    CarConsoleWriter carConsoleWriter = new CarConsoleWriter();
    CarDealerType dealerType;

    private void displayStockOption() throws IOException {
        System.out.println("+--------------------+");
        System.out.println("| *** Stock menu *** |");
        System.out.println("+--------------------+");
        System.out.print("\t1. Add car model");
        System.out.print("\t2. Edit car model");
        System.out.print("\t3. Delete car model");
        System.out.print("\t4. Display all cars");
        System.out.print("\t0. Return to the main menu");
        System.out.print("\t Select your option: ");
    }

    public static List<Car> carList = new ArrayList<>();

    public void displayStockMenu() throws IOException {

        Scanner sc = new Scanner(System.in);
        int option;

        do {
            displayStockOption();
            option = sc.nextInt();
            System.out.println();
            switch (option) {
                case 1:
//                    addCar(car);
                    break;
                case 2:
//                    editCar(car);
                    break;
                case 3:
//                    updateCar(car);
                    break;
                case 4:
//                    displayAllCars();
                    break;
                case 0:
                    displayMainMenu();
                    break;
            }}
        while (option != 0);
    }
}
