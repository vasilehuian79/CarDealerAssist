package car;

import java.util.Scanner;

public class CarConsoleReader {

    public Car readCarData() {

        Car car = new Car();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adding a new car model");

        System.out.println("Please enter car code: ");
        int carCode = scanner.nextInt();
        car.setCarCode(carCode);

        System.out.println("Please enter car model: ");
        String model = scanner.nextLine();
        car.setModel(model);

        System.out.println("Please enter car version: ");
        String versionType = scanner.nextLine();
        car.setVersionType(versionType);

        System.out.println("Please enter car color: ");
        String color = scanner.nextLine();
        car.setColor(color);

        System.out.println("Please enter car price: ");
        int carPrice = scanner.nextInt();
        car.setPrice(carPrice);

        return car;
    }
}
