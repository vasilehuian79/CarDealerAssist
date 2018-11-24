package car;

public class CarConsoleWriter {

        public void displayCarData(Car car) {
            System.out.println(car.getCarCode() + "\t" +
                    car.getModel() + "\t" +
                    car.getVersionType() + "\t" +
                    car.getColor() + "\t" +
                    car.getPrice());
        }
}
