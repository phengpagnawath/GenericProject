package com.dgb.model.crud;

import java.util.List;

public interface BaseCrud<T,S> {
    void create(T obj);
    List<T> read();
    T readOne(S id);
    boolean update(S id,T newObj);
    boolean delete(S id);
}
