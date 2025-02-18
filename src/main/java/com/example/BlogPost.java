package com.example;

public class BlogPost {
    private final String id;
    private final String authorId;
    private final String postContent;

    private BlogPost(Builder builder) {
        this.id = builder.id;
        this.authorId = builder.authorId;
        this.postContent = builder.postContent;
    }

    // Getters
    public String getId() { return id; }
    public String getAuthorId() { return authorId; }
    public String getPostContent() { return postContent; }

    // toString
    @Override
    public String toString() {
        return "BlogPost{" +
                "id='" + id + '\'' +
                ", authorId='" + authorId + '\'' +
                ", postContent='" + postContent + '\'' +
                '}';
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlogPost blogPost = (BlogPost) o;
        return id.equals(blogPost.id);
    }

    // Builder
    public static class Builder {
        private String id;
        private String authorId;
        private String postContent;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder authorId(String authorId) {
            this.authorId = authorId;
            return this;
        }

        public Builder postContent(String postContent) {
            this.postContent = postContent;
            return this;
        }

        public BlogPost build() {
            if (id == null) throw new IllegalArgumentException("ID cannot be null");
            if (authorId == null) throw new IllegalArgumentException("Author ID cannot be null");

            return new BlogPost(this);
        }
    }
}