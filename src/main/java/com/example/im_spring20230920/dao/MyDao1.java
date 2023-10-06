package com.example.im_spring20230920.dao;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@Component
@RequiredArgsConstructor
public class MyDao1 {

    private final DataSource dataSource;

    public String select(int i) throws Exception {
        String sql= """
                SELECT * FROM customers
                WHERE coustomerId=?
                """;
        Connection connection=dataSource.getConnection();
        PreparedStatement statement=connection.prepareStatement(sql);
        try(connection;statement){
            statement.setInt(1,i);
            ResultSet resultSet = statement.executeQuery();

            if(resultSet.next()){
                return resultSet.getString("customerName");

            }
        }
        return null;

    }
}
