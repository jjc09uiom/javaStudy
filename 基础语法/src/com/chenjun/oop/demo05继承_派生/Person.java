package com.chenjun.oop.demo05继承_派生;
//Person人 :父类（被继承）/基类
//java类中只有单继承，没有多继承
//在java中，所有类默认继承object类
public class Person {
    //public
    //protected
    //default
    //private



    public int money = 10_0000_0000;
    public void say(){
        System.out.println("说了一句话");
    }

    public void setMoney(int money){
        this.money = money;
    }


    //=============================
    //私有的东西无法被继承
    public Person() {
        System.out.println("Person无参构造执行了");
    }

    protected String name = "chenjun";
    public void print(){
        System.out.println("Person");
    }
}
/*
继承是类和类之间的一种关系，还有依赖、组合、聚合等等
 */
