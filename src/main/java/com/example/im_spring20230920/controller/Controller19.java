package com.example.im_spring20230920.controller;

import com.example.im_spring20230920.domain.MyDto15;
import com.example.im_spring20230920.domain.MyDto16;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main19")
public class Controller19 {

    @Autowired
    private DataSource dataSource;


    @GetMapping("sub1")
    public String method1(Model model) throws SQLException{
        String sql= """
                SELECT customerNAME
                FROM customers
                WHERE customerID=3
                """;
       Connection connection= dataSource.getConnection();
       Statement statement=connection.createStatement();
       ResultSet resultSet= statement.executeQuery(sql);

       try ( connection; statement; resultSet){
           resultSet.next();
           String name= resultSet.getString(1);
           model.addAttribute("customerName",name);
       }
       return "/main18/sub1";
    }

    /*
    * 커넥션= 데이터 소스에 연결 얻기
    * 스테이츠먼츠 = 커넥션을 매개로 스테이츠먼츠로 sql 실행 하기위한 메서드
    * 리절트셋 = 스테이츠먼트.쿼리실행

     */
@GetMapping("sub2")
public void method2(Model model) throws Exception{
    String sql= """
            SELECT *
          
            FROM shippers
            """;
    Connection connection= dataSource.getConnection();
    Statement statement=connection.createStatement();
    ResultSet resultSet=statement.executeQuery(sql);
    try(connection; statement ; resultSet){
        boolean next1= resultSet.next();
        resultSet.getString(1);
        resultSet.getString(2);
        resultSet.getString(3);

        boolean next2=resultSet.next();
        resultSet.getString(1);
        resultSet.getString(2);
        resultSet.getString(3);


    }
}

    @GetMapping("sub3")
    public void method3(Model model) throws SQLException {
        List<Map<String, String>> list = new ArrayList<>();

        String sql = """
                SELECT * 
                FROM shippers
                """;

        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                Map<String, String> map = new HashMap<>();
                map.put("id", resultSet.getString(1));
                map.put("name", resultSet.getString(2));
                map.put("phone", resultSet.getString(3));

                list.add(map);
            }
        }

        model.addAttribute("shippers", list);
    }


/* 메서드에 model 넣고 map(String,String) 객체로 받는 List생성한다음
* 커넥션, 스테이츠먼트 , 리절트셋 생성 후
* try 문으로 위 3개 넣은 다음 안에서 Map 생성 후 Map에다 put  while문 안에 가두고
* map list에 add 후 model*/

@GetMapping("sub4")
public void method( Model model ) throws SQLException{
    List<Map<String,String>>list=new ArrayList<>();
    String sql= """
SELECT *
FROM shippers
""";
    Connection connection= dataSource.getConnection();
    Statement statement=connection.createStatement();
    ResultSet resultSet = statement.executeQuery(sql);

    try(connection; statement; resultSet){
        while(resultSet.next()){
            Map<String,String> map= new HashMap<>();
            map.put("id",resultSet.getString(1));
            map.put("name",resultSet.getString(2));
            map.put("phone",resultSet.getString(3));

            list.add(map);

        }
    }
    model.addAttribute("customers",list);
}

    @GetMapping("sub5")
    public void method5(Model model) throws SQLException {
        String sql= """
SELECT ProductID,ProductName,Unit,Price
FROM products
""";
        Connection connection =dataSource.getConnection();
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);

        List<Map<String,String>> list = new ArrayList<>();
                try(connection; statement; resultSet){
                    while(resultSet.next()){
                        Map<String,String> map=new HashMap<>();
                        map.put("id",resultSet.getString(1));
                        map.put("name",resultSet.getString(2));
                        map.put("unit",resultSet.getString(3));
                        map.put("price",resultSet.getString(4));
                        list.add(map);
                    }// getString 형식인 이유는 번호가 번호 column이 대부분 문자이기 때문
//                    코드 직접 작성
                }
                model.addAttribute("products",list);
                // 코드 직접 작성
    }
    @GetMapping("sub6")
    public void method6(Model model) throws SQLException {
        String sql = """
                SELECT CustomerID, CustomerName, Address, Country
                FROM customers
                """;

        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        List<MyDto15> list = new ArrayList<>();
        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                MyDto15 dto = new MyDto15();
                dto.setId(resultSet.getInt(1));
                dto.setName(resultSet.getString(2));
                dto.setAddress(resultSet.getString(3));
                dto.setCountry(resultSet.getString(4));

                list.add(dto);
            }
        }
        model.addAttribute("customerList", list);
    }

    /* MyDto15  자바 빈즈를 객체로 받는 list 생성 후
    while 문 내에서 Mydto15 객체 생성- set
    * */
    @GetMapping("sub7")
    public String method7(Model model) throws SQLException {
        String sql = """
                SELECT ProductID, ProductName, Unit, Price
                FROM products
                """;

        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        List<MyDto16> list = new ArrayList<>();
        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                MyDto16 row = new MyDto16();
                row.setPid(resultSet.getInt(1));
                row.setProductName(resultSet.getString(2));
                row.setUnit(resultSet.getString(3));
                row.setPrice(resultSet.getDouble(4));

                list.add(row);
            }
        }

        model.addAttribute("productList", list);

        return "/main19/sub5";

    }
    @GetMapping("sub8")
    public void method8(){
        //jsp로 forward
    }
    @GetMapping("sub9")
    public String method9(Integer pid, Model model) throws SQLException {
        // 쿼리 작성
        String sql = """
                SELECT ProductID, ProductName, Unit, Price
                FROM products
                WHERE ProductID = 
                """;
        sql += pid;

        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        List<MyDto16> list = new ArrayList<>();

        // 쿼리 실행
        ResultSet resultSet = statement.executeQuery(sql);
        try (connection; statement; resultSet) {
            // 실행 결과 처리
            while (resultSet.next()) {
                MyDto16 dto = new MyDto16();
                dto.setPid(resultSet.getInt(1));
                dto.setProductName(resultSet.getString(2));
                dto.setUnit(resultSet.getString(3));
                dto.setPrice(resultSet.getDouble(4));

                list.add(dto);
            }

        }
        // 처리한 결과 모델에 넣기
        model.addAttribute("productList", list);
        // 적절한 view로 포워드
        return "/main19/sub5";
    }


    @GetMapping("sub10")
    public void method10(){

    }
    @GetMapping("sub11")
    public String method11(Integer cid,Model model) throws SQLException {
        // 쿼리 작성 ( method6 참고)
        String sql= """
                SELECT CustomerID, CustomerName, Address, Country
                                FROM customers
                                WHERE CustomerID= 
                                """ + cid;

        Connection connection= dataSource.getConnection();
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);
        // 쿼리 실행
        List<MyDto15> list=new ArrayList<>();
        try(connection;statement;resultSet){
            while(resultSet.next()){
                MyDto15 dto=new MyDto15();
                dto.setId(resultSet.getInt(1));
                dto.setName(resultSet.getString(2));
                dto.setAddress(resultSet.getString(3));
                dto.setCountry(resultSet.getString(4));

                list.add(dto);
            }
        }
        model.addAttribute("customerList",list); // attributename sub6 html 과 일치 시켜준다
        // 실행 결과 처리 (method6 참고) , Mydto 사용
        // 처리한 결과 model에 attribute로 넣고
        // view 로 forward
        return "/main19/sub6"; // 어제 만든 예제 재활용
    }
    @GetMapping("sub12")
    public void method12(Model model)throws Exception{
        String sql= """
                SELECT DISTINCT country
                FROM customers
                """;
        Connection connection=dataSource.getConnection();
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);

        List<String> list=new ArrayList<>();
        try(connection;statement;resultSet){
            while( resultSet.next()){
                String country=resultSet.getString(1);
                list.add(country);
            }

        }
        model.addAttribute("countryList",list);
    }
    @GetMapping("sub13")
    public String method13(String country, Model model) throws SQLException {
        String sql = """
                SELECT CustomerID, CustomerName, Address, Country
                FROM customers
                WHERE Country = '""" + country + "'";

        // 쿼리 실행
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        List<MyDto15> list = new ArrayList<>();

        try (connection; statement; resultSet) {

            // 실행 결과 처리 (method6 참고, MyDto15 사용)
            while (resultSet.next()) {
                MyDto15 dto = new MyDto15();
                dto.setId(resultSet.getInt(1));
                dto.setName(resultSet.getString(2));
                dto.setAddress(resultSet.getString(3));
                dto.setCountry(resultSet.getString(4));

                list.add(dto);
            }
        }
        // 처리한 결과 model에 attribute로 넣고
        model.addAttribute("customerList", list);

        // view 로 forward
        return "/main19/sub6";
    }

    }

/* 일괄적으로 자바빈즈에 저장 후 list에 add 후 model에 addattribute */

/* ResultSet : interface type :
주요 메소드는 getArray, Cursor가 있음  (현재 행 : current row): 첫 커서는 첫 행 직전
현재 위치에서 한 행 다음으로 옮겨라 : next() : boolean 타입 : 옮겨야 할 다른 행이 있으면 true

* database 형식을 table 형식으로 취합한 것 : 행을 옮겨다니는 메소드, column을 옮기는 메서드가 있음
*
* */