package com.example.im_spring20230920.domain;

import lombok.Data;

import java.util.List;

@Data
public class MyDto44 {
    private String name;
    private String email;
    private List<String> home;
    private Double price;
    private Double weight;
    private Boolean married;

}
