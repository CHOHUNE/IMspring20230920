package com.example.im_spring20230920.controller;


import com.example.im_spring20230920.Service.Myservice2;
import com.example.im_spring20230920.dao.MyDao8;
import com.example.im_spring20230920.domain.MyDto33Employee;
import com.example.im_spring20230920.domain.MyDto45;
import lombok.RequiredArgsConstructor;
import org.eclipse.tags.shaded.org.apache.bcel.generic.LDIV;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("main39")
public class Controller39 {

    private final MyDao8 dao;

    private final Myservice2 service;
    @GetMapping("sub0")
    public void method0(){

    }
    @GetMapping("sub1")
//  @ResponseBody 는 생략 가능하다
//    spring이 객체타입을 보고 응답본문으로 해석할지, view로 해석할지 이미 알고있기 때문
    public ResponseEntity method1(){
//        ResponseEntity
//        응답 코드, 응답 본문 작성 가능한 객체
        return ResponseEntity.status(200).build();

    }

    @GetMapping("sub2")
    public ResponseEntity method2(){
        return ResponseEntity.notFound().build();
//        return ResponseEntity.internalServerError();
    }
    @GetMapping("sub3")
    public ResponseEntity method3(){
        return ResponseEntity.internalServerError().build();
    }

    @GetMapping("sub4")
    public ResponseEntity<MyDto45> method4(Integer id) {
        MyDto45 data = dao.selectByProductId2(3);
//        return ResponseEntity.status(200).body(data);
//        return ResponseEntity.ok().body(data);
//        return ResponseEntity.ok(data);

        if(data==null){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(data);
        }
    }

    @GetMapping("sub5")
    public ResponseEntity method5(){
        if(Math.random()>0.5){
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.internalServerError().build();
        }
    }

    @PostMapping("sub6")
    public ResponseEntity method6(@RequestBody MyDto33Employee dto){
//        json -> java ( parsing )
        int rows=service.add(dto);
        if(service.validate(dto)){
            if(rows==1){
                return ResponseEntity.ok().build();
            }else{
                return ResponseEntity.internalServerError().build();
            }

        }else{
            return ResponseEntity.badRequest().build();
        }
}}
