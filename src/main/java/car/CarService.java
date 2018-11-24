package car;

import java.util.List;

public class CarService {

    CarConsoleReader carReader = new CarConsoleReader();
    CarStorage carStorage = new CarStorage();

    public Car getCarById(int id) {
        return carStorage.getById(id);
    }

    public List<Car> getAllCars() {
        return carStorage.getAll();
    }

    public void addCar(Car car) {
        carStorage.add(car);
    }

    public void deleteCar(Car car) {
        carStorage.delete(car);
    }

    public void updateCar(Car car) {
        carStorage.update(car);
    }
}






//    public static List<Car> carList = StockMenu.carList;
//    Car car = CarCLI.readCar();
//
//    public static void getAllModels{
//
//    }
//
//    public static List<Car> addCar(Car car) {
//        boolean ok = true;
//        while (ok) {
//            if (car.getCarCode() == 0) {    // adaugam masini pina introducem codul zero
//                ok = false;
//            } else {
//                if (!seekCar(car)) {
//                    carList.add(car);
//                    System.out.println("Masina " + car.getCarCode()+ " adaugata cu succes.");
//                    System.out.println();
//                } else {
//                    System.out.println("Codul " + car.getCarCode() + " exista deja. NU a fost adaugat.");
//                }
//                car = CarCLI.readCar();
//            }
//        }
//        return carList;
//    }
//
//    public static boolean seekCar(Car car) {
//        boolean found = false;
//        for(Car c: carList) {
//            if (c.getCarCode() == car.getCarCode()) {
//                found = true;
//            }
//        }
//        return found;
//    }

