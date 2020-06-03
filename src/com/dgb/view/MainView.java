package com.dgb.view;

import com.dgb.Main;
import com.dgb.Util.Constants;
import com.dgb.Util.Utils;
import com.dgb.controller.ArticleController;
import com.dgb.controller.CategoryController;

public class MainView {
    private static ArticleController articleController;
    private static CategoryController categoryController;

    public MainView() {
        articleController=new ArticleController();
        categoryController=new CategoryController();
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
                displayCategoryMenu();
                break;
            case 7:
                System.out.println(Constants.GOODBYE);
                System.exit(0);
            default:
                System.out.println("Wrong Input or Function under construction!");
        }
        Utils.pressKeyEnter(Constants.PRESS_KEY_ENTER);
        displayMenuOption();
    }
    public void displayCategoryMenu() {
        System.out.println(Constants.CATEGORY_MENU_OPTION);
        int choice=Utils.inputInteger(Constants.CHOOSE_OPTION);
        switch (choice){
            case 1:{
                categoryController.createCategory();
                break;
            }
            case 2:{
                categoryController.showAllCategory();
                break;
            }
            case 5:
                String[] strings=new String[]{};
                Main.main(strings);
            default:
                System.out.println(Constants.CHOSE_WRONG_OPTION);
        }
        Utils.pressKeyEnter(Constants.PRESS_KEY_ENTER);
        displayCategoryMenu();

    }
}
