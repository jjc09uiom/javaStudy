package com.chenjun.oop.demo02构造器;

public class Person {
//一个类即使什么都不写，也会自动存在一个方法
    //显示的定义构造器
    String name;
int age;

    //s实例化初始值
    // 1.使用new关键字，必须要有构造器
    public Person(){
        this.name = "陈钧";
    }

    //有参构造:一旦定义了有参构造，无参构造就必须显示定义
    public Person(String name){
        this.name = name;
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
}
/*
public static void main(String[] args) {
        //new一个实例化对象
    Person person = new Person();
    Person one = new Person("chenjun");
        System.out.println(person.name);
        System.out.println(one.name);
    }

    构造器：
    1.和类名相同
    2.没有返回值
    作用：
    1.new的本质在调用构造器
    2.初始化对象的值
    注意点：
    1.定义了有参构造之后，想使用无参构造，就必须显示的定义一个无参 的构造

    Alt +Insert
 this.xx  = xx;
 */




