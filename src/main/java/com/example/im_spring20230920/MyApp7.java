package com.example.im_spring20230920;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MyApp7 {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyApp7.class, args);
        System.out.println(context.getBean("myClass12"));
        System.out.println(context.getBean("myClass11", MyClass11.class).getDep());
    }
}
@Component
class MyClass12 {

}

@Component
class MyClass11 {
    private MyClass12 dep;

    public MyClass11() {
    }

    @Autowired // 생성자 주입
    public MyClass11(MyClass12 dep) {
        this.dep = dep;
    }

    public MyClass12 getDep() {
        return dep;
    }
}

// 생성자가 두개가 아니라 하나면 Autowirde를 생략해도 된다. 반드시 인스턴스를
// 생성 하려면 그 생성자를 써야하기 때문에 생략이 된다.