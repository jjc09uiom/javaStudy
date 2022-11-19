package com.chenjun.www.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextline方式接收：");
        //判断是否还有输入,,,,,,nextline以回车enter作为判断，意味着可以读取空白
        if(scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println("输出的内容为："+str);
        }
        scanner.close();
    }
}
