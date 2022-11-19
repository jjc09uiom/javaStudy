package com.chenjun.www.base;
public class Demo06变量类型_生存周期 {

    //类变量(静态）
    static double salary = 2500;


    //实例变量：从属于对象
    String name;


    //常量
    final double PI = 3.14;//static final double PI = 3.14;

    //main方法
    public static void main(String[] args) {
        //局部变量：必须声明和初始化值，生命周期只在函数内
        int i =10;
        System.out.println(i);
        Demo06变量类型_生存周期 demo06 = new Demo06变量类型_生存周期();
        System.out.println(demo06.name);//未初始化的给出默认值
        System.out.println(salary);
        System.out.println(demo06.PI);
    }

    //其他方法
    public void add(){
        //System.out.println(i);//无法使用main中的i
    }
}
