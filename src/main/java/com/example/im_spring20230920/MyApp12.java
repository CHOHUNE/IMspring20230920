package com.example.im_spring20230920;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MyApp12 {

    public static void main(String[] args){
        ApplicationContext context = SpringApplication.run(MyApp12.class,args);
        Object bean = context.getBean("myclass25");
        Object bean1 = context.getBean("myclass24");
        Object bean2 = context.getBean("myclass23");
// 위 클래스 이름에 해당하는의 빈이 있어야 해서 작성해줘야 한다 + Component
        MyClass25 o1 = (MyClass25) bean;
        System.out.println(bean1.hashCode());
        System.out.println(bean2.hashCode());
        System.out.println(o1.getFiled().hashCode());
//      위3개에서 int값 출력
    }
}

interface MyInterface3 {}

@Component
class MyClass23 implements MyInterface3{}

@Component
class MyClass24 implements MyInterface3{}

@Component
@RequiredArgsConstructor
class MyClass25{
    private MyInterface3 field;
//
//    @Autowired
//    public void setField(@Qualifier("myClass23") MyInterface3 field){
//        this.field= field;
//    }
    public MyClass25(@Qualifier("myClass23")MyInterface3 field){
        this.field=field;
    }
//    두 가지 방법이 있다. Autowired 와 직접생성자 주입
//

    public MyInterface3 getFiled() {
        return field;
    }
}