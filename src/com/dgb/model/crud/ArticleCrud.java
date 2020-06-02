package com.dgb.model.crud;

import com.dgb.model.Article;
import com.dgb.model.DataCenter;

import java.util.List;

public class ArticleCrud implements BaseCrud<Article,Integer> {
    DataCenter<Article> dataCenter;

    public ArticleCrud() {
        dataCenter=new DataCenter<>();

        dataCenter.getData().add(new Article(1,"Java","Basic"));
        dataCenter.getData().add(new Article(2,"Math","Basic"));
        dataCenter.getData().add(new Article(3,"Khmer","Basic"));
    }

    @Override
    public void create(Article obj) {
        dataCenter.getData().add(obj);
    }

    @Override
    public List<Article> read() {
        return dataCenter.getData();
    }

    @Override
    public Article readOne(Integer id) {
        for(Article article:dataCenter.getData())
            if (id==article.getId())
                return article;
        return null;
    }

    @Override
    public boolean update(Integer id,Article newObj) {
        for(Article article:dataCenter.getData())
            if(id==article.getId()) {
                int index = dataCenter.getData().indexOf(article);
                dataCenter.getData().get(index).setTitle(newObj.getTitle());
                dataCenter.getData().get(index).setDescription(newObj.getDescription());
                return true;
            }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        for(Article article:dataCenter.getData())
            if(id==article.getId()) {
                dataCenter.getData().remove(article);
                return true;
            }
        return false;
    }
}
