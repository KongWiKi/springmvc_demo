package com.wkkk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Time: 20-2-7下午10:45
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/wtf")
    public String sayWTF(Model model){
        model.addAttribute("msg","hello Spring II");
        return "hello";
    }
}
