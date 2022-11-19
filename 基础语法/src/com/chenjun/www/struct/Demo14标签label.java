package com.chenjun.www.struct;

public class Demo14标签label {
    public static void main(String[] args) {
        //利用break||continue加标签label的方式实现goto关键词的功能，不需要掌握
        //输出101-150之间的质数
        int count = 0;
        outer:for (int i = 101; i < 150; i++) {
            for(int j = 2; j<i/2;j++){
                if(i%j==0){
                    continue outer;
                }
            }
            System.out.print(i+"\t");
        }
    }
}
