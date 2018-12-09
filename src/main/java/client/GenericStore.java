package client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;

public abstract class GenericStore<T> {


    public GenericStore() {  };

    public abstract T add(T value);
    public abstract void delete(T value);
    public abstract void update(T value);
    public abstract List<T> getAll();
    public abstract T getById(int id);
    public abstract String getFilePath();

    protected final void writeJson() {
        try(Writer writer = new OutputStreamWriter(new FileOutputStream(getFilePath()) , "UTF-8")){
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(getAll(), writer);
        } catch (IOException e) {
            System.out.println("Exception occured: " + e.getMessage());
        }
    }
}
