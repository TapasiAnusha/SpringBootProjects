package com.profile.service;

import com.profile.Profile;

public interface ProfileService {
     Profile saveProfile(Profile profile);
     Profile getProfile(int id);
     void deleteProfile(int id);

}
