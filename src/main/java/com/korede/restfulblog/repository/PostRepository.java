package com.korede.restfulblog.repository;

import com.korede.restfulblog.model.Like;
import com.korede.restfulblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository  extends JpaRepository<Post, Integer> {

    //  @Query(value = "SELECT * FROM posts WHERE  title LIKE '%keyword%' " , nativeQuery = true)
    List<Post> findByTitleContaining(String keyword);
}
