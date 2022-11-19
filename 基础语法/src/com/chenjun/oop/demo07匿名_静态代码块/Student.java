package com.chenjun.oop.demo07匿名_静态代码块;
//static
public class Student {
    private static int age;//静态变量   多线程
    private double score;//非静态变量
public void run(){

}
public static void go(){

}
    public static void main(String[] args) {
        Student s1  = new Student();
        System.out.println(Student.age);
        System.out.println(s1.age);
        //静态变量可以直接通过类名调用
        //非静态变量必须通过实例对象调用

    }
}
