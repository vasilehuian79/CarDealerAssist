package Car;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CarCLI {

    public Car readCar() {

        Car car = new Car();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti codul: ");
        int codeCar = scanner.nextInt();
        System.out.println("Introduceti modelul: ");
        String model = scanner.nextLine();
        System.out.println("Introduceti nivelul de echipare: ");
        String versionType = scanner.nextLine();
        System.out.println("Introduceti culoarea: ");
        String color = scanner.nextLine();
        System.out.println("Introduceti pretul: ");
        int price = scanner.nextInt();

        return car;
    }
}

