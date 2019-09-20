package com.zzy.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.util.Date;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request) {
        request.setAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));

        return "hello";
    }
}
