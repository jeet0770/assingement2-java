package com.example;

import java.util.List;

public class Blog {
    private final List<BlogPost> posts;
    private final List<Person> contributors;

    public Blog(List<BlogPost> posts, List<Person> contributors) {
        this.posts = posts;
        this.contributors = contributors;
    }

    // Getters
    public List<BlogPost> getPosts() { return posts; }
    public List<Person> getContributors() { return contributors; }

    // toString
    @Override
    public String toString() {
        return "Blog{" +
                "posts=" + posts +
                ", contributors=" + contributors +
                '}';
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blog blog = (Blog) o;
        return posts.equals(blog.posts) && contributors.equals(blog.contributors);
    }
}