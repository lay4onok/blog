package ru.lauka.blog.repo;

import org.springframework.data.repository.CrudRepository;
import ru.lauka.blog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}
