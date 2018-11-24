package client;

import java.util.List;

public abstract class GenericStore<T> {
    public abstract T add(T value);
    public abstract void delete(T value);
    public abstract void update(T value);
    public abstract List<T> getAll();
    public abstract T getById(int id);
}
