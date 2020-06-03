package com.dgb.view;

import com.dgb.Main;
import com.dgb.Util.Constants;
import com.dgb.Util.Utils;
import com.dgb.controller.CategoryController;
import com.dgb.model.Article;
import com.dgb.model.Category;

import java.util.List;

public class CategoryView {


    public Category createCategoryView(){
        int id = Utils.inputInteger("Input ID > ");
        String name = Utils.inputString("Input Name > ");
        return new Category(id,name);
    }
    public void showAllCategory(List<Category> list){
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("ID\tName");
        System.out.println("---------------------------------------------------------------------------");
        for (Category category:list){
            System.out.println(category.getId()+"\t"+category.getName());
        }
        System.out.println("---------------------------------------------------------------------------");

    }

}
