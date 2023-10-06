package com.example.im_spring20230920.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Controller
@RequestMapping("main21")
public class Controller21 {

    @Autowired
    private DataSource dataSource;

    @GetMapping("sub1")
    public void method1() throws SQLException {
        String sql= """
                
                SELECT customerName,
                country
                
                FROM customers
                WHERE CustomerID <=3;
                """;

        Connection connection=dataSource.getConnection();
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);
        try(connection; resultSet;statement){
            while(resultSet.next()){
                /*String name= resultSet.getString(1);
                String country = resultSet.getString(2);
                */
                String name= resultSet.getString("customerName");
                String country = resultSet.getString("country");
                /* SELECT 절에 있는 coulmn 명으로도 getString 가능
                *  AS 를 쓸 경우 설정한 AS명으로 그대로 써줘야 한다. AS 가  Name-> customerName을 Name으로 */

                System.out.println(name +" :  "+country);

            }
        }
    }

    @GetMapping("sub2")
    public void method2() throws SQLException {
        String sql= """
                SELECT CONCAT(lastName, ' ' , firstName) AS fullName, BirthDate AS birth, NOTEs AS 'DESC' FROM employees
                """;
        Connection connection=dataSource.getConnection();
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);
        try(connection;resultSet;statement){
            while(resultSet.next()){
                String fullName= resultSet.getString("fullName");
                String birth= resultSet.getString("birth");
                String desc =resultSet.getString("DESC");
                 /* 쿼리가 변경 될수도 있기 때문에 숫자로 참조 하기 보다는 컬럼명도 참조하는 게 더 안전할 수 있따. */
                System.out.println(fullName + birth + desc);
            }
        }

    }
}
