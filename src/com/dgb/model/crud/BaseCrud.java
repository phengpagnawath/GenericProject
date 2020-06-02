package com.dgb.model.crud;

public interface BaseCrud<T,S> {
    void create(T obj);
    void read();
    void readOne();
    void update(S id);
    void delete(S id);
}
