package com.chenjun.www.base;

public class Demo04大数操作_下划线分割 {
    public static void main(String[] args) {
        //操作大数注意溢出
        //JDK7可以在数字间加下划线分割
        int money = 10_0000_0000;
        int years = 20;
        int total = money * years;
        System.out.println(total);
        long total1 = money * years;//默认还是int，在转换之前就已经溢出
        long total2 = money*(long)years;
        System.out.println(total2);
    }
}
