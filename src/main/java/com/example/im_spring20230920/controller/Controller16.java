package com.example.im_spring20230920.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("main16")
public class Controller16 {

    @Autowired
    private ServletContext application;
    /* application은 ServeltContext 를 받는다 */

    @GetMapping("sub1")
    public void method1(Model model, HttpSession session) {
        model.addAttribute("modelAttr1", "추석");
        session.setAttribute("sessionAttr1", "강강술래");
        application.setAttribute("appAttr1", "보름달");

        model.addAttribute("attr1", "송편");
        session.setAttribute("attr1", "윷놀이");
        application.setAttribute("attr1", "토끼");
    }

    @GetMapping("sub2")
    public void method2(HttpSession session) {
        Object count = session.getAttribute("count");
        if (count == null) {
            session.setAttribute("count", 0);
        } else {
            Integer countInt = (Integer) count;
            countInt++;
            session.setAttribute("count", countInt);
        }
        /*  위의 요청마다 스레드로 새로 만들어 져서 실행 됨
         *   하나의 브라우저만 요청이 오기 때문에 안전
         * */
        Object appCount = application.getAttribute("count");
        if (appCount == null) {
            application.setAttribute("count", 0);
        } else {
            Integer countInt = (Integer) appCount;
            countInt++;
            application.setAttribute("count", countInt);
        }
        /* application에 있는 값은  보통 읽는 (get) 의 용도로만 쓰인다.
         *  굉장히 많은 요청이 동시에 들어오기 때문에 ( 여러 브라우저, 여러 스레드)
         *  상당히 위험요소가 있다. */
    }

    @GetMapping("sub3")
    public void method3(Model model, HttpSession session) {
        model.addAttribute("modelAttr1", "보름달");
        session.setAttribute("sessionAttr1", "송편");

        System.out.println("Controller16.method3");
    }

    /*model 은 요청 마다 만들어 지는 객체이기 때문에 3과 4는 '다른' 객체이다 */
    @GetMapping("sub4")
    public void method4(Model model, HttpSession session) {
        Object modelAttr1 = model.getAttribute("modelAttr1");
        Object sessionAttr1 = session.getAttribute("sessionAttr1");

        System.out.println("modelAttr1 = " + modelAttr1);
        System.out.println("sessionAttr1 = " + sessionAttr1);

        System.out.println("Controller16.method4");
    }

    @GetMapping("sub5")
    public String method5() {
        return "main16/sub5"; // view name : 뷰 이름이 됨
    }

    @GetMapping("sub6")
    public String method6() {

        return "redirect:/main16/sub5";
//         redirection = redirect 와 콜론 경로
//        다른 곳으로 가라는 응답 ( sub6이 아니라 sub5로 ,3xx 번대 포트 : 보통 302번 )
        /* 302번 헤더를 보고 location으로 다시 redirect */
    }

    @GetMapping("sub7")
    public String method7() {
        return "redirect:https://www.naver.com";
    }

    @GetMapping("sub8")
    public String method8(String email) {

        String processed = email + "processed";
        return "redirect:/main16/sub9?" + processed;
    }

    @GetMapping("sub9")
    public void method9(String p) {
        System.out.println("p =" + p);
    }

    @GetMapping("sub10")
    public void method10(String name, HttpSession session) {
        String processed = name + "처리 결과";
        session.setAttribute("processeValue", processed);
    }

    /* 10번으로 name 리퀘스트 파라메터를 보내면 처리결과가 processed -> session 에 들어가고
     *  11번에서 session으로 get attribute되어  리다이렉팅됨 */
    @GetMapping("sub11")
    public void method11(HttpSession session) {
        Object processedValue = session.getAttribute("processedValue");
        System.out.println("processedValue = " + processedValue);
    }

    @GetMapping("sub12")
    public String method12(String address, RedirectAttributes rttr) {
        String processed = address + "처리결과";
            rttr.addFlashAttribute("processedValue", "processed");
        return "redirect:/main16/sub13";
    }
    /* sub12 에서 처리한 결과를 sub13 에서도 쓰고 싶을 때
     * controller에 model에 담아서 건내는데 sub12 와 sub13은 서로 다른 요청이라
     * 12의 model과 13의 model은 서로 다른 요청이라 쓰임이 불가하다.
     * model.addAttribute를 해도 sub13에선 꺼낼 수가 없다.
     * 그렇다면 다른 방법으로 session을 활용하는 방법이 있는데 sub12에 요청한 값을 sub13에 꺼내는 것이 가능하다.
     * 하지만 session을 직접 꺼내 쓰는 것은 안전하지만 불안정한 면도 있어 이것을 보다 안전하게 전달 하기 위해
     * RedirectAttributes 를 사용하면 더욱 안전하게 사용 할수 있다.
     *  addFlashAttribute 를 활용한다.
     * FlashAttribute인 이유는 session에 잠깐 넣어놨다가 꺼내서 model에서 사용되므로 Flash 라고 지칭한다 */

    @GetMapping("sub13")
    public void method13(Model model) {
        Object processed = model.getAttribute("processedValue");
        System.out.println("processedValue = " + processed);
    }
/* 첫 요청은 sub14로
 보냈을 때 15로 redirect되고
* 14에 코드를 작성 main16/sub15 요청할 때 foodList라는
* attribute를 꺼낼 수 있게 코드 작성 */
    @GetMapping("sub14")
    public String method14(String[] foodList, RedirectAttributes rttr) {
//        rttr.addFlashAttribute("foodList","foodList"); 잘못 작성한 예시
        rttr.addFlashAttribute("foodList",new String[]{"탕후루","벽돌"});
        return "redirect:/main16/sub15";
    }

    @GetMapping("sub15")
    public void method15(Model model){
/*    Object foodList = model.getAttribute("foodList");
        System.out.println("foodList = " + foodList);
        이 부분은 jsp에서 출력해서 생략 가능 */

    }

    @GetMapping("sub16")
    public String method16(RedirectAttributes rttr){
        rttr.addFlashAttribute("flashAttr","모델에 붙음");
        rttr.addAttribute("attr1","쿼리스트링에 붙음");
        rttr.addAttribute("address","서울 신촌");

        /* 두 메서드의 차이 : attr1 파라메터를 주소창에 치면 attr1=쿼리스트링에+붙음 이 출력*/

        return "redirect:main16/sub17";
    }
    @GetMapping("sub17")
    public void method17(){
        System.out.println("Controller16.method17");

    }
}

/*
서로 다른 모델, 다른 리퀘스트 처리를 넘기는 법 선택지
redirect : 쿼리스트링에 붙여서 출력 sub8 9  처럼
session 이용: 동일한 모델, 동일한 리퀘스트  sub 10 11
*
* */
/* model은 안전한가? 하나의 request엔 하나의 model, thread를 생성하므로
무조건 안전
page 도 안전

요약 : page > model > session > application : 안전 / 안전 / 안전( 보통) / 위험
* */