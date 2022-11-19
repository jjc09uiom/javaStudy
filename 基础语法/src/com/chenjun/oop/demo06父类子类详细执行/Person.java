package com.chenjun.oop.demo06父类子类详细执行;

public class Person {
    public void run(){
        System.out.println("run");
    }
//================================
public static void main(String[] args) {
    //一个对象的实际类型是确定的
    //new Student();
    //new Person();
    //可以指向的引用类型不确定


    //Student 能调用的方法都是自己的或者继承父类的
    Student s1 = new Student();

    //Person 是父类，可以指向子类，但是不能调用子类独有的方法
    Person s2 = new Student();
    Object s3 = new Student();

    //对象能执行哪些方法，主要看对象左边的类型，和右边关系不大
    s2.run();//子类重写了父类的方法，执行子类的方法
    s1.run();

    ((Student) s2).eat();//强制转换
    s1.eat();

}

}






/*
多态注意事项：
1.多态是方法的多态，属性没有多态
2.父类和子类，有联系  类型转换异常！ ClassCastException!
3.存在条件：继承关系，方法需要重写，父类引用指向子类对象！ Father s1 = new Son();


不能重写的方法
1.static  方法，属于类，不属于实例
2.final 常量
3.private 方法
 */