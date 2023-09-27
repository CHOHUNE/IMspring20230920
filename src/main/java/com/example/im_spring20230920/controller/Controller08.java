package com.example.im_spring20230920.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main8" +
        "")
public class Controller08 {

    @RequestMapping("sub1")
    public void method01(Model model){
//
//        model.addAllAttributes("attr1","value1");
//        model.addAllAttributes("attr2","value2");

//        <h1> ${attr1}</h1> jsp 파일에서 위 처럼 String name 을 적으면 뒤의 Object value가 나옴
//         모델에 있는 데이터를 잘 꺼내서 뷰에 전달하기 위함

        //model에 담긴 data를 attribute라고 한다.
//        forward to //WEB_INF_/jsp/main8/sub1.jsp void 이므로 매핑 어노테이션 뷰가  호출된다.
//          Model은 메서드 파라메터에 객체 생성을 하면 삽입할 수 있고 import class 는 spring framework 를 한다

    }

    @RequestMapping("sub2")
    public void method(Model model){
        model.addAttribute("propone","😁");
        model.addAttribute("propTWO","😎");
    }

    @RequestMapping("sub3")
    public void method3(Model model){
//        view name:/ main8/sub3
//        WEB_INF

        model.addAttribute("myName","HUNE");
        model.addAttribute("yourAddress", List.of(5,4));
        model.addAttribute("herEmail", Map.of("2","5"));

        /* attritbuteValue는 Obeject 가 파라메터 이므로 Map, List 등이 모두 올수 있다. */
    }

}
