package com.profile.service;

import com.profile.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceAdapter implements ProfileService{
    @Autowired
    ProfileRepository profileRepository;
    @Override
    public Profile saveProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    public Profile getProfile(int id) {
        return profileRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteProfile(int id) {
         profileRepository.deleteById(id);
    }


}
