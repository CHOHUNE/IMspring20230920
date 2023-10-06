package com.example.im_spring20230920;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
class MyApp2{
    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(MyApp2.class,args);
        Object bean1 =context.getBean("myInstance2");
        System.out.println(bean1 instanceof MyClass2);
        MyClass2 o1= (MyClass2) bean1;
        o1.method2();

      Object bean3 = context.getBean("myBean3");
        System.out.println(bean3 instanceof MyClass3);
        MyClass3 o3= (MyClass3) bean3;

        System.out.println(System.identityHashCode(context.getBean("mybean3")));
        System.out.println(System.identityHashCode(context.getBean("myInstance2")));

        MyClass2 bean22= context.getBean("myInstance",MyClass2.class);
        MyClass3 bean33=context.getBean("myBean3",MyClass3.class);

        System.out.println(System.identityHashCode(bean22));
        System.out.println(System.identityHashCode(bean33));

    }
}

@Component("myBean3")
class MyClass3{

}
@Component("myInstance22")
class MyClass2{
    public void method2(){
        System.out.println("MyClass2.method2");
    }

}

//ApplicationContext는 스프링 프레임워크에서 핵심적인 인터페이스 중 하나로,
//스프링 애플리케이션의 런타임 환경을 나타내는 객체입니다. Application
//Context는 스프링 빈(Bean)의 생성, 관리, 및 검색을 수행하는 중요한
// 역할을 합니다. 이 인터페이스는 다양한 구현체를 가지며, 스프링 애플리
// 케이션의 요구에 맞게 선택할 수 있습니다.
//
//    ApplicationContext를 사용하면 다음과 같은 주요 기능을 수행할 수 있습니다:
//        스프링 빈의 생성과 설정 관리.
//        의존성 주입(Dependency Injection)을 통한 객체 간의 관계 설정.
//        런타임 중 스프링 빈의 검색 및 호출.
//        애플리케이션 컴포넌트 간의 통합 및 상호작용.
//
////    SpringApplication은 스프링 부트(Spring Boot) 프레임워크
////    에서 제공하는 클래스로, 스프링 애플리케이션을 실행하는
////    데 사용
//
//run(Class<?> primarySource, String... args): 스프링 애플리케
//이션을 시작하는 메서드입니다. primarySource는 애플리케이션의 주
//요 설정 클래스를 나타내며, args는 명령행 인수를 나타냅니다. 스프
//링 부트 애플리케이션을 실행하려면 이 메서드를 호출해야 합니다.