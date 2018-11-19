package Client;

import Menus.MainMenu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class ClientCLI {

    public static void displayClientsOption() throws IOException {
        System.out.println("+-----------------------+");
        System.out.println("| *** Clients Menu *** |");
        System.out.println("+-----------------------+");
        System.out.println("\t1. Add client");
        System.out.println("\t2. Edit client");
        System.out.println("\t3. Delete client");
        System.out.println("\t4. Display all clients");
        System.out.println("\t5. Return to the main menu");
        System.out.print("\tSelect your option: ");
    }

    public void takeClientsOption() throws IOException {

        Scanner scanner = new Scanner( System.in );
            int option;
            do{
                System.out.println("+-----------------------+");
                System.out.println("| *** Clients Menu *** |");
                System.out.println("+-----------------------+");
//                System.out.print("Select your option: ");
//                displayClientsOption();
            option = scanner.nextInt();
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
                    MainMenu.displayMainMenu();
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
