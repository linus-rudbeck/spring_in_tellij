package se.distansakademin.spring_in_tellij.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getHomePage(){
        return "home";
    }

    @GetMapping("/custom-login")
    public String getLoginPage(){
        return "custom-login";
    }

    @GetMapping("/logged-in-only")
    public String getLoggedInPage(){
        return "logged-in-only";
    }

    @GetMapping("/anyone")
    public String getAnyonePage(){
        return "anyones";
    }

}
