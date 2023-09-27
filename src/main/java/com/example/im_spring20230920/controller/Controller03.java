package com.example.im_spring20230920.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
@RequestMapping("main2")
public class Controller03 {
    //main2/sub1?address=seoul
//    파라메터 네임 = 파라메터 벨류 :
//    메소드 웹 리퀘스트 파라메터에 파라메터 네임을 넣으면 벨류가 나옴
//    main/sub1? 까지는 서블릿 컨테이너 그 다음은 쿼리 스트링

    @RequestMapping("sub1")
    public void method1(WebRequest request) {
        System.out.println("Controller03.method1");
        String address = request.getParameter("address");
        System.out.println("address = " + address);
    }

    @RequestMapping("sub2")
    public void method2(WebRequest ao) {
        System.out.println("Controller03.method2");
        String address = ao.getParameter("address");
        System.out.println("Controller03.method2");
    }

    //main2/sub3?name=" "
    @RequestMapping("sub3")
    public void method3(@RequestParam("name") String name) {
        System.out.println("name =" + name);
    }

    //    main2/sub4?name=김두식&adress="마산"
    @RequestMapping("sub4")
    public void method4(@RequestParam("name") String name,
                        @RequestParam("adress") String address) {
        System.out.println("name = " + name);
        System.out.println("address = " + address);
    }

    //main2/sub5?email=yuureru@gmail.com&gender=남자&number=0109999
    @RequestMapping("sub5")
    public void method5(@RequestParam("email") String email,
                        @RequestParam("gender") String gender,
                        @RequestParam("number") String number) {
        email = "yuureru@gmail.com";
        gender = "남자";
        number = "0109999";
    }

    @RequestMapping("sub6")
    public void method6(@RequestParam("name") String name,
                        @RequestParam("age") String age) {

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        Integer a = Integer.valueOf(age);
    }

    //     /main2/sub7?name=손&age=40
    @RequestMapping("sub7")
    public void method7(@RequestParam("name") String name,
                        @RequestParam("age") Integer age) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    //    /main2/sub8?address=seoul&married=false&age==66
    @RequestMapping("sub8")
    public void method8(@RequestParam("address") String address,
                        @RequestParam("married") boolean married,
                        @RequestParam("age") Integer age) {
        address = "화성";
        married = true;
        age = 777;
    }

   /* main2/sub10?adress=seoul&age=30
    main2/sub10?adress=jeju age를 안넣어도 되는 메서드 작성
    value =
    required=false */
    @RequestMapping("sub10")
    public void method10(@RequestParam("adrress")String adress,
                         @RequestParam(value="age",required = false)Integer age){
        System.out.println("adress = " + adress);
        System.out.println("age = " + age);
    }

    /* RequestValue에 default 값 주기 */
    @RequestMapping("sub11")
    public void method11(@RequestParam(value = "age",defaultValue = "0")Integer age){
        System.out.println("age = " + age);
    }
}


// 파라메터는 String 외에 Integer 타입으로도 가능하다

/*
 파라메터에 리퀘스트 파람 어노테이션을 추가해 간단히 할수 있다
 파라메터 앞에 어노테이션 소괄호와 "" 를 쓴다.
*/

/*query string  : 사용자가 입력 데이터를 전달하는 방법
url에 미리 협의된 데이터를 파라미터를 통해 넘기는 것을 말한다

&이름=값&

  클라이언트 요청 - 경로 - 쿼리스트링 -
  (디스펜서 서블릿 : 요청을 inputstream으로 쪼개서 객체에 넣어놓음)
  컨트롤러에 전달  ( 그 객체를 잘 받으려면 컨트롤러에 파라메터에 WebRequest 타입 메서드에
  적어놓음
* */
