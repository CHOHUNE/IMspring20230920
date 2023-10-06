package com.example.im_spring20230920;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class MyApp14 {
    public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(MyApp14.class,args);
        Object bean1= context.getBean("myBean1");
        System.out.println("bean1 =" + bean1);

        Object bean2 = context.getBean("myBean2");
        System.out.println("bean2 =" + bean2);

        Configuration1 conf =context.getBean("cofiguration1",Configuration1.class);
//        두번째 파라메터를 쓰면 자동형변환된다.
        MyClass27 obj1= conf.myBean1();
        MyClass27 obj2= conf.myBean2();
//         위 두개는 재정의된 메소드
//         configuration 어노테이션을 쓰면 같은객체가 실행되는 걸 보장되게
//         해당 클래스의 하위타입을 만들고- 메서드를 재정의한다 (싱글톤패턴) 재실행시 같은 객체 보장

        System.out.println("obj1 = " + obj1);
        System.out.println("obj2 = " + obj2);
    }
}

// 내가 작성한 클래스가 아니어서 클래스에 componet를 추가할 수 없어
// bean을 추가할 수 없을 때

//Configuration 클래스 ( 빈 )- componenet를 포함해서- bean으로 슬수 있다
// context로 getbean을 쓸수도 있다.
// spring bean을 만드는 메소드를 가진 클래스


@Configuration
class Configuration1{

//    빈을 만드는 메소드
//     bean의 이름은 메소드명과 같음
    @Bean
    public MyClass27 myBean1(){
        return new MyClass27();
    }
    @Bean
    public MyClass27 myBean2(){
        return new MyClass27();
    }
}

// @Component // 빈의 이름이 클래스 이름을 lowerCamelCase로 바꾼것
class MyClass27{

}