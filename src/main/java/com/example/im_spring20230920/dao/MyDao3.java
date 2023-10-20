package com.example.im_spring20230920.dao;


import com.example.im_spring20230920.domain.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;


//mybatis 시작 태그
@Mapper
public interface MyDao3 {


    //    1행1열의 쿼리
//    select1의 type은 return받는 값으로 지정 
    @Select("""
            SELECT CustomerName FROM customers
            WHERE CustomerID=1
            """)
    String select1();


    @Select("""
            SELECT Price FROM products
            WHERE ProductID=1
            """)
    Double select2();

    @Select("""
            SELECT LastName FROM employees WHERE EmployeeID=1
            """)
    String select3();

    @Select("""
            SELECT BirthDate FROM employees WHERE EmployeeID=2
            """
    )
    LocalDate select4();

    @Select("""
            SELECT DISTINCT Country FROM customers ORDER BY 1
            """)
    List<String> select5();


    @Select("""
            SELECT BirthDate FROM employees
            """)
    List<LocalDate> select6();

    @Select("""
            SELECT Price FROM products
            """)
    List<Double> select7();


    @Select(
            """
                    SELECT CustomerID,CustomerName,Address 
                    FROM customers
                    WHERE CustomerID=1
                    """
    )
    Map<String, Object> select8();

    @Select("""
                        SELECT ProductName,Price,CategoryName  FROM products JOIN categories 
            """
    )
    Map<String, Object> select9();


    @Select("""
            SELECT EmployeeID,LastName, FirstName 
            FROM employees 
            WHERE EmployeeID = 1
            """)
    MyDto19 select10();

    @Select("""
             SELECT ProductName name, Price,CategoryName FROM products p JOIN categories c ON p.CategoryID=c.CategoryName WHERE ProductID=1
            """)
    MyDto20 select11();

    @Select("""
SELECT CustomerID id, CustomerName name, Country
FROM customers WHERE CustomerID=2
""")
    MyDto21 select12();

    @Select("""
SELECT ProductID id, ProductName name, Price FROM products WHERE CategoryID=2
ORDER BY Price
""")
    List<Map<String, Object>> select13();

    @Select("""
SELECT ProductName,price FROM products p 
JOIN orderdetails od ON p.ProductID=od.ProductID 
JOIN orders o ON od.OrderID=o.OrderID
WHERE o.OrderDate='1996-07-04' 
""")
    List<Map<String,Object>> select14();

@Select("""
SELECT ProductName,price FROM products p 
JOIN orderdetails od ON p.ProductID=od.ProductID 
JOIN orders o ON od.OrderID=o.OrderID
WHERE o.OrderDate='1996-07-04' 
""")
    List<MyDto22>select15();


@Select("""
SELECT o.OrderDate,p.ProductName,od.Quantity,p.Price,c.CategoryName
FROM orderdetails od JOIN products p ON p.ProductID=od.ProductID
JOIN orders o ON o.OrderID = od.OrderID 
JOIN categories c ON c.CategoryID=p.CategoryID
WHERE c.CategoryID=1
ORDER BY OrderDate,ProductName
""")
    List<MyDto23> select16();

@Select("""
SELECT CustomerName
FROM customers
WHERE CustomerID=100
""")
    String select17();

    @Select("""
            SELECT CustomerID
            FROM customers
            WHERE CustomerID=100
            """)
    Integer select18();

    @Select("""
SELECT CustomerID id,CustomerName name, Country
FROM customers
WHERE CustomerID=1
""")
    MyDto24 select19();


    @Select("""
SELECT CustomerID id,CustomerName name, Country
FROM customers
WHERE CustomerID=1
""")
    MyDto24 select20();
}






/* 여러행이 나오니까 List<String> 으로 받는다
 *  Mybatis가 List로 알아서 받아준다. */


// 리턴 받을 값에 타입명 꼭 명시하기!
//
// SQL 타입명과 JAVA 타입명
/*
 * VARCHAR String
 * dec  INTEGER
 *
 * */