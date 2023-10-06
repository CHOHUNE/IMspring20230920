package com.example.im_spring20230920.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

import static java.lang.Long.parseLong;
import static java.math.BigInteger.valueOf;

class Solution {
    public String[] solution(String[] str_list) {
        int count=0;
        for(String each:str_list){

            if(each.equals('i')){
                return Arrays.copyOfRange(str_list,0,count);}

            else if(each.equals('l')){
                String[]answer=Arrays.copyOfRange(str_list,count+1,str_list.length);
                }
            count++;
            }


        return new String[0];
    }
}