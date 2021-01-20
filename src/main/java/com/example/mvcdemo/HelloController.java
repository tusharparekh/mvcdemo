package com.example.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/welcome")
public class HelloController {
    @GetMapping("/welcome")
    public String printHello(ModelMap model) {

        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "welcome";
    }
}
