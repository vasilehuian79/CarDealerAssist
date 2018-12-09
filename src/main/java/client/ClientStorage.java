package client;

import com.google.gson.Gson;
import util.GenericStore;
import util.Paths;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClientStorage extends GenericStore<Client> {

//    private List<Client> clientList = new ArrayList<>();

    @Override
    public Client add(Client value) {
        value.setClientCode(generateId());
        objectList.add(value);
        writeJson();
        return value;
    }

    private int generateId(){
        int max = 0;
        for (Client client:objectList){
            if(max<client.getClientCode()){
                max=client.getClientCode();
            }
        }
        return max+1;
    }

    @Override
    public void delete(Client value) {
        objectList.remove(value);
        writeJson();
    }

    @Override
    public void update(Client value) {
        Client oldClient = getById(value.getClientCode());
        objectList.remove(oldClient);
        objectList.add(value);
        writeJson();
    }

    @Override
    public List<Client> getAll() {
        return objectList;
    }

    @Override
    public Client getById(int id) {
        for(Client client : objectList){
            if(client.getClientCode() == id){
                return client;
            }
        }
        return null;
    }

    @Override
    public String getFilePath() {
        return Paths.CLIENTS_FILE_PATH;
    }

    @Override
    protected List<Client> getListFromJson(Gson gson, Reader reader) {
        return new ArrayList<>(Arrays.asList(gson.fromJson(reader, Client[].class)));
    }

}