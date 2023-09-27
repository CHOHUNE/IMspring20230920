package com.example.im_spring20230920.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main1")
public class Controller07 {

//     RequerstMapping Handler Method : 핸들러 메서드
    @RequestMapping("sub1")
    public String method1() {
        System.out.println("Controller07.method1");

        return "view1";
    }
    @RequestMapping("sub2")
    public String method2(){
        System.out.println("Controller07.method2");

        return "html2";
//        /WEB-INF/jsp/html12.jsp
    }


    @RequestMapping("sub3")
    public void method3(){
        System.out.println("Controller07.method3");
    }

    @RequestMapping("sub4")
    public String method4(){
        return "/main7/html4";
    }

    @RequestMapping("sub5")
    public void method5(){
        System.out.println("Controller07.method5");
    }

//   컨트롤러에서  뷰로 ( jsp ) 포워딩 하는 예제

//    String return : return값이 요청경로가 됨 ( 지정 해줘야 함)

//    void return :요청 경로가 view name 이됨
//    main7/sub3 ( 요청 경로 )
//    view name -> /WEB-INF/jsp/main7/sub3.jsp (view name)

}

/* controller -> view 로 forward( 전달 ) jsp로
*
* */