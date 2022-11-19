package com.chenjun.www.struct;

public class Demo07while {
    public static void main(String[] args) {
        /*
        1.while
        2.do...while
        3.for
        4.数组增强型for
         */

        int i = 0;
        while(i<100){
            i++;
            System.out.println(i+"\n");

        }

        //while(true)死循环
        int ii = 0;
        int sum = 0;
        //计算1+2+3.。。加到100
        while(ii<=100){
            sum+=ii;
            ii++;
        }
        System.out.println(sum);
    }
}
