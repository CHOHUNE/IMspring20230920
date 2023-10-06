package com.example.im_spring20230920.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.*;
import java.util.*;

@Controller
@RequestMapping("main22")
public class Controller22 {

    @Autowired
    private DataSource dataSource;
@GetMapping("sub1")
public void method1(Integer page)throws Exception{
    String sql= """
            SELECT CustomerID id,CustomerName name
            FROM customers
            LIMIT ?,?
            """;

    Connection connection=dataSource.getConnection();
    PreparedStatement statement=connection.prepareStatement(sql);
    ResultSet resultSet=statement.executeQuery();
    statement.setInt(1,(page-1)*5);
    statement.setInt(2,5);

    try(connection;resultSet;statement) {
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name=resultSet.getString("name");
        }
    }
}



    @GetMapping("sub3")
    public void method3(@RequestParam(value = "p", defaultValue = "1") Integer page, Model model) throws Exception {

        String sql = """
                SELECT CustomerID id, CustomerName name
                FROM customers
                LIMIT ?,5
                """;
        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        statement.setInt(1, (page - 1) * 5);

        String sql1 = """
                SELECT COUNT (*)
                FROM customers
                """;
        Statement statement1 = connection.createStatement();
        ResultSet resultSet1 = statement1.executeQuery(sql1);
        int lastPageNumber = 1;
        List<Map<String, Object>> list = new ArrayList<>();
        try (connection; resultSet; statement) {
            while (resultSet1.next()) {
                int COUNTALL = resultSet1.getInt(1);
                lastPageNumber = (COUNTALL - 1) * 5 + 1;
            }
            model.addAttribute("lastPageNumber", lastPageNumber);

            while (resultSet.next()) {
                int id = resultSet.getInt("int");
                String name = resultSet.getString("name");

                list.add(Map.of("id", id, "name", name));
            }

        }

        model.addAttribute("current", page);
        int leftPageNumber = (page - 1) / 5 * 5 + 1;
        int rightPageNumber = leftPageNumber + 4;

        rightPageNumber = Math.min(rightPageNumber, lastPageNumber);
        model.addAttribute("rightPageNumber", rightPageNumber);
        model.addAttribute("leftPageNumber", leftPageNumber);
    }
}

/**/
