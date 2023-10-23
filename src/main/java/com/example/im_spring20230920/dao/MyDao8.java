package com.example.im_spring20230920.dao;

import com.example.im_spring20230920.domain.MyDto33Employee;
import com.example.im_spring20230920.domain.MyDto45;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;


@Mapper
public interface MyDao8 {


    @Select("""
 SELECT *
 FROM products
 WHERE ProductID=#{id}
""")
    Map<String, Object> selectProductById(Integer id);

    @Select("""
            SELECT employeeId id,
                    firstName,
                    lastName,
                    birthDate,
                    photo,
                    notes
            FROM Employees
            WHERE EmployeeId = #{id}
            """)
    MyDto33Employee selectByEmplyeeId(Integer id);

    @Select("""
SELECT ProductID id,
Price,
CategoryID category
FROM products p JOIN categories c ON p.CategoryID = c.CategoryID
WHERE ProductID=#{id}
""")
    MyDto45 selectByProductId(Integer id);

    @Select("""
            SELECT p.productId id,
                   p.price price,
                   c.categoryName category,
                   p.unit unit
            FROM products p JOIN categories c ON p.categoryId = c.CategoryId
            WHERE p.productId = #{id}
            """)
    MyDto45 selectByProductId2(Integer id);
}