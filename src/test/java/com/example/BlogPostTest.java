package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BlogPostTest {
    @Test
    void testValidBlogPost() {
        BlogPost post = new BlogPost.Builder()
                .id("456")
                .authorId("123")
                .postContent("Hello, world!")
                .build();
        assertNotNull(post);
    }

    @Test
    void testInvalidBlogPost() {
        assertThrows(IllegalArgumentException.class, () -> new BlogPost.Builder()
                .id(null)
                .authorId("123")
                .postContent("Hello, world!")
                .build());
    }
}