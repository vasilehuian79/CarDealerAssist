package car;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static menus.MainMenu.displayMainMenu;

public class CarConsoleMenu {

    static CarService carService = CarService.getInstance();
    static CarConsoleReader carConsoleReader = new CarConsoleReader();
    static CarConsoleWriter carConsoleWriter = new CarConsoleWriter();
    static CarStorage carStorage = CarStorage.getInstance();
    CarDealerType dealerType;

    public static void displayStockOption() throws IOException {
        System.out.println("+--------------------+");
        System.out.println("| *** Stock menu *** |");
        System.out.println("+--------------------+");
        System.out.println("\t1. Add car model");
        System.out.println("\t2. Edit car model");
        System.out.println("\t3. Delete car model");
        System.out.println("\t4. Display all cars");
        System.out.println("\t0. Return to the main menu");
        System.out.print(" Select your option: ");
    }

    public static List<Car> carList = new ArrayList<>();

    public static void displayStockMenu() throws IOException {

        Scanner sc = new Scanner(System.in);
        int option;

        do {
            displayStockOption();
            option = sc.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    carService.addCar(carConsoleReader.readCarData());
                    break;
                case 2:
                    carService.updateCar(carConsoleReader.readCarData());
                    break;
                case 3:
                    carService.deleteCar(carStorage.getById(carConsoleReader.readCarCode()));
                    break;
                case 4:
                    carConsoleWriter.displayAllCars(carService.getAllCars());
                    break;
                case 0:
                    displayMainMenu();
                    break;
            }}
        while (option != 0);
    }
}
