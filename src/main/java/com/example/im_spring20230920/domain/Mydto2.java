package com.example.im_spring20230920.domain;

public class Mydto2 {
    //name property
    /* address property
    bitrthDate property
    signed property 논리형 외 문자열


    * */

    private String name;
    private String address;
    private String birthDate;
    private Boolean isSgined;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Boolean getSgined() {
        return isSgined;
    }

    public void setSgined(Boolean sgined) {
        isSgined = sgined;
    }
}

