package Car;

import java.util.Scanner;

public class CarCLI {
    public Car buyCar() {
        System.out.println("Pick a version by entering code from above: ");
        Scanner version = new Scanner(System.in);
        int option1 = version.nextInt();
        System.out.println("You have selected"+carStock.get(lines.ge));
        System.out.println("Please select a package: ");
        int option2=version.nextInt()
        System.out.println(": ");
        boolean ok = false;

        if (option1 == 0) {
            System.exit(0);
        }
        for (Car c : carStock.keySet()) {
            if (c.getCarCode() == option) {
                Integer quantity = carStock.get(c);
                if (quantity > 0) {
                    ok = true;
                    return c;

                } else {
                    System.out.println("Nu sunt masini suficiente in stoc");
                    break;
                }
            }

}
