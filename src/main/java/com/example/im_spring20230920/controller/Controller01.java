package com.example.im_spring20230920.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller01 {
    @RequestMapping("/")
    public void method1(){
        System.out.println("Controller01.method1");
    }

    @RequestMapping("/path1")
    public void method2(){
        System.out.println("Controller01.method2");
    }
    @RequestMapping("/path2")
    public void method3(){
        System.out.println("컨트롤러메소드path2");
    }
}

// Client -> Server :
// 경로에 따라 작동할 메서드를 할당하는 법
// RequstMapping 파라메터로 입력된 경로에 해당하는 주소로 요청이 왔을 때 아래 메서드를 실행함
