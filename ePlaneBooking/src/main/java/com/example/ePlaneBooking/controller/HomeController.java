package com.example.ePlaneBooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(final Model model) {
        model.addAttribute("isSignedIn", false);
        return "page/home/home";
    }

    @GetMapping("/ok")
    public String homeok(final Model model) {
        model.addAttribute("isSignedIn", true);
        return "page/home/home";
    }
}
