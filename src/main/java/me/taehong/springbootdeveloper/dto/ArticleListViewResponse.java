package me.taehong.springbootdeveloper.dto;

import lombok.Getter;
import me.taehong.springbootdeveloper.domain.Article;

@Getter
public class ArticleListViewResponse {          //view 에게 데이터 를 전달 하기 위한 객체

    private final Long id;
    private final String title;
    private final String content;

    public ArticleListViewResponse(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}