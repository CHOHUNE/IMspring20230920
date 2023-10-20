package com.example.im_spring20230920.controller;

import com.example.im_spring20230920.dao.MyDao3;
import com.example.im_spring20230920.domain.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;


@Controller
@RequiredArgsConstructor
@RequestMapping("main29")
public class Controller29 {
    private final MyDao3 dao3;


    @GetMapping("sub1")
    public void method1(){
        String name= dao3.select1();
        System.out.println("name = " + name);
    }

    @GetMapping("sub2")
    public void method2(){
        dao3.select2();
        System.out.println("dao3 = " + dao3);
    }

    @GetMapping("sub3")
    public void method3(){
//        1번직원의 LastName 조회 후 출력 하기
        dao3.select3();
    }

    @GetMapping("sub4")
    public void method4(){
//         2번 직원의 생일 조회 후 출력
        LocalDate birth =dao3.select4();
//        1행 1열의 데이터일 때 LocalDate로도 받을 수 있다




        }
    @GetMapping("sub5")
    public void method5(){
        List<String> countries= dao3.select5();

        countries.forEach(System.out::println);
    }

//    직원들 생일 조회
    @GetMapping("sub6")
    public void method6(){
        List<LocalDate> births = dao3.select6();

        births.forEach(System.out::println);

    }
//    상품의 가격 조회

    @GetMapping("sub7")
    public void method7(){
        List<Double> priceList=dao3.select7();
        priceList.forEach(System.out::println);
    }

    @GetMapping("sub8")
    public void method8(){
        Map<String,Object> row=dao3.select8();
        System.out.println("row = " + row);

        //        Map에 key value쌍에는 순서가 없어 무작위로 출력된다.
    }

    @GetMapping("sub9")
    public void method9(){
        // 1번 상품명, 가격, 카테고리명
        Map<String,Object> map= dao3.select9();
        map.entrySet().forEach(System.out::println);
   }

   @GetMapping("sub10")
    public void method10(){
        MyDto19 dto = dao3.select10();
       System.out.println("dto = " + dto);
   }

   @GetMapping("sub11")
    public void method11(){
        MyDto20 dto= dao3.select11();
       System.out.println("dto = " + dto);
   }
   @GetMapping("sub12")
    public void method12(){
        MyDto21 dto = dao3.select12();
//        2번 고객의 id, name, country가 조회되도록 작성
//     21번 자바빈의 프로퍼티는 세개의 프로퍼티가 (id name country 로 조회되도록 작성)
       System.out.println("dto = " + dto);
    }
    @GetMapping("sub13")
    public void method13(){
        List<Map<String,Object>> rows =dao3.select13();
        for(Map<String,Object> row : rows){
            System.out.println("row = " + row);
        }


        }
    @GetMapping("sub14")
    public void method14(){
        List<Map<String,Object>> rows=dao3.select14();

        rows.forEach(System.out::println);

        for(Map<String,Object>row : rows){
            System.out.println("row = " + row);
//            리스트 출력하는 두 가지 방법
        }
//         1996년 7월 4일에 주문된 상품명, 각 상품의 수량, 상품의 가격 조회
//        orders, orderDetails, products
    }
    @GetMapping("sub15")
    public void method15() {
        List<MyDto22> list = dao3.select15();

        list.forEach(System.out::println);
// List에 MyDto를 넣어서 제각기 여러행 어러열 출력도 가능하다
       }

    @GetMapping("sub16")
    public void method16(){
        List<MyDto23> list = dao3.select16();
        list.forEach(System.out::println);
    }
//       sub16 요청시 1번 카테 상품들이 주문된 날짜,상품명,카테고리명,수량,가격 작성하기
// 날짜, 상품명 순으로 정렬 하기

    @GetMapping("sub17")
    public void method17(){
        String s = dao3.select17();
        System.out.println("dao3 = " + dao3);
//         100번째 id가 없으므로 null값 반환 
    }
    
    @GetMapping("sub18")
    public void method18(){
        Integer s = dao3.select18();
        System.out.println("s = " + s);
//         참조타입으로 넣으면 null값을 반환하지 않음
    }

    @GetMapping("sub19")
    public void method19(){
        dao3.select19();
        System.out.println("dao3 = " + dao3);
    }
    /* 빈의 프로퍼티명과 빈의 쿼리명이 다르면 들어가지 않으므로 유의해서 작성 */

    @GetMapping("sub20")
    public void method20(){
       MyDto24 myDto24=dao3.select20();
    }

}


    


// sql 쿼리 반환값 종류에 따라 다른 mybatis 작성법 예시

//sub1~4 하나의 행 하나의 열
// sub 5~7 하나의 행 여러 열
// 여러 행 하나의 열
// 여러행 여러열

// sub10: 자바빈 객체로 받는 방법 : 자바빈 내 객체는 대소문자 구별 X
// 자바빈에 별칭으로 불러올 수도 있다. -> 그럴려면 Dao에서 별칭 설정