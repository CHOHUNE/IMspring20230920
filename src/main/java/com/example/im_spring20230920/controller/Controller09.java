package com.example.im_spring20230920.controller;


import com.example.im_spring20230920.domain.Mydto7;
import com.example.im_spring20230920.domain.Mydto8;
import com.example.im_spring20230920.domain.Mydto9;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

@Controller
@RequestMapping("main9")
public class Controller09 {

    @RequestMapping("sub1")
    public void method01(Model model) {
        model.addAttribute("attr1", "son");
        model.addAttribute("attr2", 300);
        model.addAttribute("attr3", List.of(3, 4));
        model.addAttribute("attr4", true);
        /* 배열의 경우 인스턴스 생성 후 기입 */
        model.addAttribute("attr5", new String[]{"lee", "kim"});
        var myArr1 = new String[]{"jeju", "korea", "seoul"};
        model.addAttribute("yourrArr6", myArr1);
        /* 변수에 할당해서 attribute value 파라메터에 넣는 방법도 있다. */
    }

    @RequestMapping("sub2")
    public void method02(Model model) {
        model.addAttribute("myName[0]", new String[]{"Daehun", "Cho"});
        var youremail = new String[]{"gmail", "naver", "daum"};
        model.addAttribute("yourEmail", youremail);
        model.addAttribute("herAddress", new String[]{"YongIn"});
        model.addAttribute("names", List.of("백춘", "두팔", "용식"));
        model.addAttribute("mapList",List.of("봉팔","미순","다미"));
        model.addAttribute("cities",List.of("쓰울","브싼","대그"));

        var list3= List.of("jeju","oul","busan");
    }

    @RequestMapping("sub4")
    public void metho04(Model model){
        var map1= Map.of("Key1",1,"Key2",2,"Key3",3);
        model.addAttribute("Map",map1);
        var color=Map.of("black","BLACK","red","RED","blue","BLUE");
        var cityMAP=Map.of("seoul","BTS","busan","FULLCOURSE");
        model.addAttribute("cityMap",cityMAP);
        model.addAttribute("color",color);

        var map3 = Map.of(
                "name", "두식",
                "my name", "봉석",
                "your-name", "희수"
        );
        model.addAttribute("attr3", map3);
    }

    @RequestMapping("sub5")
    public void method5(Model model){
        var map1=Map.of("phone1","iphone","phone2","galaxy");
        var map2=Map.of("korea","seoul","us","ny");
        var map3=Map.of("1st","hamburger","2nd","pizza");
        /* 숫자로 시작하는 키들은 view에서 호출시 .연산자를 사용 못하고 대괄호를 감싸야 한다. */

        model.addAttribute("phones",map1);
        model.addAttribute("country",map2);
        model.addAttribute("foods",map3);
    }

    @RequestMapping("sub6")
    public void method6(Model model){
        model.addAttribute("attr1",new Object());
        model.addAttribute("attr2",new Scanner(System.in));
        model.addAttribute("attr3",new Mydto7());
    }

    @RequestMapping("sub7")
    public void method7(Model model){
        Mydto8 o1=new Mydto8();
        o1.setFood("pizza");
        o1.setComputer("intel");
        o1.setBirthDate("2020-01-01");
        model.addAttribute("person1",o1);
    }

    @RequestMapping("sub8")
    public void method8(Model model){
        Mydto9 obj=new Mydto9();
        obj.setId("12315");
        obj.setFirstName("Cho");
        obj.setLastName("Daehun");
        obj.setClassNamePhone("01073971329");
        model.addAttribute("student",obj);
    }


    }

    /* List 도 Array와 동일하게 순서대로 들어가서 jsp에서 호출시 동일하게 대괄호 인덱스로 호출한다 */



