package com.example.im_spring20230920.domain;

public class MyDto35 {
    private String id;
    private String uRL; // rombok에 의해서는 URL
    public String getId(){
        return id;
    }

//
    // 일반적인 프로퍼티명 생기는 원리
    // 프로퍼티명은 앞의 get set 을 탈락 시키고 맨앞 글자를 소문자 프로퍼티
    // 하지만 URL 처럼 연속해서 대문자이면 그냥 대문자로 프로퍼티
    // 하지만 롬복은 대문자 프로퍼티
}
