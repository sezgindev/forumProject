package com.FirstSpringBootProject.auth.service;

import com.FirstSpringBootProject.auth.model.Post;
import com.FirstSpringBootProject.auth.repository.PostRepository;
import com.FirstSpringBootProject.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostRepository postRepository;

    @Override
    public Iterable<Post> getPosts() {
        return postRepository.findAll();
    }


    @Override
    public List<String> getPost() {
        List<String> post = new ArrayList<>();
        Iterator iterator = getPosts().iterator();
        while (iterator.hasNext()) {
            Post posts = (Post) iterator.next();
            post.add(posts.getPost());
        }
        return post;
    }

    @Override
    public void save(Post post) {
        post.setPost(post.getPost());
        post.setUsers(new HashSet<>(userRepository.findAll()));
        postRepository.save(post);
    }

}