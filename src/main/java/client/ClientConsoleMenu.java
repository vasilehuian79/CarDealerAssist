package client;

import menus.MainMenu;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class ClientConsoleMenu {
    ClientService clientService = ClientService.getInstance();
    ClientConsoleWriter clientWriter = new ClientConsoleWriter();
    ClientConsoleReader clientReader = new ClientConsoleReader();

    private void displayClientsOption() throws IOException {
        System.out.println("\t1. Add client");
        System.out.println("\t2. Edit client");
        System.out.println("\t3. Delete client");
        System.out.println("\t4. Display all clients");
        System.out.println("\t0. Return to the main menu");
        System.out.print("\tSelect your option: ");
    }

    public void takeClientsOption() throws IOException {

        Scanner scanner = new Scanner(System.in);
        int option;
        System.out.println("+-----------------------+");
        System.out.println("| *** Clients Menu ***  |");
        System.out.println("+-----------------------+");
        do {
            displayClientsOption();

//                System.out.print("Select your option: ");
//                displayClientsOption();
            option = scanner.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    addClient();
                    break;
                case 2:
                    editClientEmail();
                    break;
                case 3:
                    deleteClient();
                    break;
                case 4:
                    displayAllClients();
                    break;
                case 0:
                    MainMenu.displayMainMenu();
                    break;
            }

        } while (option != 0);

    }


    private void displayAllClients() {
        List<Client> allClients = clientService.getAllClients();
        for (Client client : allClients) {
            clientWriter.displayClientData(client);
        }
    }

    private void addClient() {
        Client client = clientReader.readClientData();
        clientService.addClient(client);
        System.out.println("Client successfully added.");

    }

    private void deleteClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which client do you want to delete? Enter ID : ");
        int id = scanner.nextInt();
        Client client = clientService.getClientById(id);
        clientService.deleteClient(client);
        System.out.println("client successfully deleted.");
    }

    private void editClientEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which client do you want to edit? Enter ID : ");
        int id = scanner.nextInt();
        Client client = clientService.getClientById(id);
        client = clientReader.editClientEmail(client);
        clientService.updateClient(client);
        System.out.println("Client data successfully updated.");

    }


}
