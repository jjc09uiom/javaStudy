package com.chenjun.oop.demo01类基础;
/*
面向对象：
（抽象）
封装
继承
多态
 */

//Demo01类
public class Demo01 {

    //main方法
    public static void main(String[] args) {

    }


    /*
    修饰符 返回值类型   方法名（，，，）{
        //方法体
        return 返回值;
    }
     */
    public String sayHello(){
        return "hello,world";
    }

    public int max(int a,int b){
        return a>b?a:b;
    }

    public void readFile(String file)throws Exception{
        //读取文件流，抛出异常
    }
}

