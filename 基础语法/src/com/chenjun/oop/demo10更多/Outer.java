package com.chenjun.oop.demo10更多;

public class Outer {

    private int id;
    public void out(){
        System.out.println("这是外部类的方法");
    }
    public class Inner{

        public void in(){
            System.out.println("这是一个内部类的方法");
        }

        //获得外部类的私有属性~
        public void getID(){
            System.out.println(id);
        }
    }

    public static class Inner1{
        //只能访问外部类中的静态属性，非静态属性则无法访问
        // （静态内部类在非静态属性实例化之前出现）

    }

    //局部内部类
    public void method(){
        class Inner2{
            public void in2(){

            }
        }
    }


}
//一个java类中只能有一个public class类，但是可以有多个class类
class A{


}
