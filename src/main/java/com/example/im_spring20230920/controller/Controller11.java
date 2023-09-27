package com.example.im_spring20230920.controller;

import com.example.im_spring20230920.domain.Mydto9;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("main11")
public class Controller11 {
    @RequestMapping("sub1")
    public void method1() {
    }

    @RequestMapping("sub2")
    public void method2() {
    }

    @RequestMapping("sub3")
    public void method3() {
    }

    @RequestMapping({"sub4", "sub5", "sub6"})
    public void method4() {
    }

    @RequestMapping("sub7")
    public void method5(@RequestParam(value = "show", defaultValue = "false") Boolean show, Model model) {
        if (show) {
            List<Mydto9> list = new ArrayList<>();
            list.add(new Mydto9("son", "son", "hee", "01022346123"));
            list.add(new Mydto9("lee", "lee", "woojong", "01023556678"));
            list.add(new Mydto9("kim", "kim", "minsick", "010223345678"));
            list.add(new Mydto9("kwang", "kwang", "kimkyu", "none"));

            model.addAttribute("moving", list);
        }
    }
}
