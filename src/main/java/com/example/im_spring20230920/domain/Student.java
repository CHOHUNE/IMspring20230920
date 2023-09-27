package com.example.im_spring20230920.domain;

public class Student {
    /*email property ( 쓰기 )
    * info proeprty ( 읽기 , 쓰기 ) -
    * getinformation 으로 작성해야 한다.
    * 메서드명 O 필드명 X
    *
    * */

    private String email;
    private String info;



    public void setEmail(String email) {
        this.email = email;
    }

    public String getInformation() {
        return info;
    }

    public void setInfomation(String info) {
        this.info = info;
    }
}
/*
* 자바 beans예제 - 기본 생성자와 get set
*  스프링beans 와 다르다.
* */
