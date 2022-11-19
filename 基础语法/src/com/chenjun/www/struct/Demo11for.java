package com.chenjun.www.struct;

public class Demo11for {
    public static void main(String[] args) {
        //用while/for输出1-1000之间能被5整除的数，并且每行输出三个
        for (int i = 1,j = 0; i <= 1000; i++) {
            if(i % 5==0){
                j++;
                if(j<3) System.out.print(i+"\t");
                else{
                    System.out.println(i);
                    j=0;
                }
            }
        }
/*
        for (int i = 0; i <= 1000; i++) {
            if(i%5==0) System.out.print(i+"\t");
            if(i%(5*3)==0) System.out.println();
        }
 */

    }
}
