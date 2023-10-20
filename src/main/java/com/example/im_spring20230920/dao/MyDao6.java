package com.example.im_spring20230920.dao;

import com.example.im_spring20230920.domain.MyDto37;
import com.example.im_spring20230920.domain.MyDto38;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface MyDao6 {


    //    main32/sub1?name=삽입할 값
    @Insert("""
            INSERT INTO customers(customerName)
            VALUE (#{name})

            """)
    @Options(
            useGeneratedKeys = true,
            keyProperty = "id")
    //해당 코드가 있어야 번호가 삽입됨
    int insert1(MyDto37 dto);


    @Insert("""
            INSERT INTO employees (lastName)
            VALUES (#{lastName})
            """)
    @Options(useGeneratedKeys = true, keyProperty = "eid")
    int insert2(MyDto38 dto);

    @Insert("""
INSERT INTO
employees (lastName,firstName) 
VALUES (#{LastName},#{FirstName})

""")
    @Options(
            useGeneratedKeys = true,
            keyProperty = "Eid"
    )
    void insert3(MyDto38 dto);


    @Update("""
UPDATE bank
SET money=money -1000
WHERE name='son'
""")
    void update1();
@Update("""
UPDATE bank
SET money=money+1000
WHERE name='kim'
""")
    void update2();

@Select("""

SELECT *
FROM bank 
ORDER BY name
""")
    List<Map<String,Object>> select3();

//    int insert1(String name);
    //String 으로 파라메터를  받으면 name을 여러번 쓸수 없음
    // Dto를 써야한다.
}
