package com.chenjun.www.struct;

import java.util.Scanner;

public class Demo02单if {
    public static void main(String[] args) {
        /*
        if(布尔表达式){
        //如果布尔值为true就执行
        }
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入内容：");
        String s = scanner.nextLine();
        if(s.equals("Hello")){//少用==去判断字符串！！！！！
            System.out.println(s);
        }
        System.out.println("End");

        scanner.close();
    }
}
