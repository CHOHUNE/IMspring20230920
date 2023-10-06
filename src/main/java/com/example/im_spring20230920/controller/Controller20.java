package com.example.im_spring20230920.controller;

import com.example.im_spring20230920.domain.MyDto15;
import com.example.im_spring20230920.domain.MyDto16;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main20")
public class Controller20 {
    @Autowired
    private DataSource dataSource;

    @GetMapping("sub1")
    public void method() {
    }

    @GetMapping("sub2")
    public String method2(String id, Model model) throws Exception {
        String sql = """
                SELECT CustomerID, CustomerName, Address, Country
                                FROM customers
                                WHERE CustomerID=? 
                                """;

        System.out.println("sql = " + sql);
        // 쿼리 실행
        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, id);
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
        return "/main19/sub6";
    }


    @GetMapping("sub3")
    public void method3(String id) throws SQLException {
        String sql= """
                SELECT customerId, customerName, country 
                FROM customers
                WHERE customerId=? 
                """; // 특정 값이 들어가는 부분은 ? 처리
        Connection connection=dataSource.getConnection();
        PreparedStatement statement=connection.prepareStatement(sql);

        statement.setString(1,id); // 아래 실행문을 실행하기 위한 ?를 채우는 방법 중 하나

        ResultSet resultset=statement.executeQuery(); // 해당 실행문 전  ?를 채워야 한다

        try(connection;statement;resultset){
            while(resultset.next()){
                System.out.println();
                System.out.println("고객정보");
                System.out.println("id = " + resultset.getString(1));
                System.out.println("name = " + resultset.getString(2));
                //model에 담아서 view로 forward는 생략하고 바로 sout
            }
        }
    }

    // main20/sub4?pid=5
    @GetMapping("sub4")
    public void method4(Integer id) throws SQLException {
        String sql= """
                SELECT productId, productName
                FROM products
                WHERE productId=?
                """;
        Connection connection=dataSource.getConnection();
        PreparedStatement statement= connection.prepareStatement(sql);
        statement.setInt(1,id);

        ResultSet resultSet=statement.executeQuery();
        try(connection;statement;resultSet){
            while(resultSet.next()){
                System.out.println();
                System.out.println("상품 정보");
                System.out.println("상품 번호" + resultSet.getInt(1));
                System.out.println("상품명" + resultSet.getString(2));
            }
        }
    }
    @GetMapping("sub5")
    public void method5(String country) throws SQLException {
        String sql= """
                SELECT CustomerName
                FROM customers
                WHERE Country=?
                """;
//        동적인 쿼리는 ? 를 사용한다~
        Connection connection=dataSource.getConnection();
        PreparedStatement statement= connection.prepareStatement(sql);
        statement.setString(1,country);
        ResultSet resultSets=statement.executeQuery();
        try(connection;statement;resultSets){
            while(resultSets.next()){
                System.out.println();
                System.out.println("고객명"+resultSets.getString(1));
                System.out.println("국적"+resultSets.getString(2));
            }
        }
    }
@GetMapping("sub6")
    public void method6(String c1, String c2) throws SQLException {
        String sql= """
                SELECT customerName, country
                FROM customers
                WHERE country= ? OR country =? 
                """;

        Connection connection=dataSource.getConnection();
        PreparedStatement statement=connection.prepareStatement(sql);
    statement.setString(1, c1);
    statement.setString(2, c2);
    ResultSet resultSet = statement.executeQuery();
    try(connection;resultSet; statement){

        System.out.println();
        System.out.println("고객 목록");
        while(resultSet.next()) {
            String country = resultSet.getString(2);
            String name = resultSet.getString(1);
            System.out.println(country+":"+name);
        }
    }
}
@GetMapping("sub7")
public void method7(){

}
    @GetMapping("sub8")
    public String method8(Double min, Double max, Model model) throws SQLException {
        String sql = """
                SELECT productId, productName, unit, price
                FROM products
                WHERE price <= ? AND price >= ?
                """;

        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setDouble(1, max);
        statement.setDouble(2, min);

        ResultSet resultSet = statement.executeQuery();

        List<MyDto16> list = new ArrayList<>();
        try (connection; statement; resultSet) {
            while (resultSet.next()) {
                MyDto16 dto = new MyDto16();
                dto.setPid(resultSet.getInt(1));
                dto.setProductName(resultSet.getString(2));
                dto.setUnit(resultSet.getString(3));
                dto.setPrice(resultSet.getDouble(4));

                list.add(dto);
            }
        }

        model.addAttribute("productList", list);

        return "/main19/sub5";

    }

    // /main20/sub9?country=spain&country=mexico&country=uk
    /* IN 을 활용하기 위한 예제 물음표 추가를 위해 for문과 if문을 써줘야 한다 */
    @GetMapping("sub9")
    public void method09(@RequestParam List<String> countryList) throws SQLException {
        String questionMarks = "?";

        for(int i =0 ; i<countryList.size();i++){
            questionMarks+="?";
            if( i<countryList.size()-1){
                questionMarks+=", ";
            }
        }
        String sql = """
                             SELECT *
                                             
                             FROM customers
                             WHERE country IN(
                             """ +
                     questionMarks
                     + """
                             )
                             """;


        Connection connection= dataSource.getConnection();
        PreparedStatement statement=connection.prepareStatement(sql);
        for(int i=0; i<countryList.size()-1 ; i++){
            statement.setString(i+1, countryList.get(i));
        }
        ResultSet resultSet=statement.executeQuery();

        try( connection;statement;resultSet){
            while(resultSet.next()){
                String name=resultSet.getString(2);
                String country=resultSet.getString(7);

            }
        }
    }


//     국가별로 공급자 조회
    @GetMapping("sub10")
    public void method10(Model model) throws SQLException {
        String sql= """
                SELECT DISTINCT country
                FROM suppliers
                """;
        Connection connection=dataSource.getConnection();
        Statement statement= connection.createStatement();
        ResultSet resultset=statement.executeQuery(sql);
        List<String> list= new ArrayList<>();
        try(connection;statement; resultset){
            while(resultset.next()){
                list.add(resultset.getString(1));
            }
        }
        model.addAttribute("countryList",list);
    }
     @GetMapping("sub11")
    public void method11(@RequestParam("country") List<String> countryList) throws Exception{
        String questuonMark="";
        String sql= """
                SELECT *
                FROM suppliers
                WHERE country IN(
                """+
                questuonMark
                +")";

        for( int i =0 ;i<countryList.size(); i++){
             questuonMark+="?";
             if( i <countryList.size()-1) questuonMark+=",";
         }
         Connection connection=dataSource.getConnection();
         PreparedStatement statement=connection.prepareStatement(sql);
         for( int i =0; i<countryList.size();i++){
            statement.setString(i+1, countryList.get(i));
            // statement 는 1부터 시작 하기 때문에 index를 맞춰주기 위함
        }
         ResultSet resultSet=statement.executeQuery();
         try(connection; statement; resultSet){
            System.out.println(" 공 급 자 목 록 ");
            while(resultSet.next()){
                String name= resultSet.getString(2);
                String country= resultSet.getString(7);
                System.out.println(name+ " : "+country);
            }
        }
     }

     /* console에 출력 하는 예제  */
}

