package car;

import java.io.IOException;
import java.util.Scanner;

import static menus.MainMenu.displayMainMenu;

public class CarConsoleMenu {

    static CarService carService = CarService.getInstance();
    static CarConsoleReader carConsoleReader = new CarConsoleReader();
    static CarConsoleWriter carConsoleWriter = new CarConsoleWriter();
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
                    Boolean ok = false;
                    int carId = -1;
                    while (!ok) {
                        carId = carConsoleReader.readCarCode();
                        Car initial_car = carService.getCarById(carId);
                        if (initial_car != null) {
                            ok = true;
                        }
                    }
                    Car new_car = carConsoleReader.readCarData();
                    new_car.setCarCode(carId);
                    carService.updateCar(new_car);
                    break;
                case 3:
                    carService.deleteCar(carService.getCarById(carConsoleReader.readCarCode()));
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
