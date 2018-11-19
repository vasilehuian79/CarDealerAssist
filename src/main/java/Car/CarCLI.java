package Car;

import java.util.*;
import java.util.Scanner;

public class CarCLI {

    public static Car readCar() {

        Car car = new Car();
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti codul (0 = Iesire) : ");
        car.setCarCode(sc.nextInt());
        if(car.getCarCode() != 0) {
            System.out.print(" - Introduceti modelul            : ");
            car.setModel(sc.nextLine());
            System.out.print(" - Introduceti nivelul de echipare: ");
            car.setVersionType(sc.nextLine());
            System.out.print(" - Introduceti culoarea           : ");
            car.setColor(sc.nextLine());
            System.out.print(" - Introduceti pretul             : ");
            car.setPrice(sc.nextInt());
        }
        return car;
    }

    public static void displayCar(List<Car> carList) {
        System.out.println();
        System.out.println("Tipuri de masini vindute");
        System.out.println("===========================================================");
        System.out.println("  Cod\t\tModel\t\tEchipare\t\tCuloare\t\tPret");
        System.out.println("===========================================================");

        for (Car c : carList) {
            System.out.println("  "+c.getCarCode() + "\t\t" +
                    c.getModel() + "\t\t" +
                    c.getVersionType() + "\t\t" +
                    c.getColor() + "\t\t" +
                    c.getPrice());
            System.out.println("-----------------------------------------------------------");
        }
    }
}
