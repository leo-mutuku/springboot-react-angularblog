package blog.CodewithLeo.repository;

import blog.CodewithLeo.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {
    @Override
    Optional<Post> findById(Long aLong);
}
