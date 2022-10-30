package com.ajavacode.hngbackendstage1task.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ProfileController {


    @GetMapping("/profile")
    private String userInfo() {

        Profile profile = new Profile();
        return "{\"slackUsername\": " + profile.getSlackUsername() + ", " + "\"backend\": " + profile.getBackend() + ", " +
                "\"age\": " + profile.getAge() + ", " + "\"bio\": " + profile.getBio() + "}";
    }
}
