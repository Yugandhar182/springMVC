package com.srccodes.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SpringMVCHelloController {

    @RequestMapping("/index.jsp")
    public String printHelloWorld(Model model) {
        model.addAttribute("message", "Hello World3");

        return "helloWorld";
    }
}
