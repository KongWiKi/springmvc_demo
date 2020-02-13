package com.wkk.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Time: 20-2-13上午9:38
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
@RestController
//@Controller
public class HelloController {
    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @RequestMapping("/hello")
    public void ajax1(String name , HttpServletResponse response) throws IOException {
        if ("admin".equals(name)) {
            response.getWriter().print("true");
        } else {
            response.getWriter().print("false");
        }
    }
}
