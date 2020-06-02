package com.dgb.view;

import com.dgb.Util.Constants;
import com.dgb.Util.Utils;
import com.dgb.controller.ArticleController;

public class MainView {
    private static ArticleController articleController;

    public MainView() {
        articleController=new ArticleController();
        displayMenuOption();
    }
    public void displayMenuOption(){
        System.out.println(Constants.MENU_OPTION);
        int option=Utils.inputInteger(Constants.CHOOSE_OPTION);
        switch (option){
            case 1:
                articleController.createArticle();
                break;
            case 2:
                articleController.readAllArticles();
                break;
            case 3:
                articleController.readOneArticle();
                break;
            case 4:
                articleController.updateArticle();
                break;
            case 5:
                articleController.deleteArticle();
                break;
            case 6:
                System.out.println(Constants.GOODBYE);
                System.exit(0);
            default:
                System.out.println("Wrong Input or Function under construction!");
        }
        Utils.pressKeyEnter(Constants.PRESS_KEY_ENTER);
        displayMenuOption();
    }
}
