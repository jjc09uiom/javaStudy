package com.chenjun.oop.demo07匿名_静态代码块;
//静态导入包~就可以不需要加特殊包名
import static java.lang.Math.random;
import static java.lang.Math.PI;
public class Test {

    public static void main(String[] args) {
        System.out.println(random());
        System.out.println(PI);
    }
}
