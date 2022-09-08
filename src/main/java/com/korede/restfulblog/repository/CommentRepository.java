package com.korede.restfulblog.repository;

import com.korede.restfulblog.model.Comment;
import com.korede.restfulblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

    List<Comment> findByCommentContaining(String keyword);
}
