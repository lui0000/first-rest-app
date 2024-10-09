package com.eliza.springweb.FirstRestApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class FirstRestController {

    @ResponseBody
    public String sayHello() {
        return "";

    }
}
