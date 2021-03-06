package com.luigioo.nov04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
public class HelloWorldController {

    @Autowired
    private TestRepo testRepo;

    @GetMapping({"/", "hello"})
    public String helloWorld(Model model, Principal principal) {
        model.addAttribute("name", principal.getName());
        return "hello-world";
    }
    @GetMapping("/act")
    public String getAct(Model model){
        testRepo.save(new Act("olala"));
        String msg = testRepo.findAll().toString();
        model.addAttribute("name", msg);
        return "hello-world";
    }
}
