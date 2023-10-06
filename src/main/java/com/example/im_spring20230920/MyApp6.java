package com.example.im_spring20230920;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MyApp6 {
    public static void main(String[] args) {
        // Inversion Of Control (IOC)
        // IOC Container

        ApplicationContext context=SpringApplication.run(MyApp6.class);
//       loc container 초기화
        MyClass9 myClass9 =context.getBean("myClass9",MyClass9.class);
        myClass9.method9();

        System.out.println("myClass9 = " + myClass9);

        Object myClass10 = context.getBean("myClass10");
        System.out.println("myClass10 = " + myClass10);


    }
}

@Component
class MyClass10{
    public void method10(){
        System.out.println("MyClass10.method10");
    }
}
@Component
class MyClass9{

    private MyClass10 field1;

    public MyClass9(MyClass10 field1){

    }

    @Autowired
    public void setField1(MyClass10 field1) {
        this.field1 = field1;
    }

    public MyClass10 getField1() {
        return field1;
    }

    public void method9(){
        field1.method10();
    }
}
// Autowirde는 생성자에 붙이면 생성자 주입, 메서드에 붙이면 메서드 주입이다.

/* 스프링 빈 두개 , 9의 10 필드 값 스프링이 채워넣게 해야 메서드9가 잘 실행됨
 *  Autowirde 가 injection
 * */

//    myclass9가 10을 의존하고 있다면 = 9가 10을 필드로 가지고 있다면
