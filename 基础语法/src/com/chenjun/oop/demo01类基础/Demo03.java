package com.chenjun.oop.demo01类基础;

public class Demo03 {
    public static void main(String[] args) {
        int add = new Demo03().add(1,2);
        System.out.println(add);
    }

    public  int add(int a,int b){//public static int add(int a,int b)---->int add = Demo03.add(1,2);
        return a+b;
    }
}
