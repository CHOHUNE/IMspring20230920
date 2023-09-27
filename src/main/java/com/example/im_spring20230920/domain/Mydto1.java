package com.example.im_spring20230920.domain;

public class Mydto1 {
//    property 명 : get/set 없애고 소문자로 시작
//    만약 대문자로 시작하는 변수를 get set 을 만든다면?
//    대문자가 연속으로 있다면 그대로 씀 ( 극히 예외 )
//    참조 타입이 Boolean이라면? get/set은?
//    getMarried or isMarried 둘 중 하나로 생성


    private String name;
    private String homeAddress;
    private boolean checked;

    public boolean isChecked() {
        return checked;

    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
}
