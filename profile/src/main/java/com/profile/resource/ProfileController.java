package com.profile.resource;

import com.profile.Profile;
import com.profile.service.ProfileRepository;
import com.profile.service.ProfileServiceAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProfileController {
    @Autowired
    ProfileServiceAdapter profileServiceAdapter;
    @PostMapping("/")
    public Profile saveProfile(@RequestBody Profile profile){
        return profileServiceAdapter.saveProfile(profile);
    }
    @GetMapping("/{id}")
    public Profile getProfile(@PathVariable int id){
        return profileServiceAdapter.getProfile(id);
    }
}
