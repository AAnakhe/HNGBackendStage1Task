package com.ajavacode.hngbackendstage1task.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class ProfileController {

    @GetMapping("/profile")
    private ResponseEntity<Profile> userInfo() {
        Profile profile = new Profile();
        profile.setSlackUsername("Ajava");
        profile.setBackend(true);
        profile.setAge(28);
        profile.setBio("My name is Anakhe Ajayi, I'm learning Java everyday and I love Jesus.");

        return ResponseEntity.ok(profile);
    }
}
