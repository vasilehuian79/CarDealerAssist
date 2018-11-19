import Car.Car;
import Menus.MainMenu;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import static java.nio.file.Files.readAllLines;

public class CarDealerAssistent {

    private DealerType dType;
    private Map<Car, Integer> carStock;

    public CarDealerAssistent(String filePath) {
        initialize(filePath);
    }

    public void initialize(String filePath) {
        Path path = Paths.get(filePath);
        List<String> lines = null;

        try {
            lines = readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        dType = dType.valueOf(lines.get(0));
        System.out.println();
        System.out.println("Bun venit la dealerul " + dType);
    }


    public void start() throws IOException {
        MainMenu.displayMainMenu();
    }
}

//    private Map<Client, Integer> customersData;
//
//    public String displayMenu(Map<Client, Integer> customersData, DealerType cType) {
//        String myMenu = "";
//        myMenu = myMenu.concat(cType + " Dealer Asistant");
//        myMenu = myMenu.concat("\n");
//        myMenu=myMenu.concat("OUR CAR MODELS:");
//        myMenu = myMenu.concat("\n");
//        myMenu = myMenu.concat("Cod\t Version\t GearBox\t Price\t ");
//        myMenu = myMenu.concat("\n");
//        for (Car model : carStock.keySet()) {
//            myMenu = myMenu.concat(model.getCarCode() + "\t" + model.getModel() + "\t" + model.getGearbox()
//                    +"\t"+model.getPrice());
//            myMenu = myMenu.concat("\n");
//        }
////        System.out.println(myMenu);
//        return myMenu;
////        System.out.println("0 - Iesire");
//    }
//
//    public Client displayCustomer() {
//        for (Client cust : customersData.keySet()) {
//            Client client = new Client(customersData.get(cust));
//            Scanner scanner = new Scanner(System.in);
//            System.out.println(" Please enter your personal data below");
//            System.out.print("Enter your first name:");
//            String firstname = scanner.nextLine();
//            System.out.print("Enter your last name:");
//            String lastname = scanner.nextLine();
//            System.out.print("Enter your email:");
//            String email = scanner.nextLine();
//            System.out.print("Enter your SSN:");
//            int ssn = scanner.nextInt();
//        }
//        return displayCustomer();
//    }
//
//    public Car buyCar() {
//        System.out.println("Pick a version by entering code from above: ");
//        Scanner version = new Scanner(System.in);
//        int option1 = version.nextInt();
//        System.out.println("You have selected"+carStock.get(lines.get));
//        System.out.println("Please select a package: ");
//        int option2 = version.nextInt();
//        System.out.println(": ");
//        boolean ok = false;
//
//        if (option1 == 0) {
//            System.exit(0);
//        }
//        for (Car c : carStock.keySet()) {
//            if (c.getCarCode() == option) {
//                Integer quantity = carStock.get(c);
//                if (quantity > 0) {
//                    ok = true;
//                    return c;
//
//                } else {
//                    System.out.println("Nu sunt masini suficiente in stoc");
//                    break;
//                }
//            }
//        }
//        if (ok == false) {
//            System.out.println("Optiunea introdusa nu este valida.");
//            return buyCar();
//        }
//        return null;
//    }
//
//
//
//        carStock = new LinkedHashMap<>();
//        Integer quantity = Integer.valueOf(lines.get(2)); // nr de produse din VM
//
//        for (int i = 3; i < quantity + 3; i++) {
//            String line = lines.get(i);
//            String[] parts = line.split(" ");
//            Car car = new Car(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]));
//            car.setCarCode(i;
//            carStock.put(model, Integer.valueOf(parts[3]));
//        }
//
//        Integer currencyLineIndex = nrProducts + 3; // nr de monezi
//        Integer nrCoins = Integer.valueOf(lines.get(currencyLineIndex));
//
//        for (int i = currencyLineIndex + 1; i < currencyLineIndex + 1 + nrCoins; i++) {
//            String coinLine = lines.get(i);
//            String[] parts = coinLine.split(" ");
//            Coin coin = new Coin(Integer.valueOf(parts[0]));
//            coin.setCod(i);
//            coinStock.put(coin, Integer.valueOf(parts[1]));
//        }
//    }
//
//    public void payment
//
//    {
//
//    }
//
//
//}
