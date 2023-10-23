package com.example.im_spring20230920.controller;

import com.example.im_spring20230920.dao.MyDao7;
import com.example.im_spring20230920.domain.MyDto41;
import com.example.im_spring20230920.domain.MyDto42;
import com.example.im_spring20230920.domain.MyDto43;
import com.example.im_spring20230920.domain.MyDto44;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("main37")
public class Controller37 {
    private final MyDao7 dao;

    //     요청할 때 제이슨임을 명시 해줘야 스프링이 제이슨임을 앎
    /* 소괄호에 들어갈게 json 형식
     *  axios.post("/main37/sub1", '{"name":"jones"}',{
     * headers:{
     * "content-type":"application/json"
     * }
     * })
     *
     * axios.post("/main37/syb1",{name:"jones"})
     * 위는 제이슨을 직접 작성, 아래에는 name 객체를 생성한 것
     *
     * js object -> json text : serialize ( 직렬화 ) ( 두번째 예제: object, 첫 예제 : text
     * js text -> js(java) object ( 파싱 )
     * */
    @PostMapping("sub1")
    public void method1(@RequestBody Map<String, Object> map) {
        System.out.println("map = " + map);
    }

    /*3
     * axios.post("/main37/sub2",{name:"lee",age:33,score8.9})
     * 2직렬화
     *'{"name":"lee","age":33,"score":8.9}'
     * 1파싱
     * name:"lee",age:33,score8.9
     * */
    @PostMapping("sub2") // RequestBody 가 parsing을 해줌
    public void method2(@RequestBody Map<String, Object> map) {
        System.out.println("map = " + map);
    }


    /*
     * axios.put("/main37/sub3",{
     * city:"seoul",
     * name:"son",
     * email:"son@gmail.com"
     * })
     * */
    @PutMapping("sub3")
    public void method3(@RequestBody Map<String, Object> map) {
        System.out.println("map = " + map);
    }

    // map이 아닌 자바 빈으로 받아보는 예제!

    // axios.post("/main37/sub4",{
// city:"paris",
// age:30,
// married:true,
// car:null,
// home:{
// address:"seoul",
// price:1000},
//    foods:[
//    "pizza",
//    "burger",
//    "부침개"]
// })
    @PutMapping("sub4")
    public void method4(@RequestBody MyDto42 dto) {
        System.out.println("dto = " + dto);
    }


/*
     js로 ajax 요청하는 코드 실행
     axios.post("/main37/sub5",{
     country:"KoreaNorth",
     score:55,
     phone:"010-6664-2213",
     skill:["요리","잠자기","똥치우기"]
    })


*/

    @PostMapping("sub5")
    public void method5(@RequestBody MyDto43 dto) {
//       country score skill phone
        System.out.println("dto.getCountry() = " + dto.getCountry());
        System.out.println("dto = " + dto.getPhone());
        System.out.println("dto.getSkill() = " + dto.getSkill());
        System.out.println("dto.getScroe() = " + dto.getScroe());
    }

    /*
    axios.post("/main37/sub6",{
    name:"son",
    email:["son@gmail.com',"hm@gmail.com"],
    home:{
    first:"seoul",
    second:"london"
    },
    prive:35.11,
    weight:77.6,
    mairred:true
    })

    */
    @PostMapping("sub6")
    public void method(@RequestBody MyDto44 dto) {
        System.out.println("dto = " + dto);
    }

    /*
         axios.put("/main37/sub7",{
         id:3,
         lastName:"kim",
         firstName:"minjae",
         birthDate:"1999-08-09"
         })
*/
    @PutMapping("sub7")
    public void method(@RequestBody MyDto41 dto) {
        int i = dao.updateEmployees(dto);
        System.out.println("dao.getId() = " + dto.getId());

    }

}
