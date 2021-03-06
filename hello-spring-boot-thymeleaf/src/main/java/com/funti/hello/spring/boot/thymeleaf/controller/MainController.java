package com.funti.hello.spring.boot.thymeleaf.controller;

import com.funti.hello.spring.boot.thymeleaf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value = {"","index"},method = RequestMethod.GET)
    public String index(Model model){
        User user=new User();
        user.setUsername("Tony");

        model.addAttribute("user",user);

        return "index";
    }

}
