package com.chenjun.www.Array;

import java.util.Arrays;

public class Demo07Arrays类函数使用 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,9090,34343,21,3,23};
        System.out.println(a);
        /*
        Array类的使用
         */
        //打印数组元素
        System.out.println("===================");
        System.out.println(Arrays.toString(a));

        Arrays.sort(a);//从小到大排序
        System.out.println(Arrays.toString(a));

        System.out.println("====="+Arrays.binarySearch(a,9090));


        Arrays.fill(a,0);//全部填充
        System.out.println(Arrays.toString(a));

        Arrays.fill(a,2,4,0);//2-4填充_2,3号
        System.out.println(Arrays.toString(a));
        /*
        fill填充
        equals比较数组中元素值是否相等
        binarySearch对排序好的数组进行二分查找法操作
         */
    }
}
