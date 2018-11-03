package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class HomeController {

    @GetMapping("/")
    public String findUid(HttpSession session) {
        return session.getId();
    }

}
