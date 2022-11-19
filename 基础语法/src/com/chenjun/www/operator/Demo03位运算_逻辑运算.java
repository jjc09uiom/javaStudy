package com.chenjun.www.operator;
//位运算&逻辑运算&运算短路
public class Demo03位运算_逻辑运算 {
    public static void main(String[] args) {
        /*
        位运算
        A = 0011 1100
        B = 0000 1101

        (与）A&B 0000 1100
        （或)A|B 0011 1101
        (异或）A^B 0011 0001
        （取反）~B 1111 0010
        (左移）<<   ---------   乘二
        (右移）>>   ---------   除二
        ex:  2*8 = 16     2*2*2*2
         */
        int x = 0b00111100;
        int y = 0b00001101;
        String tmp = Integer.toBinaryString(x&y);
        System.out.println(tmp);
        tmp = Integer.toBinaryString(x|y);
        System.out.println(tmp);
        tmp = Integer.toBinaryString(x^y);
        System.out.println(tmp);
        tmp = Integer.toBinaryString(~y);
        System.out.println(tmp);
        System.out.println(~y);
        int k = 2;
        System.out.println(k<<3);//2*8




        /*
        逻辑运算符
        与（&&）或（||）非（！）
         */
        boolean a = true;
        boolean b = false;
        System.out.println(a&&b);
        System.out.println(a||b);
        System.out.println(!(a&&b));
//        System.out.println(a^b);
//        System.out.println(~b);
        //短路运算
        int c = 5;
        boolean d = (c<4)&&(c++<4);
        System.out.println(d);
        System.out.println(c);  //c=5,语句短路，未执行c++


    }
}
