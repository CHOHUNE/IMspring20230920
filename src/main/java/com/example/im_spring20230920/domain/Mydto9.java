package com.example.im_spring20230920.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mydto9 {
    private String id;
    private String firstName;
    private String lastName;
    private String classNamePhone;
}

/*
 웹 애플리케이션 개발
 데이터 전송 객체
*  작성 규칙
*  필드 접근 제한
*  기본 생성자 제공
*
*  Controller : 전달
*   Dto : 전달하고자 하는 데이터 캡슐화

*  Model: 데이터 비즈니스 로직 관리 모델 뷰 상호조정
* */
