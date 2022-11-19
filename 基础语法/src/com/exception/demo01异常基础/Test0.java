package com.exception.demo01异常基础;
//异常（程序运行中出现的不期而至的各种状况）
//文件找不到、网络连接失败、非法参数等等
//影响了正常的程序执行流程

//1.检查性异常：用户错误或问题引起的异常（程序员无法预见）
//2.运行时异常：可能被程序员避免的异常
//3.错误ERROR：错误不是异常，而是脱离程序员控制的问题（直接终止进程）

//java把异常当作一个对象来处理，定义了基类java.lang.Throwable(万物皆对象)
//通常分为ERROR & Exception
//捕获异常
public class Test0 {
    public static void main(String[] args) {
        //new Demo01().a();
        //===================
        System.out.println(11/0);
    }

    /*
    public void a(){
         a();
     }
     public void  b(){
         b();
     }
    */

}
