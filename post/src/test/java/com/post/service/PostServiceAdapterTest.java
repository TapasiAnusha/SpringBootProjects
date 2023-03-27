package com.post.service;

import com.post.Post;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PostServiceAdapterTest {
    @InjectMocks
    PostServiceAdapter postServiceAdapter;
    @Mock
    PostRepo postRepo;
    @Test
    void savePost() {
        Mockito.when(postRepo.save(Mockito.any())).thenReturn(new Post(1,new Date(2023-03-29),null));
        assertEquals(1,postServiceAdapter.savePost(new Post()).getId());
        Mockito.verify(postRepo,Mockito.times(1)).save(Mockito.any());
    }
    @Test
    void getPost() {
        Mockito.when(postRepo.findById(1)).thenReturn(Optional.of(new Post(1,new Date(2023-03-29),null)));
        assertEquals(1,postServiceAdapter.getPost(1).getId());
        Mockito.verify(postRepo,Mockito.times(1)).findById(1);
    }
    @Test
    void deletePost() {
        postServiceAdapter.deletePost(1);
        Mockito.verify(postRepo,Mockito.times(1)).deleteById(1);
    }
    @Test
    void updatePost() {
        Post post=new Post(1,new Date(2023-03-29),null);
        Mockito.when(postRepo.save(Mockito.any())).thenReturn(post);
        Mockito.when(postRepo.findById(1)).thenReturn(Optional.of(post));
        assertEquals(1,postServiceAdapter.updatePost(post,1).getId());
        assertEquals(new Date(2023-03-29),postServiceAdapter.updatePost(post,1).getTime());
        assertEquals(null,postServiceAdapter.updatePost(post,1).getMsg());
        Mockito.verify(postRepo,Mockito.times(3)).save(Mockito.any());
        Mockito.verify(postRepo,Mockito.times(3)).findById(1);
    }
    @Test
    void getAll() {
        Mockito.when(postRepo.findAll()).thenReturn(new ArrayList<>(Arrays.asList(new Post(1,new Date(2023-03-29),null))));
        assertEquals(1,postServiceAdapter.getAll().get(0).getId());
    }
}