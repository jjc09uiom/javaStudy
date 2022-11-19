package com.chenjun.www.struct;


public class Demo10for {
    public static void main(String[] args) {
        //分别计算0-100间的奇数和和偶数和
        int oddSum = 0;
        int evenSum = 0;
        for(int i=0;i<100;i++){
            if(i%2!=0){
                oddSum+=i;
            }else{
                evenSum+=i;
            }
        }
        System.out.println("奇数的和："+oddSum);
        System.out.println("偶数的和："+evenSum);
    }



}
