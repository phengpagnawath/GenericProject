package com.dgb.view;

import com.dgb.Main;
import com.dgb.Util.Constants;
import com.dgb.Util.Utils;
import com.dgb.controller.CategoryController;
import com.dgb.model.Article;
import com.dgb.model.Category;

import java.util.List;

public class CategoryView {


    public Category createCategoryView() {
        int id = Utils.inputInteger(Constants.INPUT("ID >"));
        String name = Utils.inputString(Constants.INPUT("Name > "));
        return new Category(id, name);
    }

    public void showAllCategory(List<Category> list) {
        System.out.println(Constants.LINE);
        System.out.println(Constants.CATEGORY_LIST);
        System.out.println(Constants.LINE);
        for (Category category : list) {
            System.out.println(category.getId() + "\t" + category.getName());
        }
        System.out.println(Constants.LINE);
    }

    public int getCategoryID() {
        return Utils.inputInteger(Constants.INPUT("ID >"));
    }

    public String updateCategory() {
        return Utils.inputString(Constants.INPUT("Name >"));
    }

}
