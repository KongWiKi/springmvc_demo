package com.wkk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Time: 20-2-9下午8:05
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
@Controller
@RequestMapping("/hello")
public class HeiController {
    @RequestMapping("/wtf")
    public String sayWTF(Model model){
        model.addAttribute("msg","anno");
        return "hello";
    }
}
