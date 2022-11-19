package com.chenjun.www.Array;

public class Demo02静态_动态初始化 {
    public static void main(String[] args) {
        /*
        1.声明数组
        int[] array = null;
        2.创建数组
        array = new int[10];
        3.给数组中元素赋值
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        nums[3]=4;
        nums[4]=5;
        nums[5]=6;
        nums[6]=7;
        nums[7]=8;
        nums[8]=9;
        nums[9]=10;
         */

        //静态初始化：创建 + 赋值
        int[] a = {1,2,3,4,5,6,7,8};//一旦定义就不可更改
        System.out.println(a[0]);

        //动态初始化：包含默认初始化
        int[] b = new int[10];
        b[0] = 10;
        System.out.println(b[0]);
    }
}
