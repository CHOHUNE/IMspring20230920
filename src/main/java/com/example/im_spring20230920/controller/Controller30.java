package com.example.im_spring20230920.controller;



import com.example.im_spring20230920.dao.MyDao4;
import com.example.im_spring20230920.domain.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("main30")
@RequiredArgsConstructor
public class Controller30 {
    private final MyDao4 dao;

    @GetMapping("sub1")
    public void method1(Integer id) {
        String name = dao.select1(id);
        System.out.println("name = " + name);

    }

    @GetMapping("sub2")
    public void method2(Double from, Double to) {
        List<String> names = dao.select2(from, to);
        names.forEach(System.out::println);
    }

    @GetMapping("sub3")
    public void method3(LocalDate from, LocalDate to) {
        List<String> list = dao.select3(from, to);
        list.forEach(System.out::println);

//        from to에 주문된 상품명 출력 ( 정렬해서,중복없이)
    }

    //main30/sub4?min=1.00&max=80.00
    @GetMapping("sub4")
    public void method4(MyDto25 dto) {
/*
        MyDto25 dto = new MyDto25();

        dto.setMin(1.00);
        dto.setMax(80.00);*/

        List<String> list = dao.select4(dto);
        System.out.println("list.size() = " + list.size());
// dto에 있으면 굳이 메서드 안에 요소를 직접 삽입할 필요가 없다

    }

    //main30/sub5?country1=germany&country2=france ( 이건 예시)
//    country1 또는 country2에 사는고객명들 출력 prepared로
    @GetMapping("sub5")
    public void method5(MyDto26 dto) {
        List<String> list = dao.select5(dto);
        list.forEach(System.out::println);
    }

    //    자바빈이 두개인 경우
//    main30/sub6?from=1996-09-01&to=1996-09-30
    @GetMapping("sub6")
    public void method6(MyDto27 dto1, MyDto28 dto2) {
        Integer num = dao.select6(dto1, dto2);
        System.out.println("num = " + num);
    }

    //    아래 파라메터로 잡히게 dao query  작성하기
//    Dto는 page rows , keyword로   작성
    // main30/sub7?page=2&rows=10&keyword=a
    @GetMapping("sub7")
    public void method7(MyDto29 dto1, MyDto30 dto2) {
        /*
방법1         dto1.setFrom((dto1.getPage()-1 )*dto1.getRows());
        dto2.setKeyword("%"+dto2.getKeyword()+"%");*/

        List<String> names = dao.select7(dto1, dto2);

        System.out.println("dto1.getPage() = " + dto1.getPage());
        names.forEach(System.out::println);
// 방법2는 자바빈에서 직접 연산식을 적어넣는 것이다.
    }

//     main30/sub8?name=son&country=korea
    @GetMapping("sub8")
    public void method8(Mydto31 dto){

        int row=dao.insert1(dto);
        System.out.println(row+"행이 입력 되었습니다");
    }
// main30/sub9
    @GetMapping("sub9")
    public void method9(){

    }
    @PostMapping("sub10")
    public void method10(MyDto32 emp){
        int row =dao.insert2(emp);
        System.out.println(row+"행이 입력됨 ");
    }
     // main30/sub11?id=5 ( 지울 행의 개수 )
    @GetMapping("sub11")
    public void method11(Integer id){
        int rows=dao.delete1(id);
    }

    // /main30/sub12?pid=3
    // 3번 상품이 삭제되는 메소드
    @GetMapping("sub12")
    public void method12(Integer pid ){
        int rows=dao.delete2(pid);
    }

    // /main130/sub13?id=2
    @GetMapping("sub13")
    public void method13(Integer id, Model model){
        // 직원 조회
        // 몇번 직원을 조회 할건지? 파라메터로 Integer
        // model -> jsp(view)
        MyDto33Employee employee= dao.select8(id); //다오 생성
        // 빈 생성
        model.addAttribute("employee",employee);
        // 다오-> 빈 -> 컨트롤러 -> 모델
    }
    @GetMapping("sub13.5")
    public void method(Model model,Integer id){
        MyDto33Employee employee=dao.select8(id);
        model.addAttribute("employee",employee);
    }
    @PostMapping("sub14.5")
    public void method(RedirectAttributes rttr, MyDto33Employee employee){
        int rows= dao.update1(employee);
        if ( rows==1){
            rttr.addFlashAttribute("message","수정완료");
        }
        else{
            rttr.addFlashAttribute("message","수정X");
        }
    }

    @PostMapping("sub14")
    public String method14(MyDto33Employee employee, RedirectAttributes rttr){
        //직원 수정
        int rows=dao.update1(employee);
        //모델에 추가
        if (rows==1){ //update가 잘 되었으면 int rows에서 1을 반환하니까
         rttr.addFlashAttribute("message","정보 수정 완료");
        }else{
            rttr.addFlashAttribute("message","정보가 수정X");
        }
        //쿼리스트링 추가
        rttr.addAttribute("id",employee.getId());
        return "redirect:/main30/sub13";
    }


//     예제
    //main30/sub15?id=3
    // 3번 고객 조회 -> view로 포워딩
    //void 면
    @GetMapping("sub15")
    public void method15(Integer id,Model model){ //모델 파라메터
        MyDto34 temp = dao.select9(id); //빈 추가
        model.addAttribute("customer",temp);
        // view에서는 "" 안에 있는 이름으로 꺼내 쓸수 있다
        // model에 추가하는 메서드
    }
    //POST /main30/sub16
    //고객 정보 수정 -> /main/sub15?id=3 로 리다이렉트

    @PostMapping("sub16")
    // 리다이렉트 하기 위해 String
    public String method(MyDto34 temp,RedirectAttributes rttr){ // 리다이렉트 할때 필요한 메서드
        int rows = dao.update2(temp);

        if ( rows==1){
            rttr.addFlashAttribute("message","정보 수정");

        }
        else{
            rttr.addFlashAttribute("message","정보출력X");

        }
        rttr.addAttribute("id",temp.getCustomerID());
        return "redirect:/main30/sub15"; //리다이렉트 return
    }

}


// preparedStatement 를 쓰는 마이바티스 예제
// dao에 어떻게 써야 하는지~