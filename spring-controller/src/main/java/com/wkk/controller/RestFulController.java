package com.wkk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Time: 20-2-9下午8:53
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
@Controller
public class RestFulController {
    // http://localhost:8080/add?a=1&b=2
    @RequestMapping("/add")
    public String test(int a , int b , Model model){
        int res = a + b;
        model.addAttribute("msg", "结果为: " + res);
        return "test";
    }

    // 使用restfull
    @RequestMapping("/commit/{p1}/{p2}")
    public String commit(@PathVariable int p1, @PathVariable int p2, Model model){
        int result = p1 + p2;
        model.addAttribute("msg", "结果为: " + result);
        return "test";

    }

}
