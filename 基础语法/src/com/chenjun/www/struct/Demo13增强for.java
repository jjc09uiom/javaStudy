package com.chenjun.www.struct;

public class Demo13增强for {
    /*---->主要用于数组或集合的输出
    for(声明语句：表达式）{
    //代码句子
    }
     */
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        for(int x:numbers)
            System.out.println(x);
    }
}
