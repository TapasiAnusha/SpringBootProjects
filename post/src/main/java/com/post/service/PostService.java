package com.post.service;

import com.post.Post;

import java.util.List;

public interface PostService {
    Post savePost(Post post);
    Post getPost(int id);
    void deletePost(int id);
    Post updatePost(Post post, int id);
    List<Post> getAll();
}

