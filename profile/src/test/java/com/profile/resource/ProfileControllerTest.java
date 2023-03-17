package com.profile.resource;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import com.profile.Profile;
import com.profile.service.ProfileRepository;
import com.profile.service.ProfileServiceAdapter;
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
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.regex.Matcher;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(ProfileController.class)
class ProfileControllerTest {
    @MockBean
    ProfileServiceAdapter profileServiceAdapter;
    @Mock
    ProfileRepository profileRepository;
    @Autowired
    MockMvc mockMvc;
    private String convertJson(Object object) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(object);
    }
    public Profile returnProfile(){
        return new Profile(1,"f","anu",22,null,null);
    }
    @Test
    void saveProfile() throws Exception {
        Mockito.when(profileServiceAdapter.saveProfile(Mockito.any())).thenReturn(returnProfile());
        RequestBuilder requestBuilder= MockMvcRequestBuilders.post("/").contentType(MediaType.APPLICATION_JSON).content(convertJson(returnProfile()));
        mockMvc.perform(requestBuilder).andExpect( jsonPath("$.id", Matchers.equalTo(1)));
    }

    @Test
    void getProfile() throws Exception {
        Mockito.when(profileServiceAdapter.saveProfile(Mockito.any())).thenReturn(returnProfile());
        RequestBuilder builder=MockMvcRequestBuilders.get("/{id}",1).accept(MediaType.ALL);
        MvcResult result=mockMvc.perform(builder).andReturn();
        int status=result.getResponse().getStatus();
        assertEquals(200, status);
    }

    @Test
    void deleteProfile() throws Exception {
       RequestBuilder builder=MockMvcRequestBuilders.delete("/{id}",1).accept(MediaType.ALL);
       MvcResult result=mockMvc.perform(builder).andReturn();
       int status=result.getResponse().getStatus();
       assertEquals(200,status);

    }
}