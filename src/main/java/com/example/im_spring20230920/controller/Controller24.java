package com.example.im_spring20230920.controller;

import com.example.im_spring20230920.domain.MyDto16;
import com.example.im_spring20230920.domain.MyDto17;
import com.example.im_spring20230920.domain.MyDto18;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import javax.xml.transform.Result;
import java.sql.*;
import java.util.function.Supplier;

@Controller
@RequestMapping("main24")
public class Controller24 {

    @Autowired
    private DataSource dataSource;

    @GetMapping("sub1")
    public void method1() throws SQLException {
        String sql = """
                INSERT INTO products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price)
                VALUE (?,?,?,?,?)
                """;
        /* ID 는 자동으로 들어가서 ?는 6개가 아니라 5개만 넣어도 충분하다 */

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

        try (connection; statement) {
            statement.setString(1, "돈까스");
            statement.setInt(2, 3);
            statement.setInt(3, 4);
            statement.setString(4, "한 장");
            statement.setDouble(5, 500.00);
            /* 타입을 맞춰서 넣어준다 */

            statement.executeUpdate();
            /* 핵심 업데이트 쿼리*/

            int count = statement.executeUpdate();

            if (count == 1) {
                System.out.println("잘 작동");
            } else {
                System.out.println("작동X");
            }
        }
    }

    // main24/sub2 로 요청시
    //suppliers 테이블에 하나의 레코드 추가하는 메소드 작성하기
    @PostMapping("sub2")
    public void method2(MyDto17 supplier) throws SQLException{
/* 아래 처럼 번잡해질 때엔 bean을 쓴다! */
 /*   public void method2(@RequestParam("name1") String supplierName,@RequestParam("name2") String contactName, @RequestParam("address")String address, @RequestParam("city") String city , @RequestParam("post") String postalCode) throws SQLException{*/
        String sql= """
                INSERT INTO suppliers 
                (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone)
                VALUE(?,?, ? ,?, ? ,? ,?)
                """;

        Connection connection=dataSource.getConnection();
        PreparedStatement statement=connection.prepareStatement(sql);

        try(connection;statement){
            statement.setString(1,supplier.getSupplierName());
            statement.setString(2,supplier.getContactName());
            statement.setString(3,supplier.getAddress());
            statement.setString(4,supplier.getCity());
            statement.setString(5,supplier.getPostalCode());
            statement.setString(6,supplier.getCountry());
            statement.setString(7,supplier.getPhone());

            int count =statement.executeUpdate();
            /* DML 쿼리 : insert delete update*/

        }

    }

    @GetMapping("sub3")
    public void method3(){

    }
@GetMapping("sub4")
    public void method4(){

    }

    @PostMapping("sub4")
    public void method5(MyDto18 dto18) throws SQLException {
    String sql= """
           INSERT INTO employees(LastName, FirstName, BirthDate, Photo, Notes) 
           VALUE(?,?,?,?,?);
           
            """;
    Connection connection=dataSource.getConnection();
    PreparedStatement statement=connection.prepareStatement(sql);

    try(connection;statement){
        statement.setString(1,dto18.getLastName());
        statement.setString(2,dto18.getFistName());
        statement.setTimestamp(3, Timestamp.valueOf(dto18.getBirthDate().atStartOfDay()));
        statement.setString(4,dto18.getPhoto());
        statement.setString(5, dto18.getNotes());

        int count = statement.executeUpdate();
    }
    }


}
