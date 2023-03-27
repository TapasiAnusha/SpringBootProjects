package com.post.resource;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.post.Post;
import com.post.service.PostRepo;
import com.post.service.PostServiceAdapter;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PostController.class)
class PostControllerTest {

    @MockBean
    PostServiceAdapter postServiceAdapter;
    @Mock
    PostRepo postRepo;
    @Autowired
    MockMvc mockMvc;
    public String convertJson(Object object) throws JsonProcessingException {
        ObjectMapper objectMapper=new ObjectMapper();
        return objectMapper.writeValueAsString(objectMapper);
    }
    public Post getPost1(){
        return new Post(1,new Date(2023-03-29),null);
    }
    @Test
    void savePost() throws Exception {
        Mockito.when(postServiceAdapter.savePost(Mockito.any())).thenReturn(getPost1());
        RequestBuilder builder= MockMvcRequestBuilders.post("/").contentType(MediaType.APPLICATION_JSON).content(convertJson(getPost1()));
        mockMvc.perform(builder).andExpect(jsonPath("$.id", Matchers.equalTo(1)));
    }
    @Test
    void getPost() throws Exception {
        Mockito.when(postServiceAdapter.getPost(1)).thenReturn(getPost1());
        RequestBuilder builder=MockMvcRequestBuilders.get("/{id}",1);
        MvcResult result=mockMvc.perform(builder).andReturn();
        int status=result.getResponse().getStatus();
        assertEquals(200,status);
    }
    @Test
    void deletePost() throws Exception {
        RequestBuilder builder=MockMvcRequestBuilders.delete("/{id}",1).accept(MediaType.ALL);
        MvcResult result=mockMvc.perform(builder).andReturn();
        int status=result.getResponse().getStatus();
        assertEquals(200,status);
    }
    @Test
    void updatePost() throws Exception {
        Mockito.when(postServiceAdapter.updatePost(getPost1(),1)).thenReturn(getPost1());
        RequestBuilder builder=MockMvcRequestBuilders.put("/{id}",1).contentType(MediaType.APPLICATION_JSON).content(convertJson(getPost1()));
        mockMvc.perform(builder).andExpect(status().isOk());
    }
    @Test
    void getAllPost() throws Exception {
        Mockito.when(postServiceAdapter.getAll()).thenReturn(new ArrayList<>(Arrays.asList(getPost1())));
        RequestBuilder builder=MockMvcRequestBuilders.get("/");
        MvcResult result=mockMvc.perform(builder).andReturn();
       int status=result.getResponse().getStatus();
        assertEquals(200,status);
    }

}