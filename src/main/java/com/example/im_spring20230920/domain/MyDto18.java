package com.example.im_spring20230920.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MyDto18 {

    private String lastName;
    private String fistName;
    private String photo;
    private String notes;
    private String employeeId;
    private LocalDate BirthDate;
    private Integer id;
}
