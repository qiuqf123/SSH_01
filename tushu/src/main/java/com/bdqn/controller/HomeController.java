package com.bdqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping({"/","/list.html"})
    public String list(){
        return "list";
    }

    @RequestMapping("/add")
    public String add(){
        return "add";
    }
    @RequestMapping("/update")
    public String update(Integer id, Model model){
        model.addAttribute("id",id);
        return "update";
    }

}
