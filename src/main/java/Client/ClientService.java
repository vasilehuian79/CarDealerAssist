package client;

import java.util.List;

public class ClientService {
    ClientConsoleReader clientReader = new ClientConsoleReader();
    ClientStorage clientStorage = new ClientStorage();

    public Client getClientById(int id){
        return clientStorage.getById(id);
    }

    public List<Client> getAllClients(){
        return clientStorage.getAll();
    }

    public void addClient(Client client){
        clientStorage.add(client);
    }

    public void deleteClient(Client client){
        clientStorage.delete(client);
    }

    public void updateClient(Client client){
        clientStorage.update(client);
    }
}
