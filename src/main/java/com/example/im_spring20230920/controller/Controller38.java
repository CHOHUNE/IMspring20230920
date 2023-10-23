package com.example.im_spring20230920.controller;

import com.example.im_spring20230920.dao.MyDao8;
import com.example.im_spring20230920.domain.MyDto45;
import com.example.im_spring20230920.domain.MyDto33Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main38")
public class Controller38 {

//    axios.get("main
private MyDao8 dao;

@GetMapping("sub0")
public void method(){

}

    @GetMapping("sub1")
    @ResponseBody  //view로 해석 하지 말고 응답이 본문이 되는 것
    public String method1() {
        return "/main38/sub";
    }

    @GetMapping("sub2")
    @ResponseBody
    public String method2() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "hello world";
    }

    /*

    axios.get("/main38/sub3")
     */
    @GetMapping("sub3")
    @ResponseBody
    public Map<String, Object> method3() {
        return Map.of("name", "son", "age", 30);
    } // {"name":"son","age",30}


 /*
    axios.get("/main38/sub4")
     */
    @GetMapping("sub4")
    @ResponseBody
    public Map<String, Object> method4() {
//         {"city":"seoul","price":3000,
//         "list":["son","lee","kim],
//         "birth" : "1999-03-03"
//         }

        return Map.of("city", "seoul", "price", 3000,
                "list", List.of("son", "lee", "kim"),
                "birth", "1999-03-03"
        );
    }




//    axios.get("/main38/sub5?id=8"
    @ResponseBody
    @GetMapping("sub5")
    public Map<String,Object>method5(Integer id){
        return dao.selectProductById(id);
    }


    @GetMapping("sub6")
    @ResponseBody
    public MyDto33Employee method6(Integer id){
        return dao.selectByEmplyeeId(id);
    }

// axios.get("/main38/sub7?id=33")
//     33번 상품의 정보를 json으로 응답
//     id ( 상품 아이디 )
//     price ( 상품 가격 )
//     category ( 카테고리명 )
//     unit ( 단위 ) - 이상 4개의 정보가 json으로 응답될 수 있도록 8번째 메서드와 45번째 dto 작성
//      dao.selectByProductId2
    @GetMapping("sub7")
    @ResponseBody
    public MyDto45 method7(Integer id){
        return dao.selectByProductId(id);
    }


}
