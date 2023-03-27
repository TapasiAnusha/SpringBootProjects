package com.post.service;

import com.post.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceAdapter implements PostService {
    @Autowired
    PostRepo postRepo;
    @Override
    public Post savePost(Post post) {
        return postRepo.save(post);
    }
    @Override
    public Post getPost(int id) {
        return postRepo.findById(id).orElse(null);
    }
    @Override
    public void deletePost(int id) {
        postRepo.deleteById(id);
    }
    @Override
    public Post updatePost(Post post, int id) {
        Post post1=postRepo.findById(id).orElse(null);
        post1.setId(post.getId());
        post1.setMsg(post.getMsg());
        post1.setTime(post.getTime());
        return postRepo.save(post1);
    }
    @Override
    public List<Post> getAll() {
        return postRepo.findAll();
    }

}
