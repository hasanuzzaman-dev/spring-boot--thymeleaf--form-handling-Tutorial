package com.hasan.springbootthymeleafform.controller;

import com.hasan.springbootthymeleafform.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/register")
    public String showForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);

        List<String> professionList = Arrays.asList("Developer", "Architect", "Engineer", "Designer");
        model.addAttribute("professionList",professionList);
        return "register-form";
    }

    @PostMapping("/registerUser")
    public String registerUser(@ModelAttribute("user") User user) {
        return "userList";
    }

}
