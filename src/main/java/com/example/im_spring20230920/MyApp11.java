package com.example.im_spring20230920;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

public class MyApp11 {

}


interface  MyInterface2{
public void method2();
}

class MyClass21 implements MyInterface2{
    public void method(){}

    @Override
    public void method2() {

    }
    //Override
}

@Component
class MyClass22 implements  MyInterface2 {

    public void method2(){}
}
@Component
@RequiredArgsConstructor
class MyClass20{
    private final MyInterface2 field;
    public void method20(){
        field.method2();
    }
}

// dependency 를 자유롭게 교체할 수 있다.
// 가령 MyClass20에 주입하는 클래스를 MyClass21 -> 22 로
// 변경해도 20의 코드가 수정할 필요 X