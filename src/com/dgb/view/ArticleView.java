package com.dgb.view;

import com.dgb.Util.Constants;
import com.dgb.Util.Utils;
import com.dgb.model.Article;

import java.util.List;
import java.util.Scanner;

public class ArticleView {

    Scanner scanner=new Scanner(System.in);

    public Article createArticleView() {
        int id = Utils.inputInteger(Constants.INPUT("ID >"));
        String title = Utils.inputString(Constants.INPUT("Title >"));
        String description = Utils.inputString(Constants.INPUT("Description >"));
        return new Article(id, title, description);
    }

    public int getArticleID(){
        return Utils.inputInteger(Constants.INPUT("ID >"));
    }
    public Article updateArticleView(){
        String title = Utils.inputString(Constants.INPUT("Title >"));
        String description = Utils.inputString(Constants.INPUT("Description >"));
        return new Article(title,description);
    }
    public boolean deleteArticleView(){
        System.out.println(Constants.CONFIRM_DELETE);
        String chk =scanner.nextLine();
        if (chk.equalsIgnoreCase("y"))
            return true;
        if (chk.equalsIgnoreCase("n"))
            return false;
        System.out.println(Constants.CHOSE_WRONG_OPTION);
        deleteArticleView();
        return false;
    }
    public void displayAllArticles(List<Article> list){

        System.out.println(Constants.LINE);
        System.out.println(Constants.ARTICLE_LIST);
        System.out.println(Constants.LINE);
        for (Article article:list){
            System.out.println(article.getId()+"\t"+article.getTitle()+"\t\t"+article.getDescription());
        }
        System.out.println(Constants.LINE);

    }

    public void displayOneArticle(Article article){

        System.out.println(Constants.LINE);
        System.out.println(Constants.ARTICLE_LIST);
        System.out.println(article.getId()+"\t"+article.getTitle()+"\t\t"+article.getDescription());
        System.out.println(Constants.LINE);

    }
}
