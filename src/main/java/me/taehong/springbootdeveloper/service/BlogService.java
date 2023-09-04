package me.taehong.springbootdeveloper.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import me.taehong.springbootdeveloper.domain.Article;
import me.taehong.springbootdeveloper.dto.AddArticleRequest;
import me.taehong.springbootdeveloper.dto.UpdateArticleRequest;
import me.taehong.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor        //final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service                        //빈으로 등록
public class BlogService {

    private final BlogRepository blogRepository;


    //블로그 글 추가 매서드
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
    public List<Article> findAll() {
        return blogRepository.findAll();
    }

    public Article findById(long id) {
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found : " + id));
    }
    public void delete(long id) {
        blogRepository.deleteById(id);
    }

    @Transactional  //하나의 트랜잭션 으로 묶는역활
    public Article update(long id, UpdateArticleRequest request){
        Article article = blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found:" + id));

        article.update(request.getTitle(), request.getContent());

        return article;
    }
}
