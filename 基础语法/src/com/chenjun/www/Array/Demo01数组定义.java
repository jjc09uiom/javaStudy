package com.chenjun.www.Array;

public class Demo01数组定义 {
    public static void main(String[] args) {
        //变量的类型   变量的名字=变量的值
        //数组类型
        int[]  nums;//1.定义
        int nums2[];//类c，java常用↑

        nums = new int[10];//这里面可以存放10个int类型的数字
                            //创建一个数组
        nums2 = new int[3];
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        nums[3]=4;
        nums[4]=5;
        nums[5]=6;
        nums[6]=7;
        nums[7]=8;
        nums[8]=9;
        nums2[0]=0;
        System.out.println(nums[9]);//输出默认值0 （String类默认值为null）


        int sum = 0;
        for (int i = 0; i < nums.length; i++) {//array.length获取数组长度
            sum=sum+nums[i];
        }
        System.out.println("总和为："+sum);
    }
}
