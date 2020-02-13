package com.wkk.web;

import com.wkk.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
        System.out.println("a() param =>" + name);
        if ("admin".equals(name)) {
            response.getWriter().print("true");
        } else {
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> users(){
        List<User> list = new ArrayList<User>();
        list.add(new User("wkk", 24, "男"));
        list.add(new User("kwk", 24, "女"));
        return list;
    }

    @RequestMapping("/a3")
    public String a3(String name, String pwd){
        String msg = "";
        if(name!=null){
            if("admin".equals(name)){
                msg = "ok";
            }else {
                msg = "用户名输入错误";
            }
        }
        if( pwd != null){
            if("111".equals(pwd)){
                msg = "ok";
            }else {
                msg = "用户密码错误";
            }
        }
        return msg;

    }
}
