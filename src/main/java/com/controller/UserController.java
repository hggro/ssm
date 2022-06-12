package com.controller;

import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("jhks")
public class UserController {
    @Autowired
   @Qualifier("userServiceImpl")

    private UserService userService;

    @RequestMapping("/login")
    public String   login(Model model , User user){
        return "abc";
    }
}
