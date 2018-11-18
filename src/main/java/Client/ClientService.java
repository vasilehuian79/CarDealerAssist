package Client;

import java.util.ArrayList;
import java.util.List;

public class ClientService {

    public void start() {
        Client client = new Client(ClientCLI.generateRandomClientId());
        ClientCLI cli = new ClientCLI();
        cli.getClientData(client);
        this.addClient(client);
    }

    public boolean addClient(Client client) {
        // Save the client on the database/ file
        return true;
    }

    public Client findClient(int clientCode) {
        // Must read from database/ file based on client code and will return the Client
        // If database is used this should be the SQL query:
        // SELECT * from ClientTable WHERE ClientTable.clientCode = clientCode
        return new Client(clientCode);
    }

    public List<Client> displayAllClients() {
        // If you are using a Database, do a SELECT * clients
        // If you are using a TextFile, get all clients from the .txt/ .json file
        List<Client> list = new ArrayList<Client>();
        // You will need to get clients and add these to the bellow list in the following manner:
        // list.add(findClient(clientCode));
        return list;
    }
}
