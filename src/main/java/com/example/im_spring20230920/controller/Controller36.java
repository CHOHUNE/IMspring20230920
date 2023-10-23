package com.example.im_spring20230920.controller;

import com.example.im_spring20230920.dao.MyDao7;
import com.example.im_spring20230920.domain.MyDto39;
import com.example.im_spring20230920.domain.MyDto40;
import com.example.im_spring20230920.domain.MyDto41;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("main36")
public class Controller36 {

    private final MyDao7 dao;


    @GetMapping("sub1")
    public void method1() {

    }

    // axios.get("/main36/sub2", { params:{id:5}})
//    /main36/sub2?id=5
    @GetMapping("sub2")
    public void method2(Integer id) {
        Map<String, Object> data = dao.selectByCustomId(id); // dao한테 일 시키기
    }

    //     axios.get("/main36/sub3", {params:{id:2}});
//     axios.reqeust({
//     url:"/main36/sub3",
//    method:"get",
//    params:{id:2
//      })
//     위 두개 방법 모두 같은데 간결하고 편한 걸로 선택하면 된다.
    @GetMapping("sub3")
    public void method3(Integer id) {
        Map<String, Object> data = dao.selectByEmployeeId(id);
        System.out.println("data = " + data);
    }

    //    axios.post("/main36/sub4",{
//    lastName:"손",
//    firstName:"흥민",
//    birthDate:"2020-02-02"
//    },
//
//    {
//        headers:
//        {
//            "content-type":"application/x-www-form-urlencoded"
//        }
//    })
//     post/main36/sub4
//    lastName=손&firstName=흥민&birthDate=2020-02-02
    @PostMapping("sub4")
    public void method4(String lastName,
                        String firstName,
                        LocalDate birthDate) {
        int i = dao.insertEmployee(lastName, firstName, birthDate);
        System.out.println(i + "개 데이터 입력 ");

    }

    //  axios.post("main36/sub5",{
//  name:"milk",
//    price:3.33,
//    category:3,{
//      headers:{
//        "content-type": "application/x-www-form-urlencoded"
//    }
//    })
//     post/main36/ sub5
//     name=라면&price=150
    @PostMapping("sub5")
    public void method5(String name,
                        Double price,
                        Integer category) {
        int r = dao.insertProduct(name, price, category);
    }

//    @RequestMapping(method= RequestMethod.DELETE,value="sub6")

    /*
     * axios */
    @DeleteMapping("sub6")
    public void method6() {
        System.out.println("Controller36.method6");
    }

    //    axios:delete("/main36/sub7")
    /* js 코드 작성 후 브라우저 콘솔에 실행 */
    @DeleteMapping("sub7")
    public void method7() {
        System.out.println("Controller36.method7");
    }

    /* axios.delete("/main36/sub8")
    axios.delete("/main36/sub8",{
    params:{
    name:"son
    }
    })
    * */
    @DeleteMapping("sub8")
    public void method8(String name) {
        System.out.println("name = " + name);
    }

//     PathVariable :  경로에 포함된 데이터

    /* axios.delete("/main36/sub9/son")
    name- > name-> n

    axios.delete("/main36/sub9/lee")
    lee ->name-> n
     * */
    @DeleteMapping("sub9{name}")
    public void method9(@PathVariable("name") String n) {
        System.out.println("n = " + n);
    }

    /*
    * axios.delete("/main36/sub10/3")
    * axios.delete("/main36/sub10/5")
    * axios.delete("/main36/sub10/7")
    *  과 같이 요청 보내는 예제
    *
    *  delete/main36/sub10 으로 요청 보내고 뒤의 숫자는
    *  메소드 아규먼트로 받을 수 있게 콘솔에 출력
    * */
// axios.delete("/main35/sub11/3")
    @DeleteMapping("sub10/{arg}")
    public void method10(@PathVariable String arg){
        System.out.println("str = " + arg);
    } // 매핑값, 패스베이러블, 스트링 모두 작명이 같다면 리퀘스트
//     파람과 같이 패스베리에이블 뒤에 생략 가능


/* axios.delete("main36/sub11/1")
/* axios.delete("main36/sub11/3")
* */
    @DeleteMapping("sub11/{pid}")
    public void method11(@PathVariable Integer pid){
        int c =dao.deleteByProductId(pid);
        System.out.println("c = " + "개 삭제됨");
    }
    /*
    * axios.delete("/main36/sub12/1")
    * axios.delete("/main36/sub12/3")
    * axios.delete("/main36/sub12/5")
    * 1 3 5 고객이 삭제되도록 메소드 작성
    *  */


    @DeleteMapping("sub12/{cid}")
    public void method12(@PathVariable Integer cid){
        int d= dao.deleteByCustomerId(cid);
        System.out.println(d +"개 삭제됨" );
    }
    /*
    *  axios.put("/main36/sub13")
    *  put /main36/sub13
    * */

    /* axios.put("/main36/sub14",{
    name: "son",
    address:"korea"
    },{
    headers:{
     "content-type":"application/x-www-form-urlencoded"
  }
     })*/
//    put /main36/sub14
//    name=son&address=korea
    @PutMapping("sub14")
    public void method14(String name,String address){
        System.out.println("name = " + name);
        System.out.println("address = " + address);
    }

    /*
    * axios.put("/main36/sub15",{
    * city:"seoul",
    * age:78,
    * score:3.14
    * },{
    * headers:{
     "content-type":"application/x-www-form-urlencoded"
    * }
    * });
    * 으로 요청 보내는 예제 작성 */
    @PutMapping("sub15")
    public void method15(MyDto39 dto){
        System.out.println("city = " + dto.getCity());
        System.out.println("age = " + dto.getAge());
        System.out.println("score = " + dto.getScore());
    }

/*   axios.put("/main36/sub16",{
* id:3,name:"햄버거",category:2,price:5000.00
* },{
* headers:{
     "content-type":"application/x-www-form-urlencoded"
     * }
     * });
* */
    @PutMapping("sub16")
    public void method16(MyDto40 dto){
        int rows=dao.updateProduct(dto);
        System.out.println(rows +" 개 수정됨");
    }
    /*
    * axios.put("/main36/sub17",{
    * lastName:"lee",
    * firstName:"kangin",
    * birthDate:"2020-01-01".
    * id:5
    * },P
    * headers :{
     "content-type":"application/x-www-form-urlencoded"
    * }
    * });
    * */
@PutMapping("sub17")
    public void method17(MyDto41 dto){
    int rows = dao.updateEmployees(dto);
    System.out.println("rows = " + rows);
}



}
