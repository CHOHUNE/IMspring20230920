package com.example.im_spring20230920.domain;

import lombok.Data;

import java.util.List;

@Data
public class Mydto10 {
    private String name;
    private Integer id;
    private List<String> foods;
    private List<String> cars;
}
