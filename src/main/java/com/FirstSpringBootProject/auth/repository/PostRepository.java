package com.FirstSpringBootProject.auth.repository;

import com.FirstSpringBootProject.auth.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

    void deleteByPost(String post);
}