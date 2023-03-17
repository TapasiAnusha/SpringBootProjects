package com.profile.service;

import com.profile.Profile;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ProfileServiceAdapterTest {
    @Mock
    ProfileRepository profileRepository;
    @InjectMocks
    ProfileServiceAdapter profileServiceAdapter;

    @Test
    void saveProfile() {
        Mockito.when(profileRepository.save(Mockito.any())).thenReturn(new Profile(1,"f","anu",22,null,null));
        assertEquals("anu",profileServiceAdapter.saveProfile(new Profile()).getName());
        Mockito.verify(profileRepository,Mockito.times(1)).save(Mockito.any());
    }

    @Test
    void getProfile() {
        Mockito.when(profileRepository.findById(1)).thenReturn(Optional.of(new Profile(1,"f","anu",22,null,null)));
        assertEquals("f",profileServiceAdapter.getProfile(1).getGender());
        Mockito.verify(profileRepository,Mockito.times(1)).findById(Mockito.any());
    }

    @Test
    void deleteProfile() {
        profileServiceAdapter.deleteProfile(1);
        Mockito.verify(profileRepository,Mockito.times(1)).deleteById(Mockito.any());
    }
}