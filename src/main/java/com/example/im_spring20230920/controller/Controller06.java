package com.example.im_spring20230920.controller;

import com.example.im_spring20230920.domain.Mydto3;
import com.example.im_spring20230920.domain.Mydto4;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main6")
public class Controller06 {

    @RequestMapping("sub1")
    public void method1(Mydto3 obj){
        System.out.println("obj = " + obj);
    }

//    /main6/sub2?signed=true&email=ab@gamil.com&gender=male
    @RequestMapping("sub2")
    public void method2(Mydto4 obj){
        System.out.println("obj = " + obj);
    }
}
