package com.post;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PostTest {
    Message message=new Message(1,"hi",new Date(2023-8-20));
    Post p = new Post();
    Post post=new Post(1,new Date(2023-8-20), new ArrayList<>(Arrays.asList(message)));
    @Test
    void getId() {
        assertEquals(1,post.getId());
    }
    @Test
    void getTime() {
        assertEquals(new Date(2023-8-20),post.getTime());
    }
    @Test
    void getMsg() {
        assertEquals(message,post.getMsg().get(0));
    }
    @Test
    void setId() {
        post.setId(2);
        assertEquals(2,post.getId());
    }
    @Test
    void setTime() {
        post.setTime(new Date(2023-10-19));
        assertEquals(new Date(2023-10-19),post.getTime());
    }
    @Test
    void setMsg() {
        post.setMsg(null);
        assertEquals(null,post.getMsg());
    }
    @Test
    void testNoArgsConstructor(){
        assertEquals(null,p.getMsg());
    }

}