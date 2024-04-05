package edu.miu.cs489.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping(value = {"/", "/home","/elibrary"})
    public String homePage(Model model) {
        model.addAttribute("title", "Welcome to eLibrary Developed by CS489 Team 1");
        return "home/index";
    }
    
}
