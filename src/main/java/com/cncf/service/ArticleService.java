package com.cncf.service;

import com.cncf.entity.Article;

import java.util.List;

public interface ArticleService {
    boolean deleteById(int id);

    boolean insertArticle(Article article);

    String selectTitleById(int id);

    List selectByType(String type);

    boolean updateTitleById(int id,String title);

    boolean updateContentById(int id,String content);

    boolean updateArticle(Article article);
}
