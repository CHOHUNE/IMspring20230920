package com.example.im_spring20230920.domain;

import lombok.*;


//@AllArgsConstructor //모든 영역을 파라메터로 받음 ( 형태에 무관 )
@NoArgsConstructor //파라메터가 없는 생성자도 필요할 때
//@RequiredArgsConstructor
/*
        필드가 fianl 이면 초기화 하는 기회가 한 번 있는데 생성자에서 한다.
final 필드일 때에는 생성자에서 받는 걸 추가한다.
*/
public class Mydto5 {
    private String name;
    private Integer age;


}
