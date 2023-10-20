package com.example.im_spring20230920;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class MyApp16 {
    public static void main(String[] args) {
        ApplicationContext context =SpringApplication.run(MyApp16.class,args);
        MyClass31 bean1= context.getBean("myClass31Bean",MyClass31.class);
        MyClass30 bean2= context.getBean("myClass30Bean",MyClass30.class);

        System.out.println("bean2 = " + bean2.hashCode());
        
<<<<<<< HEAD
        System.out.println("bean1 = " + bean1.hashCode()); //1
        System.out.println(bean2.getField().hashCode());//1
=======
        System.out.println("bean1 = " + bean1.hashCode());
        System.out.println(bean2.getField().hashCode());
>>>>>>> origin/master
    }
}

// (1) 이 같은 값이 나오도록 
<<<<<<< HEAD
// configuration Spring bean configuration3 작성
=======
// configuration Spring 
// bean configuration3 작성
>>>>>>> origin/master
// MyClass30, MyClass31 에 annotation 작성하지 않기
// 필요하면 생성자나 setter 작성가능 

@Configuration
class configuration3{
    
    @Bean
    public MyClass31 myClass31Bean(){
        return new MyClass31();
    }
    @Bean
    public MyClass30 myClass30Bean(){
     
        return new MyClass30(myClass31Bean());
    }
}

class MyClass31{
    
}
class MyClass30{
    private MyClass31 field;

<<<<<<< HEAD
=======


>>>>>>> origin/master
    public MyClass31 getField() {
        return field;
    }

    public MyClass30(MyClass31 field) {
        this.field = field;
    }
}