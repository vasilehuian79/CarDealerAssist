package Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ClientCLI {

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
