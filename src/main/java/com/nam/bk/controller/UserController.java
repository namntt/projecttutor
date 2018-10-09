package com.nam.bk.controller;

import com.nam.bk.dto.UserDTO;
import com.nam.bk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/")
    public String listUser(Model model){
        List<UserDTO> userDTOS=userService.getAllUser();
        model.addAttribute("users",userDTOS);
        return "user/listUser";
    }
}
