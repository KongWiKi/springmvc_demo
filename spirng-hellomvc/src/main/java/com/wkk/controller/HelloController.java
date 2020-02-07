package com.wkk.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Time: 20-2-7下午10:17
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class HelloController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        // 模型和视图
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "Hello Spring Web MVC");
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
