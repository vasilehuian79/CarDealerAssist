package car;

import com.google.gson.Gson;
import util.GenericStore;
import util.Paths;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarStorage extends GenericStore<Car> {

//    Nu mai avem nevoie de urmatoarele 2 linii datorita GenericStore()
//    private List<Car> carList = new ArrayList();
//    private CarStorage() {carList = readJson()};

    private static CarStorage carStorage = new CarStorage();

    public static CarStorage getInstance() { return carStorage ;};


    @Override
    public Car add(Car value) {
        value.setCarCode(generateId());
        objectList.add(value);
        writeJson();
        return value;
    }

    private int generateId() {
        int max = 0;
             for(Car car : objectList) {
                 if(max < car.getCarCode()) {
                     max = car.getCarCode();
                 }
             }
        return max + 1;
    }

    @Override
    public void delete(Car value) {
        objectList.remove(value);
        writeJson();
    }

    @Override
    public void update(Car value) {
        Car oldCar = getById(value.getCarCode());
        objectList.remove(oldCar);
        objectList.add(value);
        writeJson();
    }

    @Override
    public List<Car> getAll() {
        return objectList;
    }

    @Override
    public Car getById(int id) {
        for (Car c : objectList) {
            if(c.getCarCode() == id) {
                return c;
            }
        }
        return null;
    }

    @Override
    public String getFilePath() {
        return Paths.CARS_FILE_PATH;
    }

    @Override
    protected List<Car> getListFromJson(Gson gson, Reader reader) {
        return new ArrayList<>(Arrays.asList(gson.fromJson(reader, Car[].class)));
    }

}
