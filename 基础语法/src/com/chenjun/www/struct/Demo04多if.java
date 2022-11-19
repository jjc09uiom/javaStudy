package com.chenjun.www.struct;

import java.util.Scanner;

public class Demo04多if {
    public static void main(String[] args) {
        //考试分数大于60分的及格，小于60分的不及格
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入成绩：");

        int score = scanner.nextInt();
        if(score==100){
            System.out.println("恭喜满分！");
        }else if(score<100 && score>=90){
            System.out.println("A");
        }else if(score<90 && score>=80){
            System.out.println("B");
        }else if(score<80 && score>=70){
            System.out.println("C");
        }else if(score<70 && score>=60){
            System.out.println("D");
        }else if(score<60){
            System.out.println("不及格");
        }else{
            System.out.println("输入不合法！");
        }
        System.out.println("End");
        scanner.close();
    }
}
