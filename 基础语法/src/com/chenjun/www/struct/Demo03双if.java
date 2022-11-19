package com.chenjun.www.struct;

import java.util.Scanner;

public class Demo03双if {
    public static void main(String[] args) {

        //考试分数大于60分的及格，小于60分的不及格
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入成绩：");

        int score = scanner.nextInt();
        if (score>60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
        System.out.println("End");
        scanner.close();

    }

}
