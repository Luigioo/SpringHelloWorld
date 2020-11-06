package com.luigioo.nov04;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
public class HelloWorldController {

    @GetMapping({"/", "hello"})
    public String helloWorld(Model model, Principal principal) {
        model.addAttribute("name", principal.getName());
        return "hello-world";
    }
}
