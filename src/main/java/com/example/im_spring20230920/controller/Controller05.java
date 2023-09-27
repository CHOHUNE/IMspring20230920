package com.example.im_spring20230920.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("main5")
public class Controller05 {

    //    main5/sub1?name=lee&age=33&address=paris
    @RequestMapping("sub1")
    public void method1(String name, Integer age, String address) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("address = " + address);
    }

    @RequestMapping(value = "sub2", params = {"adress", "age"}, consumes = "application/json") //adress 파라매터가 있을 때에만 작동
    public void method2(String name, Integer age, String adress) {
    }
//  @RequestParam 을 쓰지 않고 String address 가 없으면 실행되지 않게 만들기
    // params는 스트링 배열 타입이므로 여러개를 적용 가능


    //    /main5/sub2?name=lee&age=44&address=paris
    @RequestMapping("sub3")
    public void method3(String name, Integer age, String address) {
        Person5 o1 = new Person5();
        o1.setName(name);
        o1.setAge(age);
        o1.setAddress(address);
//        service.action(o1);
    }
    /* 위 처럼 객체에 할당해서 스는 경우도 있다.
        하지만 스프링이 해줄 수 있다.
    * */

    @RequestMapping("sub4")
    public void method4(Person5 person5) {
        // Person5 객체를 만들면 알아서 객체 안의 get set 메서드들을 넣어준다

        //main5/sub3?name=lee&age=44&adress=paris ( 동일 )
    }

// /main5/sub4?email=ab@gmail.com&married=true&age=33&info=programmer
//    4개의 리퀘스트 파라메터를 받는 쿼리스트링 만들기
//    Student5는 4개의 리퀘스트를 모두 담는 메서드를 포함

//    메서드명이 쿼리스트링이랑 동일 해야 하고 필드명은 상이해도 작동한다
//     그 안의 변수는 달라도 O 포장지인 메서드 명은 똑같게
//     메서드명을 property라고 한다.
    @RequestMapping("sub6")
    public void method5(Student5 student){
        System.out.println("student = " + student);
    }
    class Student5{
        private String email;
        private String info;
        private Boolean married;
        private Integer age;

        @Override
        public String toString() {
            return "Student5{" +
                    "email='" + email + '\'' +
                    ", info='" + info + '\'' +
                    ", married=" + married +
                    ", age=" + age +
                    '}';
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public Boolean getMarried() {
            return married;
        }

        public void setMarried(Boolean married) {
            this.married = married;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }


class Person5{
    private String name;
    private Integer age;
    private String address;

        @Override
        public String toString() {
            return "Person5{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

}

