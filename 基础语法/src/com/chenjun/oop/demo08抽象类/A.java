package com.chenjun.oop.demo08抽象类;
//抽象类的所有方法：继承了他的子类，都必须要实现他的方法~除非子类也抽象
public class A extends Action{
    @Override
    public void doSomething() {
        System.out.println("do");
    }

    public static void main(String[] args) {
        A a=new A();
        a.hello();
        a.doSomething();
    }
}
