package com.chenjun.www.method;

public class Demo02max {
    public static void main(String[] args) {
        /*
        修饰符 返回值类型 方法名（参数类型  参数名）{
            。。。
            方法体
            。。。
            return 返回值；
        }
         */

        //比大小

        System.out.println(max(10,10));
    }
    public static int max(int a,int b){
        if(a==b){
            System.out.println("num1==num2");
            return 0;
        }
        if(a>b) return a;
        else return b;
    }
}
