package com.chenjun.www.struct;

public class Demo08dowhile {
    public static void main(String[] args) {
//do...while和while相比，能够保证程序至少执行一遍
        int  i= 0;
        int sum = 0;
        do{
            sum+=i;
            i++;
        }while(i<=100);
        System.out.println(sum);
    }
}
