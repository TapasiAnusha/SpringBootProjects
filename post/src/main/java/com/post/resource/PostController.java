package com.post.resource;

import com.post.Post;
import com.post.service.PostServiceAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class PostController {
    @Autowired
    PostServiceAdapter postServiceAdapter;
    @PostMapping("/")
    public  Post savePost(
            @RequestHeader(value = "authorization", required = true) Map<String,String> authorization ,
            @RequestBody Post post){
        log.info("authorization value is"+authorization);
        return postServiceAdapter.savePost(post);
    }
    @GetMapping("/{id}")
    public Post getPost(@PathVariable int id){
        return postServiceAdapter.getPost(id);
    }
    @DeleteMapping("/{id}")
    void deletePost(@PathVariable int id){
        postServiceAdapter.deletePost(id);
    }
    @PutMapping("/{id}")
    public Post updatePost(@RequestBody Post post,@PathVariable int id){
        return postServiceAdapter.updatePost(post,id);
    }
    @GetMapping("/")
    public List<Post> getAllPost(){
        return postServiceAdapter.getAll();
    }
}
