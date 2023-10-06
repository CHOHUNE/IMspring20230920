package com.example.im_spring20230920.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MyDao2 {

    @Select("""
          SELECT LastName FROM employees
          WHERE EmployeeID=#{id}
            """)
    String select(Integer id);
}

// ibatis를 이용한 쿼리 작성 예제
// connection resultset 등을 할 필요 없다

