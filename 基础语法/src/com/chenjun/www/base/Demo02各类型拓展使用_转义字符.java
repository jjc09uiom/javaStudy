package com.chenjun.www.base;

public class Demo02各类型拓展使用_转义字符 {
    public static void main(String[] args) {
        /*整数拓展：
        二进制0b
        八进制0
        十六进制0x
        十进制


        浮点数拓展：
        float  有限&&离散  存在舍入误差
        double
        最好完全避免使用浮点数进行比较（银行业务类可以采用BigDecimal数学工具类计算）


        字符拓展：
        char c1 = 'a';
        char c2 = '中';
        System.out.println((int)c1);   ->   强制类型转换
        Unicode编码2字节 -> 0-65536（2^16）……asc码表
        U0000~UFFFF
        char c3 = '\u0061'; ======> 'a'
        ****转义字符
        1.'\t'----->制表符
        2.'\n'----->换行
        3.……
         */
        String sa = new String("hello world");
        String sb = new String("hello world");
        System.out.println(sa==sb);
    }
}
