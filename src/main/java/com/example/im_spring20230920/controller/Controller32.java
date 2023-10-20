package com.example.im_spring20230920.controller;

import com.example.im_spring20230920.Service.MyService1;
import com.example.im_spring20230920.dao.MyDao6;
import com.example.im_spring20230920.domain.MyDto38;
import com.example.im_spring20230920.domain.MyDto37;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
@RequestMapping("main32")
public class Controller32 {
    private final MyDao6 dao;
    private final MyService1 component1;
    //    main32/sub1?name=삽입할 값
    @GetMapping("sub1")
    public void method1(MyDto37 dto){
        dao.insert1(dto);
        System.out.println();
    }

//    main32/sub1?name= id를 집어 넣으면 삽입하는 예제
//     dao insert 객체에 dto


//    main32/sub2?lastName=


    @GetMapping("sub2")
    public void method2(MyDto38 dto){
        dao.insert2(dto);

        System.out.println("dto = " + dto);
    }

    @GetMapping("sub3")
    public void method3(){

    }

    @PostMapping("sub4")
    public String method4(MyDto38 dto, RedirectAttributes rttr){
        dao.insert3(dto);

        rttr.addFlashAttribute("message",dto.getEid()+"번 직원등록 완료");
      return "redirect:/main32/sub3";
//        return "redirect:/main32/sub5?eid=" + dto.getEid();
    }


    @GetMapping("sub5")
    public void method5(){
        try{
            component1.tx1();
        }
        finally {
            System.out.println("dao = " + dao.select3());
        }
    }


// ROLLBACK 예제 MyComponent 참고
// 어노테이션이 붙은 메서드를 의도대로 실행 시키려면 같은 빈 안에서 호출
//    을 피해야한다. 따라서 TRANSACTIONAL 을 바깥으로 분리 시켜
//     프록시를 거쳐서 실행 시키기 위해 파일을 분리 해서 작성했다
//     int c =1/0 부분에서 예외를 발생 시켰고 의도대로 코드가 중간에서
//    멈춰서 이체 중간에 멈추게 되었다


}
