package br.com.simple.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagesController {

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

}


