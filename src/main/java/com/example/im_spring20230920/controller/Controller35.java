package com.example.im_spring20230920.controller;

import com.example.im_spring20230920.domain.MyDto38;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("main35")
@RequiredArgsConstructor
public class Controller35 {
    @GetMapping("sub1")
    public void method1() {

    }

    @GetMapping("sub2")
    public void method2() {
        System.out.println("Controller35.method2");
    }

    @GetMapping("sub3")
    public void method3(String address){
        System.out.println("address = " + address);
    }

    @GetMapping("sub4")
    public void method4(String address,
                        String name,
                        Integer age,
                        String email){
        System.out.println("address = " + address);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("email = " + email);

    }

    @GetMapping("sub5")
    public void method5(String city,
                        Integer id,
                        Double score,
                        String country){
        System.out.println("city = " + city);
        System.out.println("id = " + id);
        System.out.println("score = " + score);
        System.out.println("country = " + country);

    }

    //main35/sub6?eid=3&lastName=son&firstName=hm
    @GetMapping("sub6")
    public void method6(MyDto38 dto38){
    }

    @PostMapping("sub7")
    public void method7(){
    }

    @PostMapping("sub8")
    public void method8(){

    }

    @PostMapping("sub9")
    public void method9(MyDto38 dto){
        System.out.println("dto = " + dto);
    }
    @PostMapping("sub10")
    public void method10(String name, @RequestParam("files[]") MultipartFile[] files){
        System.out.println("name = " + name);
        if(files!=null){
            System.out.println("파일 목록");
            for(MultipartFile file : files){
                if(file.getSize()>0){
                    System.out.println(file.getOriginalFilename());

                }
            }
        }
    }
}

// 페이지 로딩 없이 요청을 할수도 있고 받을 수도 있다.
// 여기까지 배웠던 건 axios 메소드의 requqest, post, postForm 메서드
//axios 사이트 axios api에 명시 되어 있음