package com.chenjun.oop.demo07匿名_静态代码块;
//若加final（常量）修饰父类，则无法继承
public class Person {

    {
        //代码块（匿名代码块）
        System.out.println("匿名代码块");
    }

    static{
        //静态代码块-----类加载的时候即执行一次（非创建对象）
        System.out.println("静态代码块");
    }

    public Person() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person person = new Person();//1.静态2.匿名3.构造
        System.out.println("================");
        Person p1 = new Person();//1.匿名2.构造
    }
}
