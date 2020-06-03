package com.dgb.model.crud;

import com.dgb.model.Article;
import com.dgb.model.Category;
import com.dgb.model.DataCenter;

import java.util.List;

public class CategoryCrud implements BaseCrud<Category,Integer>{
    DataCenter<Category> dataCenter;

    public CategoryCrud() {
        dataCenter = new DataCenter<>();
        dataCenter.getData().add(new Category(1,"Java"));
        dataCenter.getData().add(new Category(2,"Math"));
        dataCenter.getData().add(new Category(3,"Khmer"));
    }


    @Override
    public void create(Category obj) {
        dataCenter.getData().add(obj);
    }

    @Override
    public List<Category> read() {
        return dataCenter.getData();
    }

    @Override
    public Category readOne(Integer id) {
        return null;
    }

    @Override
    public boolean update(Integer id, Category newObj) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
