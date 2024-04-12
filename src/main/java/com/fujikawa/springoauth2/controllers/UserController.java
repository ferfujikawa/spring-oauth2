package com.fujikawa.springoauth2.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user")
    public String showUser(
        @AuthenticationPrincipal OAuth2User principal,
        final Model model
    ) {
        model.addAttribute("userName", principal.getAttribute("name"));
        return "user";
    }
    
}
