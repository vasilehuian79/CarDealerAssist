package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class GenericStore<T> {

    protected List<T> objectList;

    public GenericStore() { objectList = readJson(); }

    public abstract T add(T value);
    public abstract void delete(T value);
    public abstract void update(T value);
    public abstract List<T> getAll();
    public abstract T getById(int id);
    public abstract String getFilePath();
    protected abstract List<T> getListFromJson(Gson gson, Reader reader);

    protected List<T> readJson(){
        try(Reader reader = new InputStreamReader(new FileInputStream(getFilePath()), "UTF-8")){
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return getListFromJson(gson, reader);
//            Type listType = new TypeToken<ArrayList<T>>(){}.getType();
//            return new ArrayList<>( Arrays.asList(gson.fromJson(reader, listType)));
        } catch (IOException e) {
            System.out.println("Exception occured: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    protected final void writeJson() {
        try(Writer writer = new OutputStreamWriter(new FileOutputStream(getFilePath()) , "UTF-8")){
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(getAll(), writer);
        } catch (IOException e) {
            System.out.println("Exception occured: " + e.getMessage());
        }
    }
}
