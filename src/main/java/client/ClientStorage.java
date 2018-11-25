package client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class ClientStorage extends GenericStore<Client> {

    private List<Client> clientList = new ArrayList<>();

    private static final String filePath = "D:/Clients.json";

    @Override
    public Client add(Client value) {
        value.setClientCode(generateId());
        clientList.add(value);
        return value;
    }

    private int generateId(){
        int max = 0;
        for (Client client:clientList){
            if(max<client.getClientCode()){
                max=client.getClientCode();
            }
        }
        return max+1;
    }

    @Override
    public void delete(Client value) {
        clientList.remove(value);

    }

    @Override
    public void update(Client value) {
        Client oldClient = getById(value.getClientCode());
        clientList.remove(oldClient);
        clientList.add(value);

    }

    @Override
    public List<Client> getAll() {
        return clientList;
    }

    @Override
    public Client getById(int id) {
        for(Client client : clientList){
            if(client.getClientCode() == id){
                return client;
            }
        }
        return null;
    }

    protected void writeJson() {
        try (Writer writer = new FileWriter(filePath)) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(getAll(), writer);
        } catch (IOException e) {
            System.out.println("Exception occured: " + e.getMessage());
        }

    }
}