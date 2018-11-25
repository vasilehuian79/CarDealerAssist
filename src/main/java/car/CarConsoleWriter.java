package car;

import java.util.List;

public class CarConsoleWriter {

        public void displayCarData(Car car) {
            System.out.println(car.getCarCode() + ".\t" +
                    car.getModel() + "\t" +
                    car.getVersionType() + "\t" +
                    car.getColor() + "\t" +
                    car.getPrice());
        }

        public void displayAllCars(List<Car> carList) {
            for (Car c: carList) {
                displayCarData(c);
                System.out.println("-------------------------------");
            }
        }
}
