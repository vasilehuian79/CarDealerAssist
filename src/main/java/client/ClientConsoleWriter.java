package client;

public class ClientConsoleWriter {

    public void displayClientData(Client client) {
        System.out.println(client.getClientCode() + " " +
                client.getFirstName() + " " +
                client.getLastName() + " " +
                client.getSsn() + " " +
                client.getEmail());
    }
}
