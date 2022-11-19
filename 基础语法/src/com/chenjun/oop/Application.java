package com.chenjun.oop;

import com.chenjun.oop.demo10更多.Outer;

public class Application {
    public static void main(String[] args) {
        Outer outer = new Outer();

        //通过外部类实例化内部类
        Outer.Inner inner = outer.new Inner();
        inner.in();
        inner.getID();
    }

}

