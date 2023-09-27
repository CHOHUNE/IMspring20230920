package com.example.im_spring20230920.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("main4")
public class Controller04 {

    /* RequestParam 파라메터 생략
    * ReuquestParam 명과 String 명이 같을 때 가능하다*/
    @RequestMapping("sub1")
    public void method1(@RequestParam String name){
        System.out.println("name = " + name);
    }

    // main4/sub2?adress=seoul&email=abc@gamil.com&age=44
    //   메소드 작성

    @RequestMapping("sub2")
    public void method2(@RequestParam (defaultValue = "seoul",required = false) String adress,
                        @RequestParam (defaultValue = "gamil",required = false) String mail,
                        @RequestParam (defaultValue = "21", required = false)Integer age){

        System.out.println("adress = " + adress);
        System.out.println("mail = " + mail);
        System.out.println("age = " + age);


    }

    /* RequesParam 도 생략이 가능하다
    *   아래 방식으로 적으면 required 가 true가 아니므로 공란으로 해도
    *  null으로 출력되고 정상 작동 된다 */

    @RequestMapping("sub3")
    public void method3(String name, Boolean married){
        System.out.println("name = " + name);
        System.out.println("married = " + married);
    }

//    main4/sub4?check=true&email=abc@naver.com&age=55 작성
    @RequestMapping("sub4")
    public void method4(Boolean check,String email,Integer age){
        System.out.println("check = " + check);
        System.out.println("email = " + email);
        System.out.println("age = " + age);

    }




}

/* 클래스 앞에 Controller 어노테이션 필수 */