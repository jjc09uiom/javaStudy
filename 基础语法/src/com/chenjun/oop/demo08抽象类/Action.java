package com.chenjun.oop.demo08抽象类;
//abstract 抽象类  ：类extends  单继承（局限性）   接口多继承
public abstract class Action {
    //约束~有人帮忙实现
    //abstract 抽象方法，只有方法名字，没有方法的实现
    public abstract void doSomething();

    //1.不能new出来这个抽象类，只能靠子类去实现他：约束！（无法实例化）
    //2.抽象类中可以写普通方法
    //3.抽象方法必须在抽象类中
    //抽象的抽象：约束~


    //思考  抽象类存在构造器吗
    //存在的意义   抽象出来~提高开发效率
    public void hello(){

        System.out.println("hello");
    }

}
