package com.dgb.controller;

import com.dgb.Util.Constants;
import com.dgb.model.Category;
import com.dgb.model.crud.CategoryCrud;
import com.dgb.view.CategoryView;
import com.dgb.view.MainView;

import java.util.SortedMap;

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

    public void updateCategory(){
        int id=categoryView.getCategoryID();
        String name =categoryView.updateCategory();
        boolean chk=categoryCrud.update(id,new Category(name));
        if (chk){
            System.out.println(Constants.MSG_SUCCESS);
        }else
            System.out.println(Constants.MSG_NOT_FOUND);
    }
    public void deleteCategory(){
        int id=categoryView.getCategoryID();
        boolean chk=categoryCrud.delete(id);
        if (chk)
            System.out.println(Constants.MSG_SUCCESS);
        else
            System.out.println(Constants.MSG_NOT_FOUND);
    }
}
