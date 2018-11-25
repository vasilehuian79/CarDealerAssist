package car;

import java.util.Scanner;

public class CarConsoleReader {

    public int readCarCode() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" - Please enter car code: ");
        return scanner.nextInt();
    }

    public Car readCarData() {

        Car car = new Car();
        Scanner scanner = new Scanner(System.in);

        System.out.print(" - Please enter car model: ");
        String model = scanner.nextLine();
        car.setModel(model);

        System.out.print(" - Please enter car version: ");
        String versionType = scanner.nextLine();
        car.setVersionType(versionType);

        System.out.print(" - Please enter car color: ");
        String color = scanner.nextLine();
        car.setColor(color);

        System.out.print(" - Please enter car price: ");
        int carPrice = scanner.nextInt();
        car.setPrice(carPrice);

        return car;
    }
}
