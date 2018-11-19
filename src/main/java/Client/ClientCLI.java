package Client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static Menus.MainMenu.displayMainMenu;

public class ClientCLI {

    public static void displayClientsMenu() throws IOException {

        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("+-----------------------+");
            System.out.println("| *** Meniu clienti *** |");
            System.out.println("+-----------------------+");
            System.out.println("\t1. Adauga client");
            System.out.println("\t2. Editeaza client");
            System.out.println("\t3. Sterge client");
            System.out.println("\t4. Vizualizeaza clienti");
            System.out.println("\t0. Intoarcere la meniul principal");
            System.out.print("Alege o optiune: ");
            option = sc.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    displayMainMenu();
                    break;
            }}
        while (option != 0);
    }

    public static Integer generateRandomClientId() {
        //Generated a random id between 4-10 characters
        int clientId = 0;
        int max = 10;
        int min = 4;
        int diff = max - min;
        Random rn = new Random();
        int i = rn.nextInt(diff + 1);
        i += min;

        return clientId;
    }

    public Client getClientData(Client client) {
        // Client client = new Client(generateRandomClientId());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adding a new client");

        System.out.println("Please enter your First Name");
        String firstName = scanner.next();
        client.setFirstName(firstName);

        System.out.println("Please enter your Last Name");
        String lastName = scanner.next();
        client.setLastName(lastName);

        System.out.println("Please enter your SSN");
        Integer ssn = scanner.nextInt();
        client.setSsn(ssn);

        System.out.println("Please enter your email address");
        String email = scanner.next();
        client.setEmail(email);

        return client;
    }
}
