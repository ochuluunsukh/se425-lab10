package edu.miu.cs.cs425.demowebapp.eregistrar.eregistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping(value = { "/", "/eregistrar", "/eregistrar/home" })
    public String displayHomepage() {
        return "public/index";
    }
}
