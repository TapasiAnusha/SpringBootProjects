package com.post;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MessageTest {
    Message m=new Message(); Message message=new Message(1,"hi",new Date(2023-8-20));
    @Test
    void getId() {
        assertEquals(1,message.getId());
    }
    @Test
    void getMsg() {
        assertEquals("hi",message.getMsg());
    }
    @Test
    void getTime() {
        assertEquals(new Date(2023-8-20),message.getTime());
    }
    @Test
    void setId() {
        message.setId(2);
        assertEquals(2,message.getId());
    }
    @Test
    void setMsg() {
        message.setMsg("anu");
        assertEquals("anu",message.getMsg());
    }
    @Test
    void setTime() {
        message.setTime(new Date(2023-10-19));
        assertEquals(new Date(2023-10-19),message.getTime());
    }
    @Test
    void testNoArgsConstructor(){
        assertEquals(null,m.getMsg());
    }

}