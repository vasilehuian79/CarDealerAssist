package Car;

import java.util.ArrayList;
import java.util.List;

import static Car.CarCLI.*;

public class CarRepository {

    Car car = CarCLI.readCar();
    List<Car> carList = new ArrayList<>();

    public List<Car> addCar(Car car) {
        carList.add(car);
        return carList;
    }
}
