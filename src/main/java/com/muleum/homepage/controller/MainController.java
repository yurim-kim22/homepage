package com.muleum.homepage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("main")
    public String main(Model model) {

        model.addAttribute("data", "22");

        return "main";
    }



}
