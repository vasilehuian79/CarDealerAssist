package Car;

import java.util.List;
import java.util.Scanner;

public class CarConfigReader {
    public static Car readCarOptions() {

        Car car = new Car();
        Scanner sc = new Scanner(System.in);
        System.out.print(" - Press  (0 for Exit) : ");
        System.out.print("Enter car code:");
        car.setCarCode(sc.nextInt());
        if (car.getCarCode() != 0) {
            System.out.print(" - Please enter model    : ");
            car.setModel(sc.nextLine());
            System.out.print(" - Please enter version ");
            car.setVersionType(sc.nextLine());
            System.out.print(" - Please enter colour           : ");
            car.setColor(sc.nextLine());
            System.out.print(" - Please enter price for chosen config : ");
            car.setPrice(sc.nextInt());
        }
        return car;
    }

    public static void insertCarGearBox() {
        Car car = new Car();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert New Car option \n GearBox:");
        car.setGearbox(scanner.nextLine());
    }

    //public static int insertCarCode {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Insert Car  code in order to delete it:");
//        int carCode = scanner.nextInt();
//        return carCode;
//    }
    public Car editModel(Car car) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Edit Car Model Type \n Please insert new assigned model:");
        car.setModel(scanner.nextLine());
        return car;
    }
}




