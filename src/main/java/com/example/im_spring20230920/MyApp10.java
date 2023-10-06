package com.example.im_spring20230920;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class MyApp10 {

}

interface MyInterface1 {

}

@Component
class MyClass18 implements MyInterface1{

}

@Component
class MyClass19 implements MyInterface1{

}
@Component
//@RequiredArgsConstructor
class MyClass17{

    private final MyInterface1 field;
    public MyClass17(@Qualifier("myClass18") MyInterface1 field){
        this.field=field;
    }

}

//    인스턴스가 들어가려면 class가 있어야 한다
//    생성자가 두개이기 때문에 어떤 생성자가 (스프링빈_인스턴스에 들어갈지 지정해준다
//    생성자를 만들어서 아래 어노테이션으로 bean을 지정 해줘야 한다.