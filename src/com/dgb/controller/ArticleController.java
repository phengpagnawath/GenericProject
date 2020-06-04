package com.dgb.controller;

import com.dgb.Util.Constants;
import com.dgb.model.Article;
import com.dgb.model.crud.ArticleCrud;
import com.dgb.view.ArticleView;

public class ArticleController {
    private ArticleView articleView;
    private ArticleCrud articleCrud;

    public ArticleController() {
        articleCrud = new ArticleCrud();
        articleView = new ArticleView();
    }

    public void createArticle() {
        Article article=articleView.createArticleView();
        articleCrud.create(article);

    }

    public void readAllArticles() {
        //testRead
        //System.out.println(articleCrud.read().toString());
        articleView.displayAllArticles(articleCrud.read());
    }
    public void readOneArticle(){
        int id= articleView.getArticleID();
        Article article= articleCrud.readOne(id);
        if(article!=null)
            articleView.displayOneArticle(article);
        else
            System.out.println(Constants.MSG_NOT_FOUND);
    }

    public void updateArticle(){
        int id= articleView.getArticleID();
        Article updateArticle = articleView.updateArticleView();
        if(updateArticle!=null){
            //boolean chkNull=articleCrud.update(id,updateArticle);
            if (!articleCrud.update(id,updateArticle))
                System.out.println(Constants.MSG_NOT_FOUND);
            else
                System.out.println(Constants.MSG_SUCCESS);
        }
    }
    public void deleteArticle(){
        int id= articleView.getArticleID();
        boolean chk = articleView.deleteArticleView();
        if(chk){
            //boolean chkNull=articleCrud.delete(id);
            if (!articleCrud.delete(id))
                System.out.println(Constants.MSG_NOT_FOUND);
            else
                System.out.println(Constants.MSG_SUCCESS);
        }
    }

}
