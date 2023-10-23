package com.example.im_spring20230920.dao;

import com.example.im_spring20230920.domain.MyDto38;
import com.example.im_spring20230920.domain.MyDto40;
import com.example.im_spring20230920.domain.MyDto41;
import lombok.Data;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.Map;


@Mapper //mybatis
public interface MyDao7 {


@Select("""
SELECT * FROM customers
WHERE CustomerID=#{id} """)
Map<String, Object> selectByCustomId(Integer id);


@Select("""
SELECT*FROM employees
WHERE EmployeeID=2
""")
 Map<String,Object> selectByEmployeeId(Integer id);


@Select("""
INSERT INTO employees (lastName, firstName, birthDate)
VALUES (#{lastName},#{firstName},#{birthDate})
""")
     int insertEmployee(String lastName, String firstName, LocalDate birthDate);

@Insert("""
INSERT INTO products(productName, price, CategoryID)
    VALUES( #{name},#{price},#{category})
    """)
int insertProduct(String name, Double price, Integer category);

@Delete("""
DELETE FROM products
WHERE ProductID=#{pid}
""")
    int deleteByProductId(Integer pid);

@Delete("""
DELETE FROM customers
WHERE CustomerID=#{cid}
""")
    int deleteByCustomerId(Integer cid);

@Update("""
UPDATE products
SET price=#{price},
CategoryID=#{category},
ProductName=#{name}
WHERE productID=#{id}
""")
int updateProduct(MyDto40 dto);


@Update("""
UPDATE employees
SET lastName=#{LastName},
firstName=#{FirstName},
EmployeeID=#{id},
birthDate=#{BirthDate}
WHERE EmployeeID=#{id}
""")
int updateEmployees(MyDto41 dto);


}

// json 자바스크립트 문자작성 표기법을 빌려와서 씀
// 하지만 json 에서는 프로퍼티명에서도 따옴표를 써줘야 함 { "name" : "son" }
// 값 부분에 쓸 수 있는 것들 문자열,숫자,부울 , null , 객체
//


