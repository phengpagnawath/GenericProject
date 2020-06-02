package com.dgb.view;

import com.dgb.Util.Utils;
import com.dgb.model.Article;

import java.util.List;
import java.util.Scanner;

public class ArticleView {

    Scanner scanner=new Scanner(System.in);

    public Article createArticleView() {
        int id = Utils.inputInteger("Input ID > ");
        String title = Utils.inputString("Input title > ");
        String description = Utils.inputString("Input Description > ");
        return new Article(id, title, description);
    }

    public int getArticleID(){
        return Utils.inputInteger("Input ID > ");
    }
    public Article updateArticleView(){
        String title = Utils.inputString("Input title > ");
        String description = Utils.inputString("Input Description > ");
        return new Article(title,description);
    }
    public boolean deleteArticleView(){
        System.out.println("Do you want to delete?(Y/N)");
        String chk =scanner.nextLine();
        if (chk.equalsIgnoreCase("y"))
            return true;
        if (chk.equalsIgnoreCase("n"))
            return false;
        System.out.println("Input wrong choice!");
        deleteArticleView();
        return false;
    }
    public void displayAllArticles(List<Article> list){

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("ID\tTitle\t\tDescription");
        System.out.println("---------------------------------------------------------------------------");
        for (Article article:list){
            System.out.println(article.getId()+"\t"+article.getTitle()+"\t\t"+article.getDescription());
        }
        System.out.println("---------------------------------------------------------------------------");

    }

    public void displayOneArticle(Article article){

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("ID\tTitle\t\tDescription");
        System.out.println(article.getId()+"\t"+article.getTitle()+"\t\t"+article.getDescription());
        System.out.println("---------------------------------------------------------------------------");

    }
}
