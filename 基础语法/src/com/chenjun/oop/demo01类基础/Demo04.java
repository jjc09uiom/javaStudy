package com.chenjun.oop.demo01类基础;
//值传递
public class Demo04 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);//1
        Demo04.change(a);

        System.out.println(a);//1---->Java和c++类似，单纯的值传递
    }

    //返回值为空
    public  static  void change(int a){
        a = 10;

    }
}
