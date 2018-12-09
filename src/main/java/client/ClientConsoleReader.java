package client;

import java.util.Scanner;

public class ClientConsoleReader {

    public Client readClientData() {
        Client client = new Client();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adding a new client");

        System.out.print("Please enter first name: ");
        String firstName = scanner.next();
        client.setFirstName(firstName);

        System.out.print("Please enter last name: ");
        String lastName = scanner.next();
        client.setLastName(lastName);

        System.out.print("Please enter SSN: ");
        Integer ssn = scanner.nextInt();
        client.setSsn(ssn);

        System.out.print("Please enter email address: ");
        String email = scanner.next();
        client.setEmail(email);

        return client;
    }


    public Client editClientEmail(Client client){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Edit user data.");
        System.out.println("Edit email");
        client.setEmail(scanner.nextLine());
        return client;
    }
}
