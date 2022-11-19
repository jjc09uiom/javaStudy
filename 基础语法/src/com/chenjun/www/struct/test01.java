package com.chenjun.www.struct;

public class test01 {
    public static void main(String[] args) {
        //打印三角形  5行
        for (int i = 1; i <= 5; i++) {
            for (int i1 = 1; i1 <=5-i; i1++)
                System.out.print(" ");
            for(int i2=1;i2<=(i*2)-1;i2++)
                System.out.print("*");
            System.out.println();
        }


        /*
                for(int i=1;i<=5;i++){
                    for(int j=5;j>=i;j++)   sout(" ");
                    for(int j=1;j<=i;j++)   sout("*");
                    for(int j=1;j<i;j++)    sout("*");
                    sout("\n");
                    }
         */
    }
}
