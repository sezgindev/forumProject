package com.FirstSpringBootProject.auth.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String baslik;

    private String post;


    @ManyToMany
    private Set<User> users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getPost() {
        return post;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }



    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
