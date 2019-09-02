package com.FirstSpringBootProject.auth.service;

import com.FirstSpringBootProject.auth.model.Post;


import java.util.List;

public interface PostService {
    void deleteByPost(String post);

    Iterable<Post> getPosts();
    List<String> getPost();
    void save(Post post);

}