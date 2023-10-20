package com.example.im_spring20230920.Service;

import com.example.im_spring20230920.dao.MyDao6;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//보통 아래 3개가 서비스 객체를 만들 때 주로 쓰인다
@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)//rollback 옵션
public class MyService1 {
    //이 어노테이션이 있으면 중간에 오류발생시  자동으로 롤백된다
    public void tx1(){
        dao.update1();

        int c =1/0; //runtimeException
//        해당 부분에서 오류가 발생 하므로 rollback되기를 원하는게 목적

        dao.update2();
    }
    private final MyDao6 dao;
}

