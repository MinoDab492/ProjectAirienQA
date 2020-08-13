package com.salifm.qa.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String getLoginPage(@RequestParam(required = false)
                                    String error, Model model) {

        model.addAttribute("err", error != null);
        return "login";
    }
}