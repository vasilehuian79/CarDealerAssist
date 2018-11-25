package clientv2;

import java.util.Scanner;

public class ClientConsoleReader {

    public Client readClientData() {
        Client client = new Client();

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


    public Client editClientEmail(Client client){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Edit user data.");
        System.out.println("Edit email");
        client.setEmail(scanner.nextLine());
        return client;
    }
}
