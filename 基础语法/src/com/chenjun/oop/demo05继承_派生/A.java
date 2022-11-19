package com.chenjun.oop.demo05继承_派生;
//继承
public class A extends B{
    //alt+insert快速调用重写
/*
 @Override  //注解：有功能的注释！
    public int hashCode() {
        return super.hashCode();
    }
 */


    public static void test(){
        System.out.println("A=>test()");
    }
    public static void main(String[] args) {
        //静态方法    //方法的调用只和左边，定义的数据类型有关
        A a = new A();
        a.test();


        //父类的引用指向了子类
        B b = new A();
        b.test();

        //非静态，父类方法会被子类重写
        //静态方法和非静态方法区别很大
    }
}







//重写的方法关键词不能是public（重写后的权限不小于父类）
