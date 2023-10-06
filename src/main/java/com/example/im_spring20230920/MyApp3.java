package com.example.im_spring20230920;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;



@SpringBootApplication
public class MyApp3 {
    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(MyApp3.class,args);
        MyClass4 bean= context.getBean("mybean4",MyClass4.class);
        MyClass5 bean1= context.getBean("myClass5",MyClass5.class);

        System.out.println("bean = " + bean);
        System.out.println("bean1 = " + bean1);

        Object bean2=context.getBean("controller02");
        System.out.println("bean2=" +bean2);
        Object bean3=context.getBean("myApp3");

    }
}

@Component
class MyClass5{

}
@Component("mybean4")
class MyClass4{

}

/*이 코드는 스프링 부트 애플리케이션을 실행하고, @Component
애노테이션을 사용하여 세 가지 다른 클래스를 스프링 빈으로 정의합니다.
각 빈은 클래스 이름 또는 명시적으로 설정한 이름으로 가져올 수 있으며,
 이러한 빈을 애플리케이션 컨텍스트에서 가져와서 사용한 다음 콘솔에
 출력합니다.*/


//    @Component : 의존성 등록, 빈 주입