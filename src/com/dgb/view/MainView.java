package com.dgb.view;

import com.dgb.Util.Constants;
import com.dgb.Util.Utils;
import com.dgb.controller.ArticleController;
import com.dgb.model.Article;

public class MainView {
    private ArticleController articleController;

    public MainView() {
        articleController=new ArticleController();
    }
    public static void displayMenuOption(){
        System.out.println(Constants.MENU_OPTION);
        int option=Utils.inputInteger(Constants.CHOOSE_OPTION);
        switch (option){
            case 1:
                System.out.println("1) Add");
                break;
            case 2:
                System.out.println("2) Show");
                break;
            default:
                System.out.println("Wrong Input or Function under construction!");
        }

        displayMenuOption();
    }
}
