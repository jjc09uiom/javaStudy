package com.chenjun.www.scanner;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        //输入多个数字，并求出总和和平均数，每输入一个数字用回车确认，通过输入非数字来结束输入并输出执行结果
        Scanner scanner = new Scanner(System.in);
        //和
        double sum = 0;
        //计算输入了多少个数字
        int m = 0;
        while(scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            m++;
            sum+=x;
            System.out.println("你输入了第"+m+"个数据，当前的结果sum="+sum);
        }
        System.out.println(m+"个数的和是："+sum);
        System.out.println(m+"个数的平均数是："+(sum/m));
        scanner.close();
    }
}
