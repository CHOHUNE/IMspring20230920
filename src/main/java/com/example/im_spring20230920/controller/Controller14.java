package com.example.im_spring20230920.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("main14")
public class Controller14 {
    @RequestMapping({"sub1","sub3"})
    public void method1(
            @RequestParam("id") String id,
            @RequestParam("password") String password
    ) {
        System.out.println("id = " + id);
        System.out.println("password = " + password);
    }

//    @RequestMapping(value = "sub2", method = RequestMethod.GET)
//@GetMapping("sub2")
    @PostMapping("sub2")
    public void method2(
            @RequestParam("id") String id,
            @RequestParam("password") String password
    ) {
        System.out.println("Controller14.method2");
        System.out.println("id = " + id);
        System.out.println("password = " + password);
    }

    @RequestMapping(value = "sub3", method = RequestMethod.POST)
    public void method3(
            @RequestParam("id") String id,
            @RequestParam("password") String password
    ) {
        System.out.println("Controller14.method3");
        System.out.println("id = " + id);
        System.out.println("password = " + password);
    }
    @RequestMapping(value="sub4",method=RequestMethod.POST )
    public void method4(
            String title,
            String content
    ){
        System.out.println("title = " + title);
        System.out.println("content = " + content);
    }

    /* 메소드 전송 방식을 달리 지정할 수 있다. */

    /*아래 어노테이션 축약 - sub5.jsp에 적절한 form 요소 코드 작성
    *  전송시 method6이 실행될 수 있게 */

//    @RequestMapping(value="sub5",method=RequestMethod.GET)
    @GetMapping (value="sub5")
    public void method5(){}
//    @RequestMapping(value="sub6",method = RequestMethod.POST)
    @PostMapping (value="sub6")
    public void method6(
            String username,String password
    ){
        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }
}
