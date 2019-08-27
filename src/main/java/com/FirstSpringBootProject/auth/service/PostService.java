package com.FirstSpringBootProject.auth.service;

import com.FirstSpringBootProject.auth.model.Post;
import com.FirstSpringBootProject.auth.model.User;

import java.util.List;

public interface PostService {

    Iterable<Post> getPosts();
    List<String> getPost();
    void save(Post post);




}