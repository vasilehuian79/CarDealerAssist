package car;

import client.GenericStore;

import java.util.ArrayList;
import java.util.List;

public class CarStorage extends GenericStore<Car> {

    private List<Car> carList = new ArrayList();

    @Override
    public Car add(Car value) {
        value.setCarCode(generateId());
        carList.add(value);
        return value;
    }

    private int generateId() {
        int max = 0;
             for(Car car : carList) {
                 if(max < car.getCarCode()) {
                     max = car.getCarCode();
                 }
             }
        return max + 1;
    }

    @Override
    public void delete(Car value) {
        carList.remove(value);
    }

    @Override
    public void update(Car value) {
        Car oldCar = getById(value.getCarCode());
        carList.remove(oldCar);
        carList.add(value);
    }

    @Override
    public List<Car> getAll() {
        return carList;
    }

    @Override
    public Car getById(int id) {
        for (Car c : carList) {
            if(c.getCarCode() == id) {
                return c;
            }
        }
        return null;
    }
}
