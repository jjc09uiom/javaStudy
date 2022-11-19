package com.chenjun.www.method;

import javax.script.ScriptContext;
import java.util.Scanner;

public class Demo01add {
    public static void main(String[] args) {
        int sum = add(1,2);
        System.out.println("1+2="+sum);
        System.out.println("请输入两个数：");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        sum = add(a,b);
        System.out.println("两个数的和sum="+sum);
        scanner.close();
        test();
    }
    //加法
    public static int add(int a,int b){
            return a+b;
    }
    //设计方法的原则：保持方法的原子性，就是一个方法只完成一个功能，有利于后期的拓展


    //输出1000以内能被5整除的数
    public static void test(){
        for (int i = 0,sum =0; i <= 1000; i++) {
            if(i%5==0) {
                System.out.print(i+"\t");
                sum++;
                if(sum%3==0)System.out.println();
            }

        }
    }
}
