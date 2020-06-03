package com.dgb.controller;

import com.dgb.model.Category;
import com.dgb.model.crud.CategoryCrud;
import com.dgb.view.CategoryView;
import com.dgb.view.MainView;

public class CategoryController {
    private CategoryCrud categoryCrud;
    private CategoryView categoryView=new CategoryView();

    public CategoryController() {
        categoryCrud=new CategoryCrud();

    }
    public void createCategory(){
        Category category=categoryView.createCategoryView();
        categoryCrud.create(category);
    }
    public void showAllCategory(){
        categoryView.showAllCategory(categoryCrud.read());
    }
}
