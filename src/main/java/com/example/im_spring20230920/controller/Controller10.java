package com.example.im_spring20230920.controller;


import com.example.im_spring20230920.domain.Mydto10;
import com.example.im_spring20230920.domain.Mydto9;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main10")
public class Controller10 {

    @RequestMapping("sub1")
    public void method1(Model model) {
        Mydto9 o1 = new Mydto9();
        Mydto9 o2 = new Mydto9();

        o1.setFirstName("son");
        o2.setFirstName("lee");

        model.addAttribute("students", List.of(o1, o2));
        model.addAttribute("studentsList", List.of("손", "민", "박"));
    }

    @RequestMapping("sub2")
    public void method2(Model model) {
        Mydto9 o1 = new Mydto9();
        Mydto9 o2 = new Mydto9();

        o1.setLastName("두식");
        o1.setLastName("두팔");
        o1.setId("곽두식");
        o2.setId("표춘팔");

        model.addAttribute("personMap", Map.of("person", o1, "person2", o2));
        model.addAttribute("pepole", Map.of("1st", o1, "2nd", o2));
    }

    @RequestMapping("sub3")
    public void method03(Model model){
        Mydto10 o1=new Mydto10();
        o1.setName("dooskik");
        o1.setId(3);
        o1.setFoods(List.of("pizza","burger","milk"));
        o1.setCars(List.of("damas","tico","golden martiz"));

        model.addAttribute("person1",o1);
    }
    @RequestMapping("sub4")
    public void method(Model model){
        model.addAttribute("myList",List.of("tesla","kia","benz"));

    }

    @RequestMapping("sub5")
    public void method5(Model model){
        model.addAttribute("foods",List.of("라면","족발","닭가슴살","썔럳"));
        model.addAttribute("names",List.of("두팔","희봉","춘식","꽃분"));
    }

    @RequestMapping("sub6")
    public void method6(Model model){
        List<Mydto9> list=new ArrayList<>();
        list.add(new Mydto9("son","as","as","asd"));
        list.add(new Mydto9("ss12so","aaas","asss","aaaaasd"));
        list.add(new Mydto9("s2123sso","aasdaas","a241s","aaaasasdasd"));
        list.add(new Mydto9("sss123o","aaasdas","a23s","aaaaaasdasdsd"));

        model.addAttribute("moving",list);
    }

    @RequestMapping("sub7")
    public void method7(Model model){
        model.addAttribute("a",3);
        model.addAttribute("b",5);

        model.addAttribute("c","8");
        model.addAttribute("d","9");
        /* 자바에서는 89가 되겠지만 EL에서는 +할 때엔 17로 변환되어서 연산된다 */
    }

    @RequestMapping("sub8")
    public void method8(Model model){
        model.addAttribute("a",3);
        model.addAttribute("b",5);

        model.addAttribute("c","spring");
        model.addAttribute("d","summer");

        model.addAttribute("e","11");
        model.addAttribute("f","2");
        model.addAttribute("g",2);

//        ${e > f } false : 같은 타입 끼리 비교 : 타입 그대로 연산
//        ${e> g} true  : 타른 타입과의 비교 : 수로 변환하려고 노력
    }

    @RequestMapping("sub9")
    public void method9(Model model){
        model.addAttribute("a","java");
        model.addAttribute("b","");

        model.addAttribute("c",List.of(3,4));
        model.addAttribute("d",List.of());

        model.addAttribute("e",Map.of("name","son"));
        model.addAttribute("f",Map.of());

        model.addAttribute("g",null);
    }
}
