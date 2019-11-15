package blog.service;

import blog.model.Blog;
import blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    Blog findbyId(int id);

    void save(Blog blog);

    void delete(int id);

    Iterable<Blog> findAllByCategory(Category category);
    Page<Blog> findAllByTitleContaining(String word, Pageable pageable);
}
